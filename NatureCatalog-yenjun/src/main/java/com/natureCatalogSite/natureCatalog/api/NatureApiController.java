package com.natureCatalogSite.natureCatalog.api;


import com.natureCatalogSite.natureCatalog.dto.NatureForm;
import com.natureCatalogSite.natureCatalog.entity.Nature;
import com.natureCatalogSite.natureCatalog.service.NatureSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080") // 8080 포트 번호로만 데이터를 받는다.
@Slf4j //로그 확인
@RestController //Rest api컨트롤러
public class NatureApiController {
    @Autowired //서비스 객체 주입
    private NatureSerivce natureSerivce;

    //GET
    //모든게시물 조회
    @GetMapping("/natureCatalog/guestbook")
    public List<Nature> index() {
        return natureSerivce.index(); //데이터
    }
    //단일 게시글 조회
    @GetMapping("/natureCatalog/guestbook/{id}")
    public Nature show (@PathVariable Long id){
        return natureSerivce.show(id);
        }

    //POST, 게시글작성
    @PostMapping("/natureCatalog/guestbook")
    public ResponseEntity<Nature> create(@RequestBody NatureForm dto){
        Nature created = natureSerivce.create(dto); //시용자 요청 dto -> 엔티티객체에 넣은 DB로 가기위해
        return (created !=null)?
                ResponseEntity.status(HttpStatus.OK).body(created)://postman에서 수정내용을 확인하기위해 body(created)넣어야함, 그냥 build하면 값안나옴
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();//결과 실패시, 본문(body)없으니 그냥 빌드, build()=body(null)
    }

    //PATCH 게시글수정
    @PatchMapping("/natureCatalog/guestbook/{id}")
    public ResponseEntity<Nature> update(@PathVariable Long id, @RequestBody NatureForm dto){//요청 URL의 id와 요청 메시지의 본문데이터 받아옴
        Nature updated = natureSerivce.update(id,dto);
        return (updated !=null)?
                ResponseEntity.status(HttpStatus.OK).body(updated):
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    //DELETE
    @DeleteMapping("/natureCatalog/guestbook/{id}")
    public ResponseEntity<Nature> delete(@PathVariable Long id){//delete : 클라이언트의 HTTP 요청을 처리하는 엔드포인트 역할
        Nature deleted = natureSerivce.delete(id); //delete : 실제 데이터베이스에 접근하여 Nature 엔티티를 삭제하는 로직을 수행
        return (deleted !=null)?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build():
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }


}



