package com.hibernate.tutorial.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.tutorial.entity.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	EntityManager entityManager;

	public void create(Employee employee) {
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
	}

	public void update(Employee employee) {
		entityManager.getTransaction().begin();
		entityManager.merge(employee);
		entityManager.getTransaction().commit();
	}

	public void deleteById(long id) {
		Employee employee = (Employee) entityManager.find(Employee.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
	}

	public void delete(Employee employee) {
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
	}

	public Employee get(long id) {
		return (Employee) entityManager.find(Employee.class, 1L);
	}

	public void close() {
		entityManager.close();
	}

}
