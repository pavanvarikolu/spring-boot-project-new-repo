package com.pavan.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.spring.entity.Employee;
import com.pavan.spring.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class Controller {
	
	 @Autowired(required = false)
	 
	 EmployeeService employeeService;
	 @PostMapping("/save")
	 public Employee saveEmployee( @RequestBody Employee employee) {
		return employeeService.createEmp(employee);
		 
	 }
	 
	 @GetMapping("/getemps")
	 public List<Employee> getEmployees(){
		 return employeeService.geEmployees();
	}
}
