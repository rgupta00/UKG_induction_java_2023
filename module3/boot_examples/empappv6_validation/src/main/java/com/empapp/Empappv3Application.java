package com.empapp;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy //2 hey spring boot support aspectJ framework
@SpringBootApplication
public class Empappv3Application implements CommandLineRunner {
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Empappv3Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--adding new employees----");
//		employeeService.addEmployee(new Employee("amit",7000.00));
//		employeeService.addEmployee(new Employee("sumit",8000.00));

	}
}
