package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.impl.EmployeeDaoImplUsingJdbc;

import java.util.List;
import java.util.Optional;

public  class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl() {
        this.employeeDao = new EmployeeDaoImplUsingJdbc();
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public void addEmployee(Employee e) {

    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public void updateEmployee(int id, double salary) {

    }

    @Override
    public Optional<Employee> getById(int id) {
        return Optional.empty();
    }
}
