package com.arbaaz.SpringMapping.repository;

import com.arbaaz.SpringMapping.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {




}
