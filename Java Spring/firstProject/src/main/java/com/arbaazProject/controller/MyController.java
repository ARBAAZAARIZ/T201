package com.arbaazProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@GetMapping("/welcom")
	public String welcom() {
		
		return "My first Spring boot project from my controller";
		
	}
	

}
