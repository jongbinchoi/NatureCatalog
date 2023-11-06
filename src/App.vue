<template>
  <body>
    <MainBar/>
    <router-view/>
  </body>

</template>

<script>
import MainBar from '@/components/MainBar.vue'

export default {
  name: 'App',
  components: {
    MainBar
  }
}
</script>

<style>
router-link-active {
  color: #ffffff;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #ffffff;
}
body {
  margin: 0;
  padding: 0;
  background-color: #000000;
}

</style>
