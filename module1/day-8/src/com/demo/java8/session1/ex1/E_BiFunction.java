package com.demo.java8.session1.ex1;

import java.util.function.BiFunction;

public class E_BiFunction {
    public static void main(String[] args) {
        //          in1    in2     out
        BiFunction<String, String, String> f=
                ( name,  surname)-> name.concat(surname);
        String combinedName= f.apply("Rajiv ","gupta");
        System.out.println(combinedName);
    }
}
