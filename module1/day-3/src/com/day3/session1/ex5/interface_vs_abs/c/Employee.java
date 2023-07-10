package com.day3.session1.ex5.interface_vs_abs.c;
//common base hierarchy
//IS A TEST: FullTimeEmp ?
//PartTimeEmp

abstract public class Employee implements Payable{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void printDetails(){
        System.out.println("id : "+ id);
        System.out.println("name: "+ name);
    }
}
