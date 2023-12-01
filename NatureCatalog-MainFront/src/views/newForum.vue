<template>
    <form class="container" @submit.prevent="submitArticle">
      <div class="mb-3">
        <label class="form-label">제목</label>
        <input type="text" class="form-control" v-model="article.title">
      </div>
      <div class="mb-3">
        <label class="form-label">내용</label>
        <textarea class="form-control" rows="3" v-model="article.content"></textarea>
      </div>
      <button type="submit" class="btn btn-primary">제출</button>
      <router-link to="/forum">뒤로</router-link>
    </form>
  </template>
  
  <script>
  export default {
    data() {
      return {
        article: {
          title: '',
          content: ''
        }
      };
    },
    methods: {
      submitArticle() {
        fetch('http://localhost:8081/natureCatalog/guestbook', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify(this.article)
        })
        .then(response => {
          if (!response.ok) {
            throw new Error('글 작성 실패');
          }
          return response.json();
        })
        .then(() => {
          alert('글이 성공적으로 작성되었습니다.');
          this.$router.push('/forum');
        })
        .catch(error => {
          console.error('Error:', error);
          alert('글 작성 중 오류가 발생했습니다.');
        });
      }
    }
  };
  </script>