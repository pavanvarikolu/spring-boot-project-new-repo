package com.pavan.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.spring.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
