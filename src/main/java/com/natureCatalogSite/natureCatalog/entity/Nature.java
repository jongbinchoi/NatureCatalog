package com.natureCatalogSite.natureCatalog.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor //생성자 자동생성
@NoArgsConstructor //기본 생성자 자동생성
@ToString
@Getter
@Setter
@Entity //DB가 해당 객체를 인식가능
public class Nature {
    @Id //대푯값 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column //테이블 단위가 연결되게함
    private String title;

    @Column
    private String content;

    public void patch(Nature nature){
        if(nature.title !=null)
            this.title=nature.title;
        if(nature.content !=null)
            this.content=nature.content;
    }
}
