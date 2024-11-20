package com.arbaaz.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.arbaaz.mvc.models.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/add_employee")
	String add_employee(Model model) {
		model.addAttribute("title","Add new Employee from spring");
		model.addAttribute("employee_object",new Employee());
		return "add_employee.html";
	}
	@PostMapping("/add-employee")
	String add_employee( @ModelAttribute Employee employee,Model model) {
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		model.addAttribute("employee_object", employee);
		
		return "view_employee.html";
	}

}
