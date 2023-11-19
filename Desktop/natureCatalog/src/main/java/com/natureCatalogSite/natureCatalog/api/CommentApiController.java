package com.natureCatalogSite.natureCatalog.api;

import com.natureCatalogSite.natureCatalog.dto.CommentDto;
import com.natureCatalogSite.natureCatalog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CommentApiController {
    @Autowired
    private CommentService commentService;

    //1. 댓글 조회
    @GetMapping("/natureCatalog/guestbook/{natureId}/comments")
    public ResponseEntity<List<CommentDto>> comments(@PathVariable Long natureId){
        //서비스에 위임
        List<CommentDto> dtos = commentService.comments(natureId);
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }

    //2. 댓글 생성
    @PostMapping("/natureCatalog/guestbook/{natureId}/comments")
    public ResponseEntity<CommentDto> create(@PathVariable Long natureId, @RequestBody CommentDto dto){ //부모게시물id, dto받기

        //서비스에 위임
        CommentDto createdDto = commentService.create(natureId, dto);
        //결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }

    //3. 댓글 수정
    @PatchMapping("/guestbook/comments/{id}") //댓글 수정 요청접수
    public ResponseEntity<CommentDto> update(@PathVariable Long id, @RequestBody CommentDto dto){//update()메서드 생성

        //서비스에 위임
        CommentDto updateDto = commentService.update(id,dto);
        //결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(updateDto);
    }

    //4. 댓글 삭제
    @DeleteMapping("/guestbook/comments/{id}") //댓글 삭제 요청 접수
    public ResponseEntity<CommentDto> delete(@PathVariable Long id){

        //서비스에 위임
        CommentDto deletedDto = commentService.delete(id);
        //결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(deletedDto);
    }
}
