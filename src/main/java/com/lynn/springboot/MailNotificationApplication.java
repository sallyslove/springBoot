package com.lynn.springboot;

/*http://www.ityouknow.com/springboot/2016/02/03/spring-boot-web.html*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailNotificationApplication.class, args);
	}
}
