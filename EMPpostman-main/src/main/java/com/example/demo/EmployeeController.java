package com.example.demo;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceimpl.EmployeeServiceImpl;  

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl empserv;
	
	
	//mapping the getEmployee() method to /employees
	@GetMapping(value="/employee")
	public List<Employee> getEmployees() {
		 
		//finds all the employees  
		List<Employee> employees = empserv.findAll();  
		
		//returns the employee list  
		return employees;  
	}
	
	@RequestMapping(value="/add-emp", method=RequestMethod.POST)    
	public void addUser(@RequestBody Employee emp)  
	{    
		empserv.addEmployee(emp);    
	}       

}
