package com.day2.practice.empappv1;
//id name salary
abstract public class Employee {
   private int id;
   private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double getPayment();

    public void printEmployeeDetails(){
        System.out.println("Employee id : "+ id);
        System.out.println("Employee Name: "+ name);
    }
}
