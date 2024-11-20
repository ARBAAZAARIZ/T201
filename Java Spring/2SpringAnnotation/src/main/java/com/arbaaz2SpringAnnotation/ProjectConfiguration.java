package com.arbaaz2SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// this class is created to create an object and to give this object to spring 
//to control the life cycle of object 'aka'bean

@Configuration
public class ProjectConfiguration {
	
	@Bean
	Project firstProjectConfigure() {
		System.out.println("creating object of Project ");
		return new Project("TCS","2 years");
	}

}
