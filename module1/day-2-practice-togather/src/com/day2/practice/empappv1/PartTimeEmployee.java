package com.day2.practice.empappv1;
//id name salary payPerDay noOfDay
public class PartTimeEmployee extends Employee {
    private int noOfDays;
    private double payPerDay;

    public PartTimeEmployee(int id, String name, int noOfDays,
                            double payPerDay) {
        super(id, name);
        this.noOfDays = noOfDays;
        this.payPerDay = payPerDay;
    }

    @Override
    public double getPayment() {
        return noOfDays*payPerDay*0.8;
    }

    public void printEmployeeDetails(){
        System.out.println("********************");
        System.out.println("******Part time employee*******");
        System.out.println("********************");
        super.printEmployeeDetails();
        System.out.println("Employee noOfDays: "+ payPerDay);
        System.out.println("Employee noOfDays: "+noOfDays);
        System.out.println("Employee net pay: "+getPayment());
        System.out.println("********************");

    }
}
