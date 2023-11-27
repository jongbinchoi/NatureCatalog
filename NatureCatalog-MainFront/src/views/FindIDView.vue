<template>
    <div>
      <div>
        <div id="loginForm">
          <img id = "logo" src="../assets/image.png" alt="logo" >
          <hr>
            <p>
              <input class="inputUp" name="uid" placeholder="아이디" >
            </p>
            <p>
               <input  class="inputDown" name="password" placeholder="비밀번호"  type="password"><br>
            </p>
            <p>
              <button type="submit" class="button">로그인</button>
            </p>
            <p>
              <router-link to="/SignUp">회원가입</router-link> |
              <router-link to="/find">아이디/비밀번호 찾기</router-link>

            </p>
        </div>s
      </div>
    </div>
  </template>
