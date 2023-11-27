<template>
    <div>
      <div>
        <div id="loginForm">
         <h1>회원가입</h1>
          <hr>
          <form @submit.prevent="fnLogin">
            <p>
              <input class="inputUp" name="uid" placeholder="아이디" v-model="user_id">
            </p>
            <p>
               <input  class="inputMid" name="password" placeholder="비밀번호" v-model="user_pw" type="password">
            </p>
            <p>
               <input  class="inputDown" name="repassword" placeholder="비밀번호 재입력" v-model="re_user_pw" type="password"><br>
            </p>
            <p>
              <input class="inputUp" name="name" placeholder="이름" v-model="user_name">
            </p>
            <p>
              <input class="inputDown" name="Bday" placeholder="생년월일 8자리" v-model="user_Bday"><br>
            </p>
            <p>
              <button type="submit" class="button">가입완료</button>
            </p>
            <p>
              <router-link to="/login">로그인</router-link> |
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
h1{
  text-align: center;
  color: #000;
  font-size: 2em;
}
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

.inputMid {
  display: table;
  table-layout: fixed;
  margin: 0 auto;
  width: 100%;
  height: 50px;
  margin: 0;
  padding: 14px 17px 13px;

  box-sizing: border-box;
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
