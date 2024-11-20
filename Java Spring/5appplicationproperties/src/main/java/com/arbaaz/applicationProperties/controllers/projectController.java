package com.arbaaz.applicationProperties.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectController {
	
	@Value("${server.port}")
	private String portNumber;
	
	@Value("${message}")
	private String message;
	
	@GetMapping("/application")
	String showApplicationProperties() {
		
		System.out.println(portNumber);
		System.out.println(message);
		return portNumber + "  " + message;
	}
	
}
