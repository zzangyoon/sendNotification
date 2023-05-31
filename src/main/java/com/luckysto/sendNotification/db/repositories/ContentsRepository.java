package com.luckysto.sendNotification.db.repositories;

import com.luckysto.sendNotification.db.entities.ContentsEntity;
import com.luckysto.sendNotification.enumtype.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentsRepository extends JpaRepository<ContentsEntity, Long> {
    List<ContentsEntity> findByMainCategory(MainCategory mainCategory);

}