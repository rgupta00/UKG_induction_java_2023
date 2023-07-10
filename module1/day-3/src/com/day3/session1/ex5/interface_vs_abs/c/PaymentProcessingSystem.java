package com.day3.session1.ex5.interface_vs_abs.c;

public class PaymentProcessingSystem {
    public static  void paymentProcessing(Payable payable){
        //jdbc code ..some database code
        double payment=payable.getPayment();

        ///
        System.out.println("Payment "+ payment);
    }
}
