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
}
.scroll::-webkit-scrollbar {
  display: none; /*구글, 사파리, 오페라 브라우저 스크롤바 제거*/
}
.scroll {
  -ms-overflow-style: none; /* 인터넷 익스플로러 */
  scrollbar-width: none; /* 파이어폭스 */
}
</style>
