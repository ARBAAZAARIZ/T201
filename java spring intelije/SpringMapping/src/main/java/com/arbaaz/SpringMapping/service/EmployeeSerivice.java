package com.arbaaz.SpringMapping.service;

import com.arbaaz.SpringMapping.model.Address;
import com.arbaaz.SpringMapping.model.Employee;
import com.arbaaz.SpringMapping.repository.AddressRepository;
import com.arbaaz.SpringMapping.repository.EmployeeRepository;
import com.arbaaz.SpringMapping.wrapper.EmployeeResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeSerivice {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeResponseWrapper employeeResponseWrapper;

    @Autowired
    AddressRepository addressRepository;

    public ResponseEntity<?> addemployee(Employee employee){

        Address newAddress=employee.getAddress();
        Address insertedAddress=addressRepository.save(newAddress);
        employee.setAddress(insertedAddress);
        Employee savedEmployee= employeeRepository.save(employee);

        employeeResponseWrapper.setData(savedEmployee);
        employeeResponseWrapper.setMessage("Successfully created");
        return new ResponseEntity<>(employeeResponseWrapper, HttpStatus.CREATED);
    }

    public ResponseEntity<?> getAllemployee(){
        Iterable<Employee> employeeList=employeeRepository.findAll();
        employeeResponseWrapper.setData(employeeList);
        employeeResponseWrapper.setMessage("Employee Details");
        return new ResponseEntity<>(employeeResponseWrapper,HttpStatus.FOUND);
    }

    public ResponseEntity<?> getById(int id){
        Employee foundEmployee=employeeRepository.findById(id).orElseThrow(
                () ->{
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "Employe not found with given id : " + id);
                }
        );
        employeeResponseWrapper.setData(foundEmployee);
        employeeResponseWrapper.setMessage("Employe found with id " + id);
        return new ResponseEntity<>(employeeResponseWrapper,HttpStatus.FOUND);
    }

    public ResponseEntity<?> updateEmployeeById(Employee employee){
        int id= employee.getId();
        Employee foundEmployee=employeeRepository.findById(id).orElseThrow(
                ()->{
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "Please enter correct id");
                }
        );
        foundEmployee.setName(employee.getName());
        foundEmployee.setPhone(employee.getPhone());
        foundEmployee.setSalary(employee.getSalary());
        foundEmployee.setCreatedAt(employee.getCreatedAt());
        employeeResponseWrapper.setData(foundEmployee);
        employeeResponseWrapper.setMessage("  Employee Updated  ");
        return new ResponseEntity<>(employeeResponseWrapper,HttpStatus.OK);
    }

    public ResponseEntity<?> deleteEmployeeById(int id){
        Employee foundEmployee=employeeRepository.findById(id).orElseThrow(
                () ->{
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "Employe not found with given id : " + id);
                }
        );
        employeeRepository.deleteById(id);
        employeeResponseWrapper.setData(null);
        employeeResponseWrapper.setMessage("Employe found with id " + id);
        return new ResponseEntity<>(employeeResponseWrapper,HttpStatus.OK);
    }

}
