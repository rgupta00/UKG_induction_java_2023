package com.day2.practice.empappv1;
//id name salary ppf
public class FullTimeEmployee extends Employee{
    private double payment;
    private String ppfNumber;
    public FullTimeEmployee(int id, String name, double payment, String ppfNumber ){
        super(id, name);
        this.payment=payment;
        this.ppfNumber=ppfNumber;
    }

    @Override
    public double getPayment() {
        return payment*0.7;
    }
    public void printEmployeeDetails(){
        System.out.println("********************");
        System.out.println("******Full time employee*******");
        System.out.println("********************");

        super.printEmployeeDetails();
        System.out.println("Employee payment: "+ getPayment());
        System.out.println("Employee ppf no: "+ppfNumber);
        System.out.println("********************");

    }
}
