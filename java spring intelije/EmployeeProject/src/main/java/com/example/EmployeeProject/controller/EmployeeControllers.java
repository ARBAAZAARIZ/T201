package com.example.EmployeeProject.controller;

import com.example.EmployeeProject.model.Employee;
import com.example.EmployeeProject.model.EmployeeRequest;
import com.example.EmployeeProject.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.Collection;

@RestController
public class EmployeeControllers {

    @Autowired
    EmployeeServices employeeServices;

    @PostMapping("/employee") // to add new employee
    String addingNewEmployee(@RequestBody EmployeeRequest employeeRequest){
       return  employeeServices.addNewEmployee(employeeRequest.getKey(),
               employeeRequest.getEmployee());
    }

    @GetMapping("/employee") // to get all employee
    Collection gettingEmployee(){
        return  employeeServices.getAllEmployee();
    }

    @GetMapping("employee/{empId}") // getting employee by id
    public ResponseEntity<?> getEmployeeDetailsByEmpId(@PathVariable int empId){
        return employeeServices.getEmployeeDetailsByEmpId(empId);
    }

    @PutMapping("/employee/{key}") // updating employee by key
    public ResponseEntity<?> updateEmployee(@PathVariable int key, @RequestBody Employee employeeobj){
        System.out.println(key +"  "+ employeeobj.toString());
        return employeeServices.updateEmployee(key, employeeobj);
    }

    @DeleteMapping("/employee/{key}")// deleting employee details by key
    public String removeEmployee( @PathVariable int key){
        return employeeServices.removeEmployee(key);
    }

}
