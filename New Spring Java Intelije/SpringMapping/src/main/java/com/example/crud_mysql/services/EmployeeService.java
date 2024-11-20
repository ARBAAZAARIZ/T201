package com.example.crud_mysql.services;

import java.util.Iterator;
import java.util.List;

import com.example.crud_mysql.model.Accounts;
import com.example.crud_mysql.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.crud_mysql.model.Address;
import com.example.crud_mysql.model.Employee;
import com.example.crud_mysql.repository.AddressRepository;
import com.example.crud_mysql.repository.EmployeeRepository;
import com.example.crud_mysql.wrapper.ResponseWrapper;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ResponseWrapper responseWrapper;
	
	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private AccountsRepository accountsRepository;
	
	public ResponseEntity<?> getAllEmployee() {
		Iterable<Employee> allEmployee = employeeRepository.findAll();
		responseWrapper.setMessage("Following are the employees ");
		responseWrapper.setData(allEmployee);
		return new ResponseEntity<>(responseWrapper , HttpStatus.FOUND);
	}
		
	public ResponseEntity<?> createEmployee(Employee employee)
	{
		Address new_address = employee.getAddress();
		Address inserted_address = addressRepository.save(new_address);
		employee.setAddress(inserted_address);
		Employee employeeCreated = employeeRepository.save(employee);
		responseWrapper.setMessage("Following employee added successfully");
		responseWrapper.setData(employeeCreated);
		return new ResponseEntity<>(responseWrapper , HttpStatus.OK);
		
	}

	public ResponseEntity<?> createdAccount(int id, Accounts accounts){
		Employee employeeFound=employeeRepository.findById(id).orElseThrow(
				()->{
					throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Employee not exist for id "+id);
				}
		);
		accounts.setEmployee(employeeFound);
		Accounts createdAccount=accountsRepository.save(accounts);

		responseWrapper.setMessage("following acount created for employee id"+id);
		responseWrapper.setData(createdAccount);

		return new ResponseEntity<>(responseWrapper,HttpStatus.CREATED);

	}

	public ResponseEntity<?> getAccount(int employeeId){
		Employee foundEmployee=employeeRepository.findById(employeeId).orElseThrow(
			()->{
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Employee not exist for id "+employeeId);
			}
		);
		List<Accounts> foundAccounts=foundEmployee.getAccounts();

		responseWrapper.setMessage("following acount created for employee id"+employeeId);
		responseWrapper.setData(foundAccounts);

		return new ResponseEntity<>(responseWrapper,HttpStatus.CREATED);
	}

	public ResponseEntity<?> updateAddress(int employeeId,Address address){
		Employee foundEmployee=employeeRepository.findById(employeeId).orElseThrow(
				()->{
					throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Employee not exist for id "+employeeId);
				}
		);


		address.setId(foundEmployee.getAddress().getId());
		address.setCreatedAt(foundEmployee.getCreateAt());
		Address updatedAddres=addressRepository.save(address);

		responseWrapper.setMessage("following account updated"+employeeId);
		responseWrapper.setData(foundEmployee);

		return new ResponseEntity<>(responseWrapper,HttpStatus.OK);

	}


		
		
	

}
