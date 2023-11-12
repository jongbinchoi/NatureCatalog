<template>
  <div class="about">
    <div class ="head">
      <h1>Naturecatalog</h1>
     <h2>Our nature, their expression</h2>
    </div>
  <div class = "cardcontainer">
    <div class = "card">김재호</div>
    <div class = "card">최종빈</div>
    <div class = "card">강연준</div>
    <div class = "card">나우진</div>
    <div class = "card">이도현</div>
  </div>
  </div>
</template>

<style scoped>
body{
  margin: 0;
  padding: 0;
}
.head{
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin-top: 100px;
  margin-bottom: 100px;
}
.cardcontainer{
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  height: 50vh;
  background: darkgrey;
  transition: transform 0.5s ease-in-out;
}
.card{
  min-width: 40vh; /* 각 슬라이드의 최소 너비 */
  height: 40vh; /* 슬라이드의 높이 */
  background-color: lightblue;
  border: 1px solid #000;
  text-align: center;
  line-height: 300px; /* 텍스트를 세로 중앙에 위치시킴 */
}
</style>
