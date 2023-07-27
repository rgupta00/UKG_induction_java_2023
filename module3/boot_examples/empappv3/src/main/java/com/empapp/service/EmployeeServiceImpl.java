package com.empapp.service;

import com.empapp.entities.Employee;
import com.empapp.excetions.EmployeeNotFoundException;
import com.empapp.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getById(int id) {
//        Optional<Employee> optEmp=employeeRepo.findById(id);
//        return optEmp.orElseThrow(() ->
//                new EmployeeNotFoundException("employee with id "+ id +" is not found"));

        return employeeRepo.findById(id).orElseThrow(() ->
                new EmployeeNotFoundException("employee with id "+ id +" is not found"));
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee empToUpdate= getById(id);
        empToUpdate.setSalary(employee.getSalary());
        employeeRepo.save(empToUpdate);// for update and add : we have same method save
        return empToUpdate;
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee empToDelete= getById(id);
        employeeRepo.delete(empToDelete);
        return null;
    }
}
