package com.day4.ex_handling4;

public class A_NeverReturnValueFromFinallyBlock {
    public static void main(String[] args) {

        int value=  foo();
        System.out.println(value);
    }

    //Suppressed exception
    private static int foo() {
        try{
           return 2;
        }finally {
            System.out.println("hello");
        }
    }
}
