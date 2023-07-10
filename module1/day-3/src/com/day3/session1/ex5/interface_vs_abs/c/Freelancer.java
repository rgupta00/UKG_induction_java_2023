package com.day3.session1.ex5.interface_vs_abs.c;

public class Freelancer implements Payable{
    private int invoiceId;
    private String companyRegNo;
    private String consultantName;
    private int noOfDays;
    private double payPerDays;

    public Freelancer(int invoiceId, String companyRegNo, String consultantName, int noOfDays, double payPerDays) {
        this.invoiceId = invoiceId;
        this.companyRegNo = companyRegNo;
        this.consultantName = consultantName;
        this.noOfDays = noOfDays;
        this.payPerDays = payPerDays;
    }
    public void printDetails(){
        ///
    }

    @Override
    public double getPayment() {
        return noOfDays*payPerDays*0.7;
    }
}
