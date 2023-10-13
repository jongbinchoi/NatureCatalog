<template>
  <body>
    <nav id = 'MenuBar'>
      <img src="../assets/Naturecatalog.png" alt="logo">
      <div id="MenuBar-text">
          <router-link to="/">Home</router-link> |
          <router-link to="/about">About</router-link> |
          <router-link to="/exhibitions">Exhibition</router-link> |
          <router-link to="/forum">forum</router-link> |
      </div>
      <div id="MenuBar-login">
        <router-link to="/login">Home</router-link>
      </div>
    </nav>
  </body>
</template>

<script>
export default {
  name: 'MenuBar'
}
</script>

<style scoped>
#MenuBar {
  /*메뉴바 상단으로 고정*/
  display: flex;
  justify-content: space-around; /* 아이템들 사이에 공간을 동일하게 분배 */
  padding: 0 auto;
  background-color: #046325;
  height: 80px;
  width: 100%;
}
#MenuBar img {
  height: 100%;
  width: 20%;
  padding: 0 auto;
}
#MenuBar-text {
  display: flex;
  height: 100%;
  width: 30%;
  font-size: 24px;
  font-weight: sans-serif;

  color: #000000;
  /*컨텐츠 중앙정렬*/
  align-items: center; /* 세로 중앙 정렬 */
  justify-content: center; /* 가로 중앙 정렬 */
  text-align: center;
}
#MenuBar-login{
  display: flex;
  height: 90%;
  width: 10%;
  background-color: #007BFF;
  color: white;
  border: none;
  padding: 0 auto;
  text-align: center;
  text-decoration: none;
  font-size: 16px;
}

nav a.router-link-exact-active {
  color: #42b983;
  line-height: 40px;
}
</style>
