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
#app {
  text-align: center;
  color: #000000;
}
body {
  margin: 0;
  padding: 0;
  background-color: #ffffff;
  scrollbar-width: none; /* Firefox */
  -ms-overflow-style: none; /* IE/Edge */
}
body::-webkit-scrollbar {
    width: 0 !important; /* Chrome, Safari, Opera */
    display: none; /* Chrome, Safari, Opera */
}

</style>
