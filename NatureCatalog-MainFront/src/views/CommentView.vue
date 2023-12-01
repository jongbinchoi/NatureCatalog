<template>
    <div>
        <div v-for="comment in comments" :key="comment.id" class="card m-2">
            <div class="card-header">
                {{ comment.nickname }} , {{comment.body}}
                <button type="button"
                        class="btn btn-sm btn-outline-primary"
                        @click="editComment(comment)">수정</button>
                <button type="button"
                        class="btn btn-sm btn-outline-danger"
                        @click="deleteComment(comment.id)">삭제</button>
            </div>
            <div class="card-body">
                {{ comment.body }}
            </div>
        </div>

        <!-- 댓글 수정 모달 -->
        <div v-if="editingComment">

            <label class="form-label">닉네임</label>
            <input type="text" class="form-control"
                   v-model="editingComment.nickname">
            <label class="form-label">댓글 내용</label>
            <textarea type="text" class="form-control" rows="3"
                      v-model="editingComment.body"></textarea>
            <button type="button" class="btn btn-primary"
                    @click="updateComment">수정 완료</button>
        </div>
    </div>
</template>

<!-- 모달 이벤트 처리-->
<script>
export default {
    props: {
        postId: {
            type: [String],
            required: true
        }
    },
    data() {
        return {
            comments: [], // 댓 목록
            editingComment:  { id: null, nickname: '', body: '', articleId: '' } // 현재 수정
        };
    },
    methods: {
        // 댓글 목록을 불러오는 메서드
        loadComments() {
            // API 호출 (예시 URL)
            fetch(`http://localhost:8081/natureCatalog/guestbook/${this.postId}/comments`)
                .then(response => {
                    if (!response.ok) {
                        throw new Error('Failed to load comments');
                    }
                    return response.json();
                })
                .then(data => {
                    this.comments = data;
                })
                .catch(error => {
                    console.error('Error:', error);
                });
        },
        // 댓글 수정을 위한 메서드
        editComment(comment) {
            this.editingComment = { ...comment };
        },
        // 댓글 업데이트 메서드
        updateComment() {
            // API 호출 (예시 URL)
            fetch(`/guestbook/comments/${id}`, {
                method: 'PATCH',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(this.editingComment)
            })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Failed to update comment');
                }
                return response.json();
            })
            .then(updatedComment => {
                const index = this.comments.findIndex(c => c.id === updatedComment.id);
                this.comments.splice(index, 1, updatedComment);
                this.editingComment = null;
            })
            .catch(error => {
                console.error('Error:', error);
            });
        },
        deleteComment(id) {
            fetch(`/guestbook/comments/${id}`, {
                method: 'DELETE'
            })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Failed to delete comment');
                }
                this.comments = this.comments.filter(c => c.id !== id);
            })
            .catch(error => {
                console.error('Error:', error);
            });
        }
    },
    mounted() {
        // 컴포넌트가 마운트되면 댓글 목록 로드
        //console.log(this.postId)
        this.loadComments();
    },
    // created(){
    //     this.postId = this.$route.params.postId;
    // }
}
</script>