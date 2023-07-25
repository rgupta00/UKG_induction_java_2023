package com.empapp.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//jdbc
@Profile(value = "test")
@Repository
public class EmployeeDaoImplJpa implements EmployeeDao{
    @Override
    public List<Employee> getAll() {
        System.out.println("let assume it is jpa Impl");

        return Arrays.asList(
                new Employee(1,"amit",7000.00),
                new Employee(4,"sumit",7000.00),
                new Employee(7,"raj",7000.00)

        );
    }
}
