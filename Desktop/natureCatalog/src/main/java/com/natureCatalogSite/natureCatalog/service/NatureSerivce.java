package com.natureCatalogSite.natureCatalog.service;

import com.natureCatalogSite.natureCatalog.dto.NatureForm;
import com.natureCatalogSite.natureCatalog.entity.Nature;
import com.natureCatalogSite.natureCatalog.repository.NatureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class NatureSerivce {

    @Autowired
    private NatureRepository natureRepository; //리파지터리 객체주입

    //전체 페이지조회 기능
    public List<Nature> index() {
        return natureRepository.findAll(); //데이터를 리파지터리에 통해 가져옴.
    }

    //단일 페이지조회 기능
    public Nature show(Long id){
        return natureRepository.findById(id).orElse(null);
    }

    //게시글 생성
    @Transactional //데이터 무결정을 보장하기 위해
    public Nature create(NatureForm dto) {
        Nature nature=dto.toEntity(); // dto -> 엔티티로 변환 후 nature에 저장
        if(nature.getId()!=null){//글 생성시 id값 넣을필요x DB가 자동생성, 만약 넣을 시 null로 반환
            return null;
        }
        return natureRepository.save(nature); //nature을 DB에 저장 (엔티티)
    }

    //게시글 수정
    @Transactional
    public Nature update(Long id, NatureForm dto) {
        //1. DTO -> 엔티티 변환하기
        Nature nature =dto.toEntity();

        //2. 타켓 조회하기
        Nature target =natureRepository.findById(id).orElse(null);//DB에 해당 id를 가진 엔티티 가져오되 없다면 널반환

        //3. 잘못된 요청 처리하기,  잘못된 요청 응답(400)
        if(target ==null || id!=nature.getId()){// 대상 엔티티가 없거나 수정요청 id와 본문 id가 다를 경우

            log.info("잘못도니 요청 : {}, nature:{}",id, nature.toString());
            return null;
        }

        //4. 업데이트 및 정상 응답하기(200)
        target.patch(nature); //기존 데이터에 새 데이터 붙이기,즉 업데이트
        Nature updated=natureRepository.save(target);////수정내용 엔티티로 DB에 저장
        return updated; //응답은 컨트롤러가 하므로 여기서는 수정 데이터만 반환
    }

    //게시글 삭제
    @Transactional
    public Nature delete(Long id) {
        //1. 대상찾기
        Nature target = natureRepository.findById(id).orElse(null);//삭제할 대상 엔티티가 있는지 조회하고 없으면 null반환, 반환값은 target에 저장
        //2. 잘못된 요청 처리하기
        if(target==null){
            return null;
        }
        //3. 대상 삭제하기
        natureRepository.delete(target);
        return target; //target 값에 따라 컨트롤러부분에서 상태200, 상태400 반환
    }
}
