package com.example.EmployeeProject.service;


import com.example.EmployeeProject.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServices {

    private Hashtable empTable = new Hashtable();


    public String addNewEmployee(Integer key, Employee employee) {
        empTable.put(key, employee);
        return "Employee added sucessfully";
    }

    public Collection getAllEmployee() {
        return empTable.values();
    }

    public ResponseEntity<?> getEmployeeDetailsByEmpId(int id) {
//
        Iterator<Map.Entry<Integer,Employee>> entryIterator=empTable.entrySet().iterator();

        while(entryIterator.hasNext()){
            Employee e=entryIterator.next().getValue();
            if(e.getEid()==id){
              return new  ResponseEntity<>(e, HttpStatus.OK) ;
            }
        }

         return new ResponseEntity<>
                 ("no employee present with given id "+id,HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<?> updateEmployee(int key,Employee employeeobj){
        Employee employee=(Employee)empTable.get(key);
        if(employee==null){
            return new ResponseEntity<>("no employee is there with given key"
                    + key,HttpStatus.NOT_FOUND);
        }
        else{
            empTable.put(key, employeeobj);
            return new ResponseEntity<>(empTable.get(key),
                    HttpStatus.OK);
        }
    }

    public String removeEmployee(int key){
        Employee employee=(Employee)empTable.get(key);
        if(employee==null){
            return "no employee record found with given unique key : "+key;
        }
        else{
            empTable.remove(key);
            return "Successfully removed Employee";
        }
    }

}