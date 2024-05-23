package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id  
	@Column  
	private int id;

	@Column  
	private String name;

	@Column  
	private String role;
	
	
	//default constructor 
	public Employee() {
		super();
	}

	//constructor using fields  
	public Employee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
