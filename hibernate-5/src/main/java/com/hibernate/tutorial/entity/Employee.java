package com.hibernate.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name= "EmployeeType")
public abstract class Employee extends Person{

	@Id
	@Column(name = "Id")
	Long id;

	@Column(name="Address")
	String employeeAddress;

	public Employee(Long id, String employeeAddress) {
		this.id = id;
		this.employeeAddress = employeeAddress;
	}

	public Employee() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}
