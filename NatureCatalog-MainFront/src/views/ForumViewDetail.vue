<template>
    <div>
      <h2>게시물 상세</h2>
      <div class="detailWrap">
        <p v-if="this.results">내용: {{ results.title }} / {{results.content}}</p>
      </div>
    </div>
    <CommentView v-if="postId" :postId="postId" />
</template>
  
  <script>
  import CommentView from './CommentView.vue'; // CommentView 컴포넌트 가져오기
  export default {
    components: {
      CommentView, 
  },
  data() {
    return{ 
      results: [],
      postId: null
    };
  }
  ,mounted() { //페이지 시작하면은 자동 함수 실행
    this.loadExperiences();
  },
    methods: {
      loadExperiences() {
        const url = window.location.href;
      const arr = url.split('/');
      this.postId = arr[arr.length - 1];
        fetch(`http://localhost:8081/natureCatalog/guestbook/${this.postId}`)
          .then((response) => {
            if (response.ok) {
              return response.json();
            }
          })
          .then((data) => {
          console.log(data)
          this.results = data
        })
        .catch(err => {
          console.log(err)
        })
      }, 
    }
  };
  </script>