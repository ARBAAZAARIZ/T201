package com.arbaaz.Rest_Repository.repositories;

import com.arbaaz.Rest_Repository.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
