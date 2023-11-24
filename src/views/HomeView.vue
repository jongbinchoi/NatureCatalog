<template>
  <figure>
    <video autoplay muted loop>
      <source src="../assets/figure.mp4" type="video/mp4">
    </video>
    <div class = "inner">
      <h1>NatureCatalog</h1>
      <p>우리들이 그려보는 디지털 미술관</p>
      <router-link to="/login">login</router-link>
    </div>
  </figure>
    <Footerfrom/>
  <section>

  </section>
</template>

<script>
 import Footerfrom from'@/components/Footer.vue';
  export default {
    name: 'HomeView',
    components: {
      Footerfrom
    }
  }
</script>

<style scoped>
html, body {
    height: 100%;
    margin: 0;
    padding: 0;
    overflow: hidden;
}
figure {
  width: 100%;
  height: 80vh;
  background: #000;
  position: relative;
  overflow: hidden;
  padding: auto;
  margin: 0;
}
figure video {
  width: 100%;
  height: 100%;
  object-fit: cover;
  position: absolute;
  top: 0;
  left: 0;
}
figure .inner {
  position: relative;
  top: 35%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: #fff;
  text-align: left;
  padding: 20px auto;
  background-color: rgba(0, 0, 0, 0.5);
}
figure .inner h1 {
  position: relative;
  font-size: 4rem;
  font-weight: 700;
  margin-bottom: 20px;
  margin-left: 100px;
}
figure .inner p {
  position: relative;
  font-size: 1.2rem;
  font-weight: 400;
  margin-left: 100px;

}
figure .inner a {
  font: bold 24px/1 sans-serif;
  text-decoration: none;
  color: #fff;
  border: 2px solid #fff;
  padding: 10px 20px;
  margin-top: 20px;
  display: inline-block;
  transition: all 0.3s ease-in-out;
  border-radius: 20% 20%;
  margin: 10px 10px;
  margin-left: 100px;
}
figure .inner a:hover {
  background: #fff;
  color: #000;
  transition: all 0.3s ease-in-out;
}
</style>
