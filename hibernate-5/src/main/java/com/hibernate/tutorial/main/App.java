package com.hibernate.tutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hibernate.tutorial.entity.Employee;
import com.hibernate.tutorial.entity.FullTimeEmployee;
import com.hibernate.tutorial.entity.PartTimeEmployee;
import com.hibernate.tutorial.service.EmployeeService;
import com.hibernate.tutorial.util.DatabaseConfig;

public class App {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		EmployeeService employeeService = (EmployeeService)context.getBean("EmployeeService");
		
		Employee emp = new FullTimeEmployee();
		emp.setId(new Long(1));
		emp.setName("Nishant Nair");
		emp.setEmployeeAddress("Mumbai1, India");
		employeeService.create(emp);
		
		Employee emp1 = new PartTimeEmployee();
		emp1.setId(new Long(2));
		emp1.setName("Avinash Nair");
		emp1.setEmployeeAddress("Mumbai, India");
		
		employeeService.create(emp1);
		
		emp1.setName("Asha Nair");
		employeeService.update(emp1);
		
		employeeService.get(1L);

		employeeService.deleteById(1L);
		employeeService.close();
		
	}
}
