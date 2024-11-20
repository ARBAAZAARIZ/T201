package com.arbaaz.SpringMappingDemo.services;


import com.arbaaz.SpringMappingDemo.models.Employee;
import com.arbaaz.SpringMappingDemo.repository.EmployeeRepository;
import com.arbaaz.SpringMappingDemo.responseWrapper.EmployeeWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {



    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeWrapper employeeWrapper;

    public ResponseEntity<?> createEmployee(Employee employee){
    Employee createdEmployee=employeeRepository.save(employee);
    employeeWrapper.setMessage("Employee created");
    employeeWrapper.setData(createdEmployee);
    return new ResponseEntity<>(employeeWrapper, HttpStatus.CREATED);
    }

    public ResponseEntity<?> getAllEmployee(){
        Iterable<Employee> employeeList=employeeRepository.findAll();
        employeeWrapper.setMessage("Employee details");
        employeeWrapper.setData(employeeList);
        return new ResponseEntity<>(employeeWrapper,HttpStatus.FOUND);
    }


}
