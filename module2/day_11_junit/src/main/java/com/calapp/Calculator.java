package com.calapp;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b) {
        return  a*b;
    }

    public int divide(int a, int b) {
        if(b==0)
            throw new ArithmeticException("demo must not be zero");
        return a/b;
    }
}
