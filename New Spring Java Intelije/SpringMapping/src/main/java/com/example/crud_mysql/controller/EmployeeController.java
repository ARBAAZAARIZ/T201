package com.example.crud_mysql.controller;

import com.example.crud_mysql.model.Accounts;
import com.example.crud_mysql.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.crud_mysql.model.Employee;
import com.example.crud_mysql.services.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public ResponseEntity<?> getAllEmplpoyee(){
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/employee")
	public ResponseEntity<?> createEmployee(@RequestBody @Valid Employee employee){
		return employeeService.createEmployee(employee);
	}

	@PostMapping("/employee/{id}/accounts")
	public ResponseEntity<?> createdAccount(@PathVariable int id, @RequestBody @Valid Accounts accounts){
		return employeeService.createdAccount(id,accounts);
	}

	@GetMapping("/employee/{id}/accounts")
	public ResponseEntity<?> getAccount( @PathVariable int id){
		return employeeService.getAccount(id);
	}

	@PutMapping("/employee/{id}/updateadress")
	public ResponseEntity<?> updateAddress( @PathVariable int id, @RequestBody @Valid Address address){
		return  employeeService.updateAddress(id,address);}

}
