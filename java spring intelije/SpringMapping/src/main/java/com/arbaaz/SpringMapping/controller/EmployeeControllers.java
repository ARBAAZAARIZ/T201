package com.arbaaz.SpringMapping.controller;

import com.arbaaz.SpringMapping.model.Employee;
import com.arbaaz.SpringMapping.service.EmployeeSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeControllers {

    @Autowired
    EmployeeSerivice employeeSerivice;

    @PostMapping("/employee")
    public ResponseEntity<?> addemployee( @RequestBody Employee employee){
        return employeeSerivice.addemployee(employee);
    }

    @GetMapping("/employee")
    public ResponseEntity<?> getAllemployee(){
        return employeeSerivice.getAllemployee();
    }

    @GetMapping("employee/{id}")
    public ResponseEntity<?> getById( @PathVariable int id){
      return   employeeSerivice.getById(id);
    }

    @PutMapping("/employee")
    public ResponseEntity<?> updateEmployeeById(@RequestBody Employee employee){
        return employeeSerivice.updateEmployeeById(employee);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<?> deleteEmployeeById(int id){
        return employeeSerivice.deleteEmployeeById(id);
    }


}
