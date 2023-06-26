package com.pacomolina.person_api_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PersonApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApiRestApplication.class, args);
	}

}
