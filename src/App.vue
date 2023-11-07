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
  color: #000;
}
#app {
  text-align: center;
  color: #000000;
}
body {
  margin: 0;
  padding: 0;
  background-color: #ffffff;
}

</style>
