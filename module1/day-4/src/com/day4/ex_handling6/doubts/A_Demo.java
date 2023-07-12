package com.day4.ex_handling6.doubts;

import java.io.IOException;

class A{
    void foo() throws IOException{
        System.out.println("foo method of class A");
    }
}
public class A_Demo {
    public static void main(String[] args) {
        try {
            A a = new A();
            a.foo();
        }catch (IOException e){

        }

//        try {
//            A a = new A();
//            a.foo();
//        }catch (NumberFormatException e){
//            System.out.println(e);
//        }
    }
}
