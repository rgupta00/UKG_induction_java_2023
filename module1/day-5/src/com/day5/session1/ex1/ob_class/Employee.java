package com.day5.session1.ex1.ob_class;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //if u are overring equals method dont forget to override hashcode()


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0
                && Objects.equals(name, employee.name);
    }
//
    @Override
    public int hashCode() {
        //return 10;
        return Objects.hash(id, name, salary);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    //avoided
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize is called");
        super.finalize();
    }
}






