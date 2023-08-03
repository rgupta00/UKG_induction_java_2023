package com.empapp;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public  class EmpappV4Application implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmpappV4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		employeeService.addEmployee(new Employee("amit",7000));
//		employeeService.addEmployee(new Employee("sumit",7000));
	}
}
