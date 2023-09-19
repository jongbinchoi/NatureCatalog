<template>
  <div>
    <nav id = 'MenuBar'>
    <img alt="logo1" src="./assets/image.png" marign="0" pading="0" width="180"><br>
    <div id="MenuBar-text">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> |
      login
    </div>
  </nav>
  <div style="padding-top: 120px;"></div>
  <router-view/>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

body {
  margin: 0px auto;
  padding: 0px;
}

#MenuBar {
  /*메뉴바 상단으로 고정*/
  position: fixed;
  top: 0px;
  left: 0px;
  right: 0px;

  margin: 0 auto;
  padding: 0 auto;
  height: 80px;
  width: 100%;

  background-color: #ffffff;
}
#MenuBar-text {
  background-color: #046325;
  position: absolute;

  height: 40px;
  width: 100%;
  font-size: 20px;
  font-weight: bold;
  color: #000000;
  text-align: center;
  text-decoration: none;
  margin: 0px auto;
}

nav a.router-link-exact-active {
  color: #42b983;
  line-height: 40px;
}
</style>
