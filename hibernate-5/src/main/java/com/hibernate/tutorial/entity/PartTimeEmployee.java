package com.hibernate.tutorial.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PartTime")
public class PartTimeEmployee extends Employee{
	
	double wages;

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

}
