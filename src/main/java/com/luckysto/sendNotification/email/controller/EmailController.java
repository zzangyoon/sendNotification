package com.luckysto.sendNotification.email.controller;


import com.luckysto.sendNotification.vo.EmailVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    public String insert(EmailVo emailVo){
//        EmailVoilService emailService;
        return "OK";
    }
}
