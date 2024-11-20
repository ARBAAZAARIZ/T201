package com.example.crud_mysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud_mysql.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
