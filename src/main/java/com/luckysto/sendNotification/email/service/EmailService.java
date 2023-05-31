package com.luckysto.sendNotification.email.service;

import com.luckysto.sendNotification.db.repositories.EmailRepository;
import com.luckysto.sendNotification.vo.EmailVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {

    private final EmailRepository repository;


    public void insert(EmailVo emailVo){

    }
}
