<template>
  <body>
    <nav class = 'MenuBar'>
      <img src="../assets/Naturecatalog.png" alt="logo">
      <div class="MenuBar-text-container">
        <div class="MenuBar-text">
          <router-link to="/"><p>Home</p></router-link>
        </div> |
        <div class="MenuBar-text">
          <router-link to="/about"><p>About</p></router-link>
        </div>|
        <div class="MenuBar-text">
          <router-link to="/exhibitions"><p>Exhibition</p></router-link>
        </div>|
        <div class="MenuBar-text">
          <router-link to="/forum"><p>forum</p></router-link>
        </div>|
        <div class="MenuBar-text">
          <router-link to="/Wujin"><p>Wujin</p></router-link>
        </div>|
        <div class="MenuBar-text">
          <router-link to="/Dohyon"><p>Dohyon</p></router-link>
        </div>
      </div>
      <div class="MenuBar-login">
        <router-link to="/login">login</router-link>
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

a {
  display: block;
  width: auto;
  color: #fff;
  text-decoration: none;
}
a:hover {
  color: #00ff15;
}
nav a.router-link-exact-active[aria-current] {
  color: #00ff15;
}

.MenuBar {
  /*메뉴바 상단으로 고정*/
  display: flex;
  justify-content: space-between; /* 아이템들 사이에 여백을 동일하게 분배 */
  padding: 0 auto;
  background-color: #0a3711;
  height: 10%;
  width: 100%;

  align-items: center; /* 세로 중앙 정렬 */
  text-align: center;
}
.MenuBar img {
  display: flex;
  float:left;
  height: 100%;
  width: 10%;
  padding: 0 auto;
  justify-self: start;
}
.MenuBar-text-container {
  display: flex;
  height: 100%;
  width: 30%;
  font-size: 24px;
  font-weight: sans-serif;
  color: #ffffff;
  /*컨텐츠 중앙정렬*/
  align-items: center; /* 세로 중앙 정렬 */
  justify-content: center; /* 가로 중앙 정렬 */
  text-align: center;
}
.MenuBar-text{
  margin: 0 15px;
  color: #fff000;
  text-decoration: none;
}
.MenuBar-text:hover{
  color: #007BFF;
}
.MenuBar-login:hover{
  background-color: #007BFF;
}
.MenuBar-login {
  display: block;
  height: 100%;
  width: 10%;
  font-size: 24px;
  font-weight: sans-serif;
  color: white;
  border: none;
  padding: 0 auto;
  text-align: center;
  text-decoration: none;
  font-size: 16px;
}
nav a.router-link-exact-active {
  color: #ffffff;
}
</style>
