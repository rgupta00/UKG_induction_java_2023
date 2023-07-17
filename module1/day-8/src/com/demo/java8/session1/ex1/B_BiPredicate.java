package com.demo.java8.session1.ex1;

import java.util.function.BiPredicate;




public class B_BiPredicate {
    public static void main(String[] args) {
       //a > b T or F
        BiPredicate<Integer, Integer> p1=( x,  y)-> x>=y;

        //name1 > name2 T or else F
        BiPredicate<String, String>p2=( s,  s2)-> s.compareTo(s2)>0;




        boolean result= p1.test(3,5);
        System.out.println(result);

    }
}
