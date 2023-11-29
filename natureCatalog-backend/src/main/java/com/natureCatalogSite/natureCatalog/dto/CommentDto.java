package com.natureCatalogSite.natureCatalog.dto;

import com.natureCatalogSite.natureCatalog.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // 모든 필드를 매개변수로 갖는 생성자 자동생성
@NoArgsConstructor //매개변수가 아예없는 기본 생성자 자동생성
@Getter // 각 필드 값을 조회할 수 있는 getter 메서드 자동생성
@Setter //모든 필드를 출력할 수 있는 toString 메서드 자동생성
public class CommentDto { //Comment(댓글 엔티티)를 담을 그릇
    private Long id; //댓글의 id
    private Long natureId; //댓글의 부모 id
    private String nickname; //댓글 작성자
    private String body; //댓글 본문

    public static CommentDto createCommentDto(Comment comment) {//생성매서드
        return new CommentDto( //댓글 엔티티가 댓글 DTO변환
                comment.getId(), //댓글 엔티티의 id
                comment.getNature().getId(), // 댓글 엔티티가 속한 부모 게시글의 id
                comment.getNickname(), // 댓글 엔티티의 nickname
                comment.getBody() //댓글 엔티티의 body
        );
    }
}