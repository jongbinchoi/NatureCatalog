package com.natureCatalogSite.natureCatalog.service;

import com.natureCatalogSite.natureCatalog.dto.CommentDto;
import com.natureCatalogSite.natureCatalog.entity.Comment;
import com.natureCatalogSite.natureCatalog.entity.Nature;
import com.natureCatalogSite.natureCatalog.repository.CommentRepository;
import com.natureCatalogSite.natureCatalog.repository.NatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository; //댓글 리파지터리 객제 주입
    @Autowired
    private NatureRepository natureRepository; //게시글 리파지터리에 객체 주입

    public List<CommentDto> comments(Long natureId) {
        return commentRepository.findByNatureId(natureId) //댓글 엔티티 목록조회
                .stream()// 댓글 엔티티 목록을 스트림으로 변환
                .map(comment -> CommentDto.createCommentDto(comment)) //엔티티를 DTO로 매핑
                .collect(Collectors.toList()); // 스트림을 리스트로 변환
    }

    //댓글 생성
    @Transactional
    public CommentDto create(Long natureId, CommentDto dto) {
        //1. 게시글 조회 및 예외 발생
        Nature nature = natureRepository.findById(natureId).orElseThrow(()->new IllegalArgumentException("댓글 생성 실패"+"대상 게시글이 없습니다."));
        //2. 댓글 엔티티 생성
        Comment comment = Comment.createComment(dto, nature);
        //3. 댓글 엔티티를 DB에 저장
        Comment created = commentRepository.save(comment);
        //4. DTO로 변환해 반환
        return CommentDto.createCommentDto(created);
    }

    //댓글 업데이트
    @Transactional
    public CommentDto update(Long id, CommentDto dto) {
        //1. 댓글 조회 및 예외 발생
        Comment target=commentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("댓글 수정 실패!"+"대상 댓글이 없습니다."));
        //2. 댓글 수정
        target.patch(dto);
        //3. DB로 갱신
        Comment updated = commentRepository.save(target);
        //4. 댓글 엔티티를 DTO로 변환 및 반환
        return CommentDto.createCommentDto(updated);
    }

    //댓글 삭제
    @Transactional
    public CommentDto delete(Long id) {
        //1. 댓글 조회 및 예외 발생
        Comment target = commentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("댓글 삭제 실패! "+"대상이 없습니다.")); //없으면 에러 메시지 출력
        //2. 댓글 삭제
        commentRepository.delete(target);
        //3. 삭제 댓글 DTO로 변환 및 반환
        return CommentDto.createCommentDto(target);
    }


}
