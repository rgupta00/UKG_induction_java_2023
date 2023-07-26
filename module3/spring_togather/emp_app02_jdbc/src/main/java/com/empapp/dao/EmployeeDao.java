package com.empapp.dao;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAll();
    public void addEmployee(Employee employe);
}
