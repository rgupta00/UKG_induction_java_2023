package com.day3.session1.ex5.interface_vs_abs.c;

public class FullTimeEmployee extends Employee{
    private double salary;
    private String ppfNumber;

    public FullTimeEmployee(int id, String name, double salary, String ppfNumber) {
        super(id, name);
        this.salary = salary;
        this.ppfNumber = ppfNumber;
    }
    public void printDetails(){
        super.printDetails();//code resuablity can be without inhertance
        System.out.println("salary: "+ salary);
        System.out.println("net salary: "+ getPayment());
        System.out.println("ppfNumber: "+ ppfNumber);
    }
    @Override
    public double getPayment() {
        return salary * 0.7;
    }
}
