package com.luckysto.sendNotification.db.repositories;

import com.luckysto.sendNotification.db.entities.ContentsEntity;
import com.luckysto.sendNotification.db.entities.EmailEntity;
import com.luckysto.sendNotification.enumtype.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailRepository extends JpaRepository<EmailEntity, Long> {

}