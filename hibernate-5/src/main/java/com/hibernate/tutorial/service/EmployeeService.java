package com.hibernate.tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.tutorial.dao.EmployeeDAO;
import com.hibernate.tutorial.entity.Employee;

@Service("EmployeeService")
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	
	public void create(Employee employee) {
		employeeDao.create(employee);
	}
	
	public void update(Employee employee) {
		employeeDao.update(employee);
	}
	
	public void deleteById(long id) {
		employeeDao.deleteById(id);
	}
	
	public void delete(Employee employee) {
		employeeDao.delete(employee);
	}
	
	public Employee get(long id) {
		return employeeDao.get(id);
	}
	
	public void close() {
		employeeDao.close();
	}
}
