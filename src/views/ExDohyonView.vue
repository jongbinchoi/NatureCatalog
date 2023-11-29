<template>
  <button @click="incrementDateAndChangeImage">click me</button>
  <div class="date-container">
    <h1><span id="date"></span></h1>
  </div>
  <div class="image-container">
    <img src="../assets/BG.jpg" alt="First Image" class="image1">
    <img src="../assets/P1.png" alt="Second Image" class="image2">
    <img src="../assets/C1.png" alt="Third Image" class="image3">
  </div>



</template>

<script>
export default {
  name: 'dohyonView',

  data() {
    return {
      clickCount : 0,
      currentDate : new Date(),
      tenYearImages : ["../assets/P1.png", "../assets/P2.png", "../assets/P3.png", "../assets/P4.png"], // 10년마다 변경되는 이미지 경로 목록
      twoYearImages : ["../assets/C1.png", "../assets/C2.png", "../assets/C3.png", "../assets/C4.png", "../assets/C5.png"] // 2년마다 변경되는 이미지 경로 목록
    }
  },
  methods: {
    incrementDateAndChangeImage() {
    this.clickCount++;
    this.currentDate.setFullYear(this.currentDate.getFullYear() + 1);
    document.getElementById('date').innerText = this.currentDate.toISOString().split('T')[0];
    // 10년마다 이미지 변경
    if(this.clickCount < 20){
      if(this.clickCount % 5 === 0) {
        var tenYearImageIndex = (this.clickCount / 5) % this.tenYearImages.length;
        var tenYearImage = document.querySelectorAll('.image-container img')[1]; // 두 번째 이미지 선택
        tenYearImage.src = this.tenYearImages[tenYearImageIndex];
      }
    }
    // 2년마다 이미지 변경
    if(this.clickCount < 10){
      if(this.clickCount % 2 === 0) {
        var twoYearImageIndex = (this.clickCount / 2) % this.twoYearImages.length;
        var twoYearImage = document.querySelectorAll('.image-container img')[2]; // 세 번째 이미지 선택
        twoYearImage.src = this.twoYearImages[twoYearImageIndex];
      }
    }
    }
  }
}
</script>

<style>
    .image-container {
      position: relative;
      width: 300px; /* 컨테이너의 너비를 설정 */
      height: 200px; /* 컨테이너의 높이를 설정 */
    }

    .image-container img {
      position: absolute;
    }

    .image1 {
      z-index: 1; /* 첫 번째 이미지를 뒤에 배치 */
      top: 100px;
      left: 100px;
      height: 580px;
      width: 1000px;
    }

    .image2 {
      z-index: 2; /* 두 번째 이미지를 앞에 배치 */
      top: 500px;
      left: 550px;
      height: 100px;
      width: 100px;
    }

    /* 추가된 이미지 컨테이너 스타일 */
    .image3 {
      z-index: 3; /* 세 번째 이미지를 앞에 배치 */
      top: 500px;
      left: 650px;
      height: 100px;
      width: 100px;
    }

    /* 날짜 표시를 위한 스타일 */
    .date-container {
      position: absolute;
      top: 100px; /* BG 이미지 위의 적절한 위치에 배치 */
      left: 50%; /* 중앙 정렬 */
      transform: translateX(-50%); /* 정확한 중앙 정렬을 위해 */
      z-index: 3; /* 날짜를 이미지 위에 배치 */
      background-color: rgba(255, 255, 255, 0.7); /* 배경색과 투명도 추가 */
      padding: 10px;
      border-radius: 5px;
    }

  </style>
