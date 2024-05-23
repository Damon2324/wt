package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.serviceimpl.EmployeeServiceImpl;

@Service
public class EmployeeService implements EmployeeServiceImpl{

	
	@Autowired
	EmployeeRepository emprepo;
	
	@Override
	public List<Employee> findAll(){
		ArrayList<Employee> employees = new ArrayList<Employee>();
		emprepo.findAll().forEach(emp -> employees.add(emp));  
		return employees;
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		return emprepo.save(employee);
	}  
	
}
