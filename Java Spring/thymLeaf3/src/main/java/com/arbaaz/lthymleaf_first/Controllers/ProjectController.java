package com.arbaaz.lthymleaf_first.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
	
	@GetMapping("/home")
	public String showHome() {
		return "homepage";
	}

}
