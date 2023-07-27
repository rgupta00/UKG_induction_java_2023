package com.empapp.service;

import com.empapp.entities.Employee;
import com.empapp.excetions.EmployeeNotFoundException;
import com.empapp.repo.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;
    private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class)
;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> getAll() {
        long start= System.currentTimeMillis();
        List<Employee> employeeList= employeeRepo.findAll();
        long end= System.currentTimeMillis();
        logger.info("time taken to execute getall method is "+(end-start)+" ms");
    }

    @Override
    public Employee getById(int id) {
//        Optional<Employee> optEmp=employeeRepo.findById(id);
//        return optEmp.orElseThrow(() ->
//                new EmployeeNotFoundException("employee with id "+ id +" is not found"));

        long start= System.currentTimeMillis();

        System.out.println(employeeRepo.getClass());

        Employee employee= employeeRepo.findById(id).orElseThrow(() ->
                new EmployeeNotFoundException("employee with id "+ id +" is not found"));

        long end= System.currentTimeMillis();
        logger.info("time taken to execute getById method is "+(end-start)+" ms");
        return employee;
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
        return empToDelete;
    }
}
