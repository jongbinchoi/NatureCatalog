<template>
   <div>
    <MainBar/>
    <router-view style="padding-top: 80px;"/>
  </div>
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
