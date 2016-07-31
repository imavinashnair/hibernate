package com.hibernate.tutorial.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.tutorial.entity.Employee;

import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure().buildSessionFactory(); // configures settings from hibernate.cfg.xml
			
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setId(new Long(1));
		emp.setEmployeeName("Avinash Nair");
		emp.setEmployeeAddress("Mumbai, India");
		session.save(emp);
		tx.commit();
		session.close();
	}
}
