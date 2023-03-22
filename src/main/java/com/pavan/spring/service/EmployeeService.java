package com.pavan.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pavan.spring.entity.Employee;

@Service
public interface EmployeeService {
	
	//create, getemp,getempbyid,delete,update
	
	public Employee createEmp(Employee emp);
	public List<Employee> geEmployees();

}
