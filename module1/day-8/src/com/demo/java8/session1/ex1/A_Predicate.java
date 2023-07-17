package com.demo.java8.session1.ex1;

import java.util.function.Predicate;

public class A_Predicate {
    public static void main(String[] args) {
        //give me true if no is even otherwise false

        //ann inner vs lambda

                                            //is a object
        //ann inner class have its own this
//        Predicate<Integer> predicateEven1= new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer no) {
//                return no%2==0;
//            }
//        };

        //lambda dont hv its own this
                                        //peice of code aka method
        Predicate<Integer> predicateEven= no-> no%2==0;

        //if name contain raj T otherwise i want to return F

        Predicate<String> namePredicate= name-> name.contains("raj");

        //if name is of more then 10 char T or else give me false
        Predicate<String> nameLengthPredicate= name-> name.length()>10;

        Predicate<String> containRajAndNameLenthMoreThen10=
                namePredicate.and(nameLengthPredicate).negate();


        System.out.println(containRajAndNameLenthMoreThen10.test("amit gupta ji"));

    }
}
