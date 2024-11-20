package com.example.crud_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMappingApplication.class, args);
	}

}
