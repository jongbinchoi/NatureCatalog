package com.natureCatalogSite.natureCatalog.repository;

import com.natureCatalogSite.natureCatalog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> { //JapRepository : 엔티티의 CRUD 기능과 페이징 및 정렬 기능뿐만 아니라 JPA에 특화된 기능추가
    //특정 게시글의 모든 댓글 조회
    //data.sql파일을 만들어 SQL문을 사용해서 더미 값을 넣어주고 확인할려고 만듦 즉, 테스트용도(?)
    @Query(value = "SELECT *FROM comment WHERE nature_id =:natureId", nativeQuery = true)// nativeQuery=true : 기존 SQL문 사용가능, JPQL대신 사용가능해짐
    List<Comment> findByNatureId(Long natureId); //댓글을 조는 메서드 이름을 findByNatureId로 설정

    //특정 닉네임의 모든 댓글 조회
    List<Comment> findByNickname(String nickname);
}
