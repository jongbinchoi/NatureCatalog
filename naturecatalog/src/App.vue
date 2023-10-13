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

<style >
router-link-active {
  color: #42b983;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
body {
  margin: 0;
  padding: 0;
  background-color: #F2F2F2;
}

</style>
