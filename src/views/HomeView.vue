<template>
   <div class="interactive">
    <h1>{{ message }}</h1>
    <button @click="changeText">텍스트 변경</button>
  </div>
</template>

<script>
import { ref } from 'vue'

export default {
  setup () {
    const message = ref('여기를 눌러보세요!')

    function changeText () {
      message.value = '텍스트가 변경되었습니다!'
    }

    return {
      message,
      changeText
    }
  }
}
</script>

<style scoped>
.interactive {
  text-align: center;
  margin-top: 50px;
}

.interactive h1 {
  color: #333;
  margin-bottom: 20px;
}

.interactive button {
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}
</style>
