package com.day7.session1.classical_threads;
//C_UsingAnnInnerClass vs labmbda
public class C_UsingAnnInnerClass {
    public static void main(String[] args) {

//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("it is the job of thread");
//            }
//        };

        Runnable runnable=()-> System.out.println("it is the job of thread");


        Thread t=new Thread(runnable);
        t.start();

    }
}
