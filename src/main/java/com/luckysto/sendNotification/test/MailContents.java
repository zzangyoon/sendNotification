package com.luckysto.sendNotification.test;

import com.luckysto.sendNotification.db.entities.ContentsEntity;
import com.luckysto.sendNotification.db.repositories.ContentsRepository;
import com.luckysto.sendNotification.enumtype.MainCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@AllArgsConstructor
public class MailContents {

    private final ContentsRepository repository;



    @PostConstruct
    public void init(){
        ContentsEntity entity = new ContentsEntity();
        entity.setMainCategory(MainCategory.EMAIL);
        entity.setSubCategory("subcategory");
        entity.setContents("test ...");
        entity = repository.save(entity);


        ContentsEntity entity1 = new ContentsEntity();
        entity1.setId(1L);
        entity1.setMainCategory(MainCategory.EMAIL);
        entity1.setSubCategory("update");
        entity1.setContents("22222222 ...");

        repository.save(entity1);
//        List<ContentsEntity> all = repository.findAll();
//        for (ContentsEntity contentsEntity : all) {
//            System.out.println(contentsEntity);
//        }
//
//
//        List<ContentsEntity> byMainCategory = repository.findByMainCategory(MainCategory.EMAIL);
//        for (ContentsEntity contentsEntity : byMainCategory) {
//            System.out.println(contentsEntity);
//        }
//

    }
}
