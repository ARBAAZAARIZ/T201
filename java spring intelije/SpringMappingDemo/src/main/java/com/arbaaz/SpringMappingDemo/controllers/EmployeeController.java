package com.arbaaz.SpringMappingDemo.controllers;

import com.arbaaz.SpringMappingDemo.models.Employee;
import com.arbaaz.SpringMappingDemo.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
   EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee( @RequestBody @Valid Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employee")
    public ResponseEntity<?> getAllEmployee(){
        return employeeService.getAllEmployee();
    }


}
