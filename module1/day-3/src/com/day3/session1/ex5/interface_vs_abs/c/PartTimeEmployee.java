package com.day3.session1.ex5.interface_vs_abs.c;

public class PartTimeEmployee extends Employee{
    private double ratePerDay;
    private int numberOfDays;

    public PartTimeEmployee(int id, String name, double ratePerDay, int numberOfDays) {
        super(id, name);
        this.ratePerDay = ratePerDay;
        this.numberOfDays = numberOfDays;
    }

    public void printDetails(){
        super.printDetails();//code resuablity can be without inhertance
        System.out.println("ratePerDay: "+ratePerDay);
        System.out.println("numberOfDays: "+numberOfDays);
        System.out.println("payable amount: "+ getPayment());
    }
    @Override
    public double getPayment() {
        return numberOfDays * ratePerDay * 0.2;
    }
}
