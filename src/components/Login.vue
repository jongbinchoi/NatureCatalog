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
            <router-link to="/register">회원가입</router-link> |
            <router-link to="/find">아이디/비밀번호 찾기</router-link>

          </p>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'LoginFrom',
  data () {
    return {
      user_id: '',
      user_pw: ''
    }
  },
  methods: {
    fnLogin () {
      if (this.user_id === '') {
        alert('ID를 입력하세요.')
        return
      }

      if (this.user_pw === '') {
        alert('비밀번호를 입력하세요.')
        return
      }

      alert('로그인 되었습니다.')
    }
  }
}
</script>

<style scoped>
p{
  margin: 0 auto;
}
hr{
  width: 100%;
  border: 1px solid #ccc;
}
#loginForm {
  width: 460px;
  margin: 100px auto;
  padding: 28px;
  background: #fff;

  border-radius: 6px;
  border: 1px solid #000;
}
.inputUp {
  display: table;
  table-layout: fixed;
  margin: 0 auto;
  width: 100%;
  height: 50px;
  margin: 0;
  padding: 14px 17px 13px;

  box-sizing: border-box;
  border-radius: 6px 6px 0 0;
  border: 1px solid #ccc;
}
.inputDown {
  display: table;
  table-layout: fixed;
  margin: 0 auto;
  width: 100%;
  height: 50px;
  margin: 0;
  padding: 14px 17px 13px;

  box-sizing: border-box;
  border-radius: 0 0 6px 6px;
  border: 1px solid #ccc;
}

.button {
  display: table;
  table-layout: fixed;
  margin: 0 auto;
  width: 100%;
  height: 50px;
  margin: 0;
  padding: 14px 17px 13px;

  box-sizing: border-box;
  border-radius: 6px;
  border: 1px solid #ccc;
  background-color: #0a3711;
  color: #fff;
  font-size: 16px;
  font-weight: bold;
  cursor: pointer;
}

nav a.router-link-exact-active[aria-current] {
  color: #00ff15;
}

#logo{
  display: block;
  margin: 0 auto;
  width: 100%;
  height: 100%;
  padding: 0 auto;
}
</style>
