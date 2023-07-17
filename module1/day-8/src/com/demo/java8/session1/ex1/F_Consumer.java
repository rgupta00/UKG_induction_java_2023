package com.demo.java8.session1.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class F_Consumer {
    public static void main(String[] args) {

        //use
        List<String> list= Arrays.asList("foo","foo kumar","jar");

        list.stream()
                .filter(name-> name.contains("foo"))
                .map(name-> "Mr. ".concat(name))
                .map(name-> "Mr. ".concat(name).length())
                .parallel()
                .forEach(name-> System.out.println(name));

//        Supplier<String> supp=() -> "india";
//        System.out.println(supp.get());

//        Consumer<String> consumer= s-> System.out.println(s);
//
//        BiConsumer<String, Double> consumer2=(name, salary)
//                -> System.out.println(name+" :"+  salary);
//
//      consumer2.accept("rajiv",672222.00);


    }
}
