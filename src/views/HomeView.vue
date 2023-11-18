<template>
<div class = 'slider'>
  <div class = 'photo'><img src="../assets/photo1.jpg" height="800" width="600"></div>
  <div class = 'main1'></div>
</div>
</template>

<style scoped>
.slider{
  width: 100%;
  height: 1040px;
  margin: 0 auto;
  border-top: 1px solid #000;
  background: #000;
}
.main1{
  width: 360px;
  height: 720px;
  margin: 0 auto;
  background: #000;
  position: fixed;
  bottom: -40%;
  right: 25%;
  color: #fff;
  font-size: 50px;
  font: bold;
  text-align: center;
  text-justify: center;
  rotate: -45deg;

}
.photo{
  width: 100%;
  height: 70%;
  margin: 0 auto;
  position: fixed;
  bottom: 21%;
  right: -34%;
  background: #000;
}
</style>
