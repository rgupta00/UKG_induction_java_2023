package com.empapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.exception.EmployeeNotFoundException;
// 
@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		//
//		if(1==1)
//			throw new NullPointerException();
		return employeeDao.findAll();
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		Employee employeeToUpdate= getById(id);
		
		employeeToUpdate.setSalary(salary);
		employeeDao.save(employeeToUpdate);// save work for both save or update !
		
		return employeeToUpdate;
	}

	@Override
	public Employee getById(int id) {
		Employee employee=
				employeeDao.findById(id)
				.orElseThrow(()-> new EmployeeNotFoundException("emp with id "+ id +" is not found"));
		
		return employee;
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee employeeToDelete= getById(id);
		 employeeDao.delete(employeeToDelete);
		 return employeeToDelete;
	}

	@Override
	public List<Employee> getByName(String name) {
		return employeeDao.findByName(name);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}
}
