<template>
  <nav>
    <img src="../assets/Naturecatalog.png" alt="logo">
    <ul class="MenuBar-text-container">
      <li><router-link to="/">Home</router-link></li> |
      <li><router-link to="/about">About</router-link></li> |
      <li><router-link to="/exhibitions">Exhibition</router-link></li> |
      <li><router-link to="/forum">forum</router-link></li>
    </ul>
    <ul class="MenuBar-util-container">
      <li><router-link to="/login">Login</router-link></li>
    </ul>
  </nav>
</template>

<script>

</script>

<style scoped>
 * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
 }
a {
  display: block;
  width: auto;
  color: #fff;
  text-decoration: none;
}
a:hover {
  color: #00ff15;
}

router-link-active {
  color: #00ff15;
}


ul {
  list-style: none;
}
li {
  display: inline-block;
  margin: 0 10px;
  font-size: 20px;
}
nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: #0a3711;
  height: 80px;
  padding: 0 20px;
  box-sizing: border-box;
}
nav img {
  position: absolute;
  width: 10%;
  object-fit: cover;
}
.MenuBar-text-container {
  display: relative;
  justify-content: center; /* 가로 중앙 정렬 */
  align-items: center;
  list-style: none;
  flex-grow: 1; /* 나머지 공간을 모두 차지하도록 설정 */
  color: #fff;
  font-size: 1.5em;
}
.MenuBar-util-container a {
  font: bold 16px/1 sans-serif;
  text-decoration: none;
  color: #fff;
  border: 2px solid #fff;
  padding: 10px 20px;
  display: inline-block;
  transition: all 0.3s ease-in-out;
  border-radius: 20% 20%;
}

.MenuBar-util-container a:hover {
  background: #fff;
  color: #000;
  transition: all 0.3s ease-in-out;
}
@media screen and (max-width: 768px) {
  nav img {
   display: none;
  }
  .MenuBar-text-container {
    font-size: 12px;
  }
  .MenuBar-util-container {
    font-size: 12px;
  }
  ul {
  list-style: none;
  }
  li {
  display: inline-block;
  margin: 0 10px;
  font-size: 16px;
}
.MenuBar-util-container a{
  font-size: 8px;
  padding: 5px 5px;
}

}
</style>
