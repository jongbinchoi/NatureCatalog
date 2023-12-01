<template>
    <div class = "container">
        <canvas id="c"></canvas>
    </div>
</template>


<script>
//업무분할 때문에
import * as THREE from 'three';
import * as BufferGeometryUtils from 'three/addons/utils/BufferGeometryUtils.js';
import { OrbitControls } from 'three/addons/controls/OrbitControls.js';

export default {
    mounted() {
        this.initDraw()
    },
    methods: {
        //그림 그리기
        initDraw() {
            //카메라, 렌더러, 컨트롤러, 씬 생성
            const canvas = document.querySelector('#c');
            const renderer = new THREE.WebGLRenderer({ canvas });
            const fov = 60;
            const aspect = 2;
            const near = 0.1;
            const far = 10;
            const camera = new THREE.PerspectiveCamera(fov, aspect, near, far);
            camera.position.z = 2.5;
            //카메라 컨트롤러 생성
            const controls = new OrbitControls(camera, canvas);
            controls.enableDamping = true;
            controls.enablePan = false;
            controls.minDistance = 1.2;
            controls.maxDistance = 4;
            controls.update();
            //씬 생성
            const scene = new THREE.Scene();
            //배경색 설정
            scene.background = new THREE.Color('black');
            {
                const loader = new THREE.TextureLoader();
                const texture = loader.load('https://threejs.org/manual/examples/resources/images/world.jpg', render);
                const geometry = new THREE.SphereGeometry(1, 64, 32);
                const material = new THREE.MeshBasicMaterial({ map: texture });
                scene.add(new THREE.Mesh(geometry, material));

            }
            //apu로 데이터 불러오기
            async function loadFile(url) {
                const req = await fetch(url);
                return req.text();
            }
            function parseData(text) {
                const data = [];
                const settings = { data };
                let max;
                let min;

                text.split('\n').forEach((line) => {

                    const parts = line.trim().split(/\s+/);
                    if (parts.length === 2) {

                        settings[parts[0]] = parseFloat(parts[1]);
                    } else if (parts.length > 2) {
                        const values = parts.map((v) => {
                            const value = parseFloat(v);
                            if (value === settings.NODATA_value) {
                                return undefined;
                            }
                            max = Math.max(max === undefined ? value : max, value);
                            min = Math.min(min === undefined ? value : min, value);
                            return value;
                        });
                        data.push(values);
                    }
                });
                return Object.assign(settings, { min, max });
            }
            //오브젝트 추가
            function addBoxes(file) {
                const { min, max, data } = file;
                const range = max - min;
                const lonHelper = new THREE.Object3D();
                scene.add(lonHelper);
                const latHelper = new THREE.Object3D();
                lonHelper.add(latHelper);
                const positionHelper = new THREE.Object3D();
                positionHelper.position.z = 1;
                latHelper.add(positionHelper);
                const originHelper = new THREE.Object3D();
                originHelper.position.z = 0.5;
                positionHelper.add(originHelper);
                const lonFudge = Math.PI * .5;
                const latFudge = Math.PI * -0.135;
                const geometries = [];
                data.forEach((row, latNdx) => {
                    row.forEach((value, lonNdx) => {
                        if (value === undefined) {
                            return;
                        }
                        const amount = (value - min) / range;
                        const boxWidth = 1;
                        const boxHeight = 1;
                        const boxDepth = 1;
                        const geometry = new THREE.BoxGeometry(boxWidth, boxHeight, boxDepth);
                        lonHelper.rotation.y = THREE.MathUtils.degToRad(lonNdx + file.xllcorner) + lonFudge;
                        latHelper.rotation.x = THREE.MathUtils.degToRad(latNdx + file.yllcorner) + latFudge;
                        positionHelper.scale.set(0.005, 0.005, THREE.MathUtils.lerp(0.01, 0.5, amount));
                        originHelper.updateWorldMatrix(true, false);
                        geometry.applyMatrix4(originHelper.matrixWorld);
                        geometries.push(geometry);
                    });
                });
                const mergedGeometry = BufferGeometryUtils.mergeBufferGeometries(
                    geometries, false);
                    //색상설정
                const material = new THREE.MeshBasicMaterial({ color: '#00ff15' });
                const mesh = new THREE.Mesh(mergedGeometry, material);
                scene.add(mesh);
            }
            loadFile('https://threejs.org/manual/examples/resources/data/gpw/gpw_v4_basic_demographic_characteristics_rev10_a000_014mt_2010_cntm_1_deg.asc')
                .then(parseData)
                .then(addBoxes)
                .then(render);
            //사이즈 조정 후 랜더링
            function resizeRendererToDisplaySize(renderer) {
                const canvas = renderer.domElement;
                const width = canvas.clientWidth;
                const height = canvas.clientHeight;
                const needResize = canvas.width !== width || canvas.height !== height;
                if (needResize) {
                    renderer.setSize(width, height, false);
                }
                return needResize;
            }
            let renderRequested = false;
            function render() {
                renderRequested = undefined;
                if (resizeRendererToDisplaySize(renderer)) {
                    const canvas = renderer.domElement;
                    camera.aspect = canvas.clientWidth / canvas.clientHeight;
                    camera.updateProjectionMatrix();
                }
                controls.update();
                renderer.render(scene, camera);
            }
            render();
            function requestRenderIfNotRequested() {
                if (!renderRequested) {
                    renderRequested = true;
                    requestAnimationFrame(render);
                }
            }
            controls.addEventListener('change', requestRenderIfNotRequested);
            window.addEventListener('resize', requestRenderIfNotRequested);
        }
    }
}
</script>

<style scoped>
#c {
    width: 100%;
    height: 100%;
    display: block;
}
.container {
    width: 100%;
    height: 100%;
    margin: 0 auto;
}
</style>
