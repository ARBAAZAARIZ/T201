package com.arbaaz.CRUD_MYSQL;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestCrudMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCrudMysqlApplication.class, args);

	}


}
