<template>
    <div class="board-list">
      <div class="common-buttons">
        <button type="button" class="w3-button w3-round w3-blue-gray" v-on:click="fnWrite">등록</button>
      </div>
      <table class="w3-table-all">
        <thead>
        <tr>
          <th>No</th>
          <th>제목</th>
          <th>작성자</th>
          <th>등록일시</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="(row, idx) in list" :key="idx">
          <td>{{ row.idx }}</td>
          <td><a v-on:click="fnView(`${row.idx}`)">{{ row.title }}</a></td>
          <td>{{ row.author }}</td>
          <td>{{ row.created_at }}</td>
        </tr>
        </tbody>
      </table>
      <div class="pagination w3-bar w3-padding-16 w3-small" v-if="paging.total_list_cnt > 0">
        <span class="pg">
        <a href="javascript:;" @click="fnPage(1)" class="first w3-button w3-border">&lt;&lt;</a>
        <a href="javascript:;" v-if="paging.startPage > 10" @click="fnPage(`${paging.startPage-1}`)"
           class="prev w3-button w3-border">&lt;</a>
        <template v-for=" (n,index) in paginavigation()">
            <template v-if="paging.page==n">
                <strong class="w3-button w3-border w3-green" :key="index">{{ n }}</strong>
            </template>
            <template v-else>
                <a class="w3-button w3-border" href="javascript:;" @click="fnPage(`${n}`)" :key="index">{{ n }}</a>
            </template>
        </template>
        <a href="javascript:;" v-if="paging.total_page_cnt > paging.endPage"
           @click="fnPage(`${paging.endPage+1}`)" class="next w3-button w3-border">&gt;</a>
        <a href="javascript:;" @click="fnPage(`${paging.total_page_cnt}`)" class="last w3-button w3-border">&gt;&gt;</a>
        </span>
      </div>
    </div>
  </template>

<script>
export default {
  data () {
    return {
      requestBody: {},
      list: {},
      no: '',
      paging: {
        block: 0,
        endPage: 0,
        next_block: 0,
        page: 0,
        page_size: 0,
        prev_block: 0,
        start_index: 0,
        startPage: 0,
        total_block_cnt: 0,
        total_list_cnt: 0,
        total_page_cnt: 0
      },
      page: this.$route.query.page ? this.$route.query.page : 1,
      size: this.$route.query.size ? this.$route.query.size : 10,
      keyword: this.$route.query.keyword,
      paginavigation: function () {
        // 페이징 처리 for문 커스텀
        const PageNumber = []
        const startPage = this.paging.startPage
        const endPage = this.paging.endPage
        for (let i = startPage; i <= endPage; i++) PageNumber.push(i)
        return PageNumber
      }
    }
  },
  mounted () {
    this.fnGetList()
  },
  methods: {
    fnGetList () {
      this.list = [
        {
          idx: 1,
          title: '제목1',
          author: '작성자1',
          created_at: '작성일시1'
        },
        {
          idx: 1,
          title: '제목1',
          author: '작성자1',
          created_at: '작성일시1'
        },
        {
          idx: 1,
          title: '제목1',
          author: '작성자1',
          created_at: '작성일시1'
        }
      ]
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
