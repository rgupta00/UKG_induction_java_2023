package com.day6.session1.basics_collections;

import java.util.Comparator;

//Namesorter -> salary
class NameSorterThenSalarySorter implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int value=o1.getName().compareTo(o2.getName());
        if(value==0){
            //Double it is wrapper
            value=Double.compare(o2.getSalary(), o1.getSalary());
        }
        return value;
    }
}

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
