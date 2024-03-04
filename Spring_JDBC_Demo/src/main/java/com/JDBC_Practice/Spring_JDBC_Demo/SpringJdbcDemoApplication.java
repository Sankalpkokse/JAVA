package com.JDBC_Practice.Spring_JDBC_Demo;

import com.JDBC_Practice.Spring_JDBC_Demo.model.Employee;
import com.JDBC_Practice.Spring_JDBC_Demo.model.employeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Employee employee = applicationContext.getBean(Employee.class);
		employee.setId(1);
		employee.setName("sankalp");
		employee.setDepartment("Intern");

		employeeRepo employeerepo = applicationContext.getBean(employeeRepo.class);
		employeerepo.save(employee);
		System.out.println(employeerepo.getAllEmployee());
		//		Now I want to Store this employee in in memory database
//		for that we need JDBC connection
//		we can do that manually, but lets go with spring
		
	}

}
