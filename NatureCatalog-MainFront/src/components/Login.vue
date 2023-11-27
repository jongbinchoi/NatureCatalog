<template>
  <div>
    <div>
      <div id="loginForm">
        <img id = "logo" src="../assets/image.png" alt="logo" >
        <hr>
        <form @submit.prevent="fnLogin">
          <p>
            <input class="inputUp" name="uid" placeholder="아이디" v-model="UserId">
          </p>
          <p>
             <input  class="inputDown" name="password" placeholder="비밀번호" v-model="PassWd" type="password"><br>
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
import axios from 'axios'

export default {
  name: 'Login',
  data () {
    return {
      UserId: '',
      PassWd: ''
    }
  },
  methods: {
    fnLogin () {
      axios.get('http://localhost:3000/login', {
        UserId: this.UserId,
        PassWd: this.PassWd
      })
        .then((res) => {
          if (res.data.result === 'success') {
            alert('로그인 성공')
            this.$router.push('/')
          } else {
            alert('로그인 실패')
          }
        })
        .catch((err) => {
          console.log(err)
        })
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
a {
  width: auto;
  color: #000;
  text-decoration: none;
}
a:hover {
  color: rgb(7, 221, 0);
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

@media screen and (max-width: 768px) {
  #loginForm {
  width: 95%;
  margin-top: 10px auto;
  padding: 2px;
  background: #fff;

  border-radius: 6px;
  border: 1px solid #000;
}
}
</style>
