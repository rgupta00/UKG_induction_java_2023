package com.day3.session1.ex5.interface_vs_abs.d;

public class UpcastingVsDowncating {
    public static void main(String[] args) {

//        int i=58687;
//        long k= i;//upcasting , plesent
//        System.out.println(k);


        //java is strongly typed language
        long i=5868768767678667676L;
        int k= (int) i;//downcating , forcefully
        System.out.println(k);
    }
}
