<template>
  <div>
    <h1>게시글 목록</h1>
    <ul>
      <li v-for="post in NatureList" :key="post.id">
        <h2>{{ post.title }}</h2>
        <p>{{ post.content }}</p>
      </li>
    </ul>
  </div>
</template>

<script>
import natureApi from "@/api/index.js";

export default {
  data() {
    return {
      NatureList: []
    };
  },
  methods: {
    fetchNatureList() {
      natureApi.getNatureList()
        .then(response => {
          this.NatureList = response.data;
        })
        .catch(error => {
          console.error('Error fetching NatureList:', error);
        });
    }
  }
};
</script>