package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //Sp anno of @Component
public class EmployeeServiceImpl implements EmployeeService{

    private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public void addEmployee(Employee employee) {
        long start=System.currentTimeMillis();
        employeeDao.addEmployee(employee);
        long end=System.currentTimeMillis();

        logger.info("time taken to ex this method is : "+(end-start)+" ms");
    }
}
