<template>
  <div class = "head">NatureCatalog</div>
  <div class="slider">
    <div class="slider-item" v-for="(item, index) in items" :key="index" :style="{ backgroundImage: 'url(' + item + ')' }" v-show="currentSlide === index">
    <h1>{{ item.name }}<br><small>{{ item.class }}</small></h1>
    <p>{{ item.about }}</p>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      items: [
        { name: '강연준', class: 'Back-End', about: '강연준입니다.' },
        { name: '최종빈', class: 'Back-End', about: '김민수입니다.' },
        { name: '김재호', class: 'Front-End', about: '김영훈입니다.' },
        { name: '나우진', class: 'Front-End', about: '김영훈입니다.' },
        { name: '김도현', class: 'Front-End', about: '김영훈입니다.' }
      ],
      currentSlide: 0,
      slideInterval: null
    }
  },
  mounted () {
    this.startSlider()
  },
  methods: {
    startSlider () {
      this.slideInterval = setInterval(() => {
        this.nextSlide()
      }, 3000) // 3초마다 슬라이드 전환
    },
    nextSlide () {
      this.currentSlide = (this.currentSlide + 1) % this.items.length
    }
  }
}
</script>

<style scoped>
body{
  margin: 0;
  padding: 0;
}
small{
  font-size: 20px;
  color: #999999;
}
.head{
  margin: 20px;
  font-size: 50px;
  position: relative;
  border-bottom: 1px solid #000;
  min-height: 1px;
  padding-right: 15px;
  padding-left: 15px;
  padding-bottom: 20px;
}
.slider {
 background: #0a3711;
  /* 슬라이더 전체 스타일 */
  width: 100%;
  height: 40em;
  position: relative;
  overflow: hidden;
  display: flex;
  justify-content: center;
  align-items: center;
}
.slider-item {
  /* 각 슬라이더 아이템 스타일 */
  background-size: cover;
  background-position: center;
  background: gainsboro;
  min-width: 95%;
  height: 90%;
  margin: 0 1em;
  transition: all 0.6s ease-in-out;
}
</style>
