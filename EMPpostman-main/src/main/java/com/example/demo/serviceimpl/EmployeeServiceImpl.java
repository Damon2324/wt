package com.example.demo.serviceimpl;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeServiceImpl {
	
	List<Employee> findAll();  
	Employee addEmployee(Employee employee);
}
