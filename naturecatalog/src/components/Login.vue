<template>
    <div class="hello">
    <h1>here is {{ msg }}</h1>
    </div>
</template>

<script>
export default {
  name: 'Login-Page',
  props: {
    msg: String
  }
}
</script>

<style scoped>
a {
  color: #ffffff;
}
</style>
