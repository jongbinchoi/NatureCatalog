<template>
    <h1>3D</h1>
    <canvas id="canvas" width="300" height="300"></canvas>

</template>

<script type = "module">
    //three 패키지 추가
    //import {GLTFLoader} from 'GLTFLoader'
    import * as THREE from 'three'

    //THREE.Scene객체 생성 후 위치 설정
    let scene = new THREE.Scene()
    let renderer = new THREE.WebGLRenderer({
        canvas : document.querySelector('#canvas')
    })

    //카메라, 조명 추가 PerspectiveCamera()원근법 추가 카메라
    let camera = new THREE.PerspectiveCamera(30,1);

    //gltf로 오브젝트 추가
    let loader = new GLTFLoader()
    loader.load('../assets/death_earth/scene.gltf',function(gltf){
        scene.add(gltf.scene)

         //랜더링
        renderer.render(scene,camera)  
    })
    
   
</script>

<style>
</style>