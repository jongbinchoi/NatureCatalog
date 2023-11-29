package com.natureCatalogSite.natureCatalog.dto;

import com.natureCatalogSite.natureCatalog.entity.Nature;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //생성자 생성
@ToString //데이터 잘받았는지 확인용
public class NatureForm { //그릇
    private Long id;
    private String title;
    private String content;

   public Nature toEntity(){//DTO->entity반환
      return new Nature(id,title,content);
    }

}
