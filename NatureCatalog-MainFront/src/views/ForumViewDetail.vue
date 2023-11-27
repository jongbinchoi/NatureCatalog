<template>
  
    <div>
      <h2>게시물 상세</h2>
      <div class="detailWrap">
        <p v-if="this.results">내용: {{ results.content }}</p>
      </div>
      <CommentView :postId="postId" />
    </div>
  
  </template>
  
  <script>
  import CommentView from './CommentView.vue'; // CommentView 컴포넌트 가져오기
  export default {
    components: {
    CommentView, // 컴포넌트 등록
  },
  data() { //변수생성
    return{
      results: null,
      postId: null, // 게시글 ID
    };
  }
  ,mounted() { //페이지 시작하면은 자동 함수 실행
    this.loadExperiences();
  },
    methods: {
      loadExperiences() {
        let url = window.location.href;
        const arr = url.split('/')
        url = arr[arr.length-1]
        this.postId = id; // 게시글 ID 설정
        
        fetch(`/natureCatalog/guestbook/${id}`)
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