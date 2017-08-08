package com.hibernate.tutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hibernate.tutorial.entity.Employee;
import com.hibernate.tutorial.util.HibernateUtil;
import com.hibernate.tutorials.service.EmployeeService;

public class App {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateUtil.class);
		EmployeeService employeeService = (EmployeeService)context.getBean("EmployeeService");
		
		Employee emp = new Employee();
		emp.setId(new Long(1));
		emp.setEmployeeName("Nishant Nair");
		emp.setEmployeeAddress("Mumbai1, India");
		employeeService.save(emp);
		employeeService.saveOrUpdate(emp);
		employeeService.get(1L);
		employeeService.delete(emp);		
	}
}
