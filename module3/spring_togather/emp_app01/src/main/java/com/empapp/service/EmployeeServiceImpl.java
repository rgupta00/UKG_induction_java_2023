package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImplJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //Sp anno of @Component
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;

    //avoid field injection (junit and mockito only in testing)

    //setter if dep is optional

    //ctr injection for mandatory dep
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
