package com.hibernate.tutorial.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.tutorial.entity.Employee;

@Repository
public class EmployeeDAO {
	
	@Autowired
	Session session;

	public void save(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
	}
	
	public void saveOrUpdate(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(employee);
		transaction.commit();
	}
	
	public void delete(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.delete(employee);
		transaction.commit();
	}
	
	public Employee get(long id) {
		return (Employee)session.get(Employee.class, id);
	}
	
}
