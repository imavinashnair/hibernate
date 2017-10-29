package com.hibernate.tutorial.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FullTime")
public class FullTimeEmployee extends Employee{

}
