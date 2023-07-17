package com.day7.session1.classical_threads;
//C_UsingAnnInnerClass vs labmbda
public class C_UsingAnnInnerClass {
    public static void main(String[] args) {


        Thread t=new Thread(()-> System.out.println("hello done by thread..."));

       t.start();

    }
}
