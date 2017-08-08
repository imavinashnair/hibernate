package com.hibernate.tutorial.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.tutorial.entity.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	public void save(Employee employee) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void deleteById(long id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = (Employee) entityManager.find(Employee.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void delete(Employee employee) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public Employee get(long id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = (Employee) entityManager.find(Employee.class, 1L);
		entityManager.close();
		return employee;
	}

}
