package com.arbaaz.SpringMappingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringMappingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMappingDemoApplication.class, args);
	}

}
