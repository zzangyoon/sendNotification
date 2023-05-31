package com.luckysto.sendNotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class SendNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendNotificationApplication.class, args);
	}

}
