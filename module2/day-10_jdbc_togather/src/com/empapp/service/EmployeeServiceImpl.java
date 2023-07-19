package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImplJdbc;
import com.empapp.exceptions.EmployeeNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

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

    @Override
    public void addEmployee(Employee employee) {
        //validation logic before adding data to database
        employeeDao.addEmployee(employee);
    }

    @Override
    public Employee getById(int id) {
        Optional<Employee> optionalEmployee=employeeDao.getById(id);

        //Employee e=optionalEmployee.orElse(null);

        Employee e=optionalEmployee
                .orElseThrow
                        (()-> new EmployeeNotFoundException
                                ("emp with id "+ id +" is not found"));
        return e;
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employeeDao.updateEmployee(id, employee);
    }

    @Override
    public void deleteEmployee(int id) {

        employeeDao.deleteEmployee(id);
    }
}
