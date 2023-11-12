<template>
    <div>
      <div>
        <div id="loginForm">
          <img id = "logo" src="../assets/image.png" alt="logo" >
          <hr>
          <form @submit.prevent="fnLogin">
            <p>
              <input class="inputUp" name="uid" placeholder="아이디" v-model="user_id">
            </p>
            <p>
               <input  class="inputDown" name="password" placeholder="비밀번호" v-model="user_pw" type="password"><br>
            </p>
            <p>
              <button type="submit" class="button">로그인</button>
            </p>
            <p>
              <router-link to="/signup">회원가입</router-link> |
              <router-link to="/find">아이디/비밀번호 찾기</router-link>

            </p>
          </form>
        </div>
      </div>
    </div>
  </template>

<script>

</script>

<style scoped>
p{
  margin: 0 auto;
}
</style>
