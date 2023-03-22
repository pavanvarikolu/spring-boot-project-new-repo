package com.pavan.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.spring.entity.Employee;
import com.pavan.spring.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public Employee createEmp(Employee emp) {
		return employeeRepo.save(emp);
	}

	public List<Employee> geEmployees() {
		return employeeRepo.findAll();
	}

	
}
