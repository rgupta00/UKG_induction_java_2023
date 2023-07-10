package com.day3.session1.ex4.final_demo;
//final vs finally (ex handing) vs finilize *
class Emp{
    private String name;
    private double salary;
    private final String aadharCardNumber;
    private static final String companyName="UKG";

    public Emp(String name, double salary, String aadharCardNumber) {
        this.name = name;
        this.salary = salary;
        this.aadharCardNumber = aadharCardNumber;
    }
    public void printEmpDetails(){
       //print the details of emp
    }
}

public class C_FinalInstanceVariable {

    public static void main(String[] args) {

    }
}
