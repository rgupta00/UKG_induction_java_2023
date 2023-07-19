package com.empapp.service;

import com.empapp.dao.Employee;

import java.util.List;
//Service layer invoke dao layer and have extra logic *
public interface EmployeeService {
    public List<Employee> getAll();
}
