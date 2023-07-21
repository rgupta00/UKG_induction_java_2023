package com.demo.one2many;

import java.util.*;

public class DemoTester {

	public static void main(String[] args) {

		Department department1 = new Department("IT");
		Department department2 = new Department("sales");
		Department department3 = new Department("mkt");
		Department department4 = new Department("r&d");

		Employee employee1 = new Employee("raja");
		Employee employee2 = new Employee("amit");
		Employee employee3 = new Employee("sumit");
		Employee employee4 = new Employee("ekta");

		Employee employee5 = new Employee("keshav");
		Employee employee6 = new Employee("gunika");
		Employee employee7 = new Employee("rajiv");

		department1.getEmployees().add(employee1);
		department1.getEmployees().add(employee2);

		department2.getEmployees().add(employee3);
		department2.getEmployees().add(employee4);

		department3.getEmployees().add(employee5);
		department3.getEmployees().add(employee6);
		department3.getEmployees().add(employee7);

		employee1.setDepartment(department1);
		employee2.setDepartment(department1);

		employee3.setDepartment(department2);
		employee4.setDepartment(department2);

		employee5.setDepartment(department3);
		employee6.setDepartment(department3);
		employee7.setDepartment(department3);



	}

}
