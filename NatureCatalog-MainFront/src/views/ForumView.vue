<template>
    <div class="board-list">
      <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">제목</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="(row, idx) in results" :key="idx">
          <td>*</td>
          <td>{{row.id}}</td>
					<router-link :to="`/natureCatalog/guestbook/${row.id}`" :params="{ text: row.content }">{{ row.title }}</router-link>
				</tr>
  </tbody>
</table>
    </div>
  </template>

<script>
export default {
  data() { //변수생성
		return{
      results: [],
		};
	}
	,mounted() { //페이지 시작하면은 자동 함수 실행
		this.loadExperiences();
	},
    methods: {
    loadExperiences() {
      fetch(`http://localhost:8081/natureCatalog/guestbook`)
        .then((response) => {
          if (response.ok) {
            return response.json();
          }
        })
        .then((data) => {
          const results = [];
          for (const id in data) {
            results.push({
              id: data[id].id,
              title: data[id].title,
              content: data[id].content
            });
          }
          this.results = results;
          console.log(results);
        });
    }
    }
}
</script>

<style scoped>
.board-list {
    width: 768px;
    margin: auto;
}

.board-detail {
    width: 768px;
    margin: auto;
    text-align: left;
}

.board-contents {
    padding: 12px 8px;
    border-bottom: 1px solid #eee;
}

.common-buttons {
    padding: 8px;
    text-align: right;
}
</style>
