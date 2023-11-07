<template>
  <div class="background-image app">
    <div :style="backgroundStyle"></div>
    <img :src="images[currentIndex]" @click="changeImage"/>
  </div>
</template>

<script>
export default {
  data () {
    return {
      currentIndex: 0,
      images: [
        './assets/wujin_1.png',
        './assets/wujin_2.png'
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

<style scoped>
.background-image {
  width: 100%;
  height: 100%;
}
</style>
