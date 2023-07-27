package com.empapp;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Empappv3Application implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(Empappv3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--adding new employees----");
//		employeeService.addEmployee(new Employee("amit",7000.00));
//		employeeService.addEmployee(new Employee("sumit",8000.00));

	}
}
