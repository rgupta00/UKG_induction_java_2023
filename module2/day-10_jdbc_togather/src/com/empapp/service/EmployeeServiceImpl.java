package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImplJdbc;

import java.util.List;
//Service layer need dao layer
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao employeeDao;
    public EmployeeServiceImpl(){
        employeeDao=new EmployeeDaoImplJdbc();
    }
    @Override
    public List<Employee> getAll() {
        long start=System.currentTimeMillis();
        List<Employee> employeeList= employeeDao.getAll();
        long end=System.currentTimeMillis();
        System.out.println("time taken to execute the getAll : " +
                ""+(end-start)+" ms");

        return employeeList;
    }
}
