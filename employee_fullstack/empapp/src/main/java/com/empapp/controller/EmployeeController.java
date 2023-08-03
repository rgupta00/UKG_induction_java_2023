package com.empapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
@RestController // @RestController=  @Controller+@ResponseBody
//@ResponseBody: is a annotation that trigger jackson parser to convert java object to json
@CrossOrigin()
@RequestMapping(path = "api")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	//-------get all employee--------
	@GetMapping(path = "employees")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	//-------get an employee by id--------
	@GetMapping(path = "employees/{id}")
	public Employee getAnEmployee(@PathVariable(name = "id") int id){
		return employeeService.getById(id);
	}
	//@RequestBody vs @ResponseBody
	//@RequestBody :convert json to java
	//@ResponseBody: convert java to json
	@PostMapping(path = "employees")
	public ResponseEntity<Employee> addAnEmployee
			 ( @RequestBody Employee employee){
		Employee emp= employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(emp);
	}

	@PutMapping(path = "employees/{id}")
	public Employee updateAnEmployee( @PathVariable(name = "id") int id,   
			@RequestBody Employee employee){
		return employeeService.updateEmployee(id, employee.getSalary());
	}
	
	
	//delete
	@DeleteMapping(path = "employees/{id}")
	public ResponseEntity<Void> deleteAnEmployee(
			@PathVariable(name = "id") int id){
		Employee empDeleted= employeeService.deleteEmployee(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}






