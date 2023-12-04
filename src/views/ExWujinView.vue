<template>
  <div class="wujin">
    <div class="image-container" :style="{ backgroundImage: 'url(' + images[currentIndex] + ')' }">
    </div>
    <div class="text" >↑ 여기를 눌러주세요</div>
    <button type="button" class="btn" @click="changeImage"></button>
  </div>
</template>
<script>
export default {
  data () {
    return {
      currentIndex: 0,
      images: [
        require('../assets/wujin_1.png'),
        require('../assets/wujin_2.png'),
        require('../assets/wujin_3.png'),
        require('../assets/wujin_4.png'),
        require('../assets/wujin_5.png'),
        require('../assets/wujin_6.png'),
        require('../assets/wujin_7.png')
      ]
    }
  },
  methods: {
    changeImage () {
      this.currentIndex = (this.currentIndex + 1) % this.images.length
    }
  }
}
</script>
<style>
.wujin {
  width: 100vw;
  height: 100vh;
  display: flex;
  position: relative;
  align-items: center;
  justify-content: center;
}

.image-container {
  width: 100%;
  height: 100%;
  background-size: cover;
  background-position: center;
  cursor: pointer;
}
.btn{
  position:absolute;
  width: 45px;
  height: 18px;
  bottom: 320px;
  right: 125px;
}
.text{
  position:absolute;
  background-color:transparent;
  width: 150px;
  height: 27px;
  bottom: 280px;
  right: 20px;
}
</style>
