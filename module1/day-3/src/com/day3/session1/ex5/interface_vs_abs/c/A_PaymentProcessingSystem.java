package com.day3.session1.ex5.interface_vs_abs.c;

public class A_PaymentProcessingSystem {
    public static void main(String[] args) {
        //int id, String name, double salary, String ppfNumber
        Employee employee=new FullTimeEmployee(121,"rajat", 56000,"ASQ12334");

        PaymentProcessingSystem.paymentProcessing(employee);
    }
}
