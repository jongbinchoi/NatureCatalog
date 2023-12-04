<template>
    <section>
        <nav class="menu">
            <a href="#"><i class="fas fa-bars"></i></a>
            <a href="#"><i class="fas fa-sticky-note"></i></a>
        </nav>
        <article class = "profile">
            <img :src = "profile" alt = "profile">
            <h1>{{name}}</h1>
            <h2>{{job}}</h2><hr>
            <h5>{{about}}</h5>
        </article>
    </section>
</template>

<script>
export default {
  name: 'MemberCard',
  props: {
    name: String,
    job: String,
    about: String,
    profile: String
  }
}

</script>

<style scoped>
@charset 'utf-8';
@import url("https://fonts.googleapis.com/css2?family=Orbitron&display=swap");

 * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
ul, ol{
    list-style: none;
}
a {
    text-emphasis: none;
}
body {
    background: #ebfaff;
}
h5 {
    font-size: 15px;
    color: #666;
    text-align: left;
}
hr {
    border: 1px solid #666;
    margin: 10px 0;
}
section {
    width: 340px;
    padding: 30px;
    background-color: #fff;
    margin: 50px auto;
    box-shadow: 10px 10px 30px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
}
section nav {
    width: 100%;
}
section nav.menu::after {
    content: ""; /*공백추가*/
    display: block;
    clear: both; /*객체와 글자가 겹치지 않도록*/
}
section nav.menu a{
    font-size: 20px;
    color: #666;
}
section nav.menu a:nth-of-type(1) {
    float: left;
}
section nav.menu a:nth-of-type(2) {
    float: right;
}
section article.profile {
    width: 100%;
    text-align: center;
}
section article.profile img {
    width: 200px;
    height: 200px;
    border-radius: 50%;
    margin-bottom: 20px;
    box-shadow: 5px 15px 30px rgba(7, 216, 0, 0.1);
}
</style>
