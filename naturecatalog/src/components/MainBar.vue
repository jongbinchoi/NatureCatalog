<template>
    <nav id = 'MenuBar'>
      <div id="MenuBar-text">
          <router-link to="/">Home</router-link> |
          <router-link to="/about">About</router-link> |
          <router-link to="/exhibitions">Exhibition</router-link> |
          <router-link to="/exhibitions">Exhibition</router-link> |
      </div>
      <div id="MenuBar-login">
        <router-link to="/login">Home</router-link>
      </div>
    </nav>
</template>

<script>
export default {
  name: 'MenuBar'
}
</script>

<style scoped>
#MenuBar {
  /*메뉴바 상단으로 고정*/
  position: absolute;
  display: flex;

  top: 0px;
  left: 0px;
  right: 0px;

  margin: 0 auto;
  padding: 0 auto;
  height: 80px;
  width: 100%;

  background-color: #046325;
  /*컨텐츠 중앙정렬*/
  align-content: center;
}
#MenuBar-text {
  height: 100%;
  width: 60%;
  font-size: 24px;
  font-weight: sans-serif;

  color: #000000;
  /*컨텐츠 중앙정렬*/
  justify-content: center;
  align-content: center;
  text-align: center;
}
#MenuBar-login{
  height: 100%;
  width: 60%;
  background-color: #007BFF;
  color: white;
  border: none;
  padding: auto;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

nav a.router-link-exact-active {
  color: #42b983;
  line-height: 40px;
}
</style>
