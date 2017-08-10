package com.hibernate.tutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hibernate.tutorial.entity.Employee;
import com.hibernate.tutorial.service.EmployeeService;
import com.hibernate.tutorial.util.DatabaseConfig;

public class App {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		EmployeeService employeeService = (EmployeeService)context.getBean("EmployeeService");
		
		Employee emp = new Employee();
		emp.setId(new Long(1));
		emp.setEmployeeName("Nishant Nair");
		emp.setEmployeeAddress("Mumbai1, India");
		
		Employee emp1 = new Employee();
		emp1.setId(new Long(1));
		emp1.setEmployeeName("Avinash Nair");
		emp1.setEmployeeAddress("Mumbai, India");
		
		//System.out.println("Start of save/persist");
		employeeService.save(emp);
		//System.out.println("End of save/persist");
		
		emp.setEmployeeName("Asha Nair");
		//System.out.println("Start of saveOrUpdate/merge");
		employeeService.saveOrUpdate(emp1);
		//System.out.println("End of saveOrUpdate/merge");
		
		
		employeeService.get(1L);
		employeeService.deleteById(1L);
		//employeeService.delete(emp);
	}
}
