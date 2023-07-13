package com.day6.session2.basics_collections;

import java.util.ArrayList;
import java.util.List;
class Animal{
}
class Cat extends Animal{}
class Dog extends Animal{}

class CostlyCat extends Cat{}
class CostlyDog extends Dog{}

public class Hello {

    public static void main(String[] args) {
        //lower bound

        //upper bound
//        List<? extends Dog> list=new ArrayList<Dog>();
//
//        list.add(new Dog());
//        for(Dog d: list){
//            System.out.println(d);
//        }


        //super


        //extends: is use to print the data
        //extends use as upper bound
//        List<? extends Animal>list=new ArrayList<Animal>();

//        List<? extends Dog>list=new ArrayList<Dog>();

        // List<? extends Dog>list=new ArrayList<CostlyDog>();







        //gnnerics is a compile time safty net
        //mix generic and non generic
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(22);
//        list.add(212);
//
//        List<Double> list2=new ArrayList<>();
//        list2.add(22.99);
//        list2.add(212.7);
//        printMe(list);
//        printMe(list2);
//
//        List<Animal> list3=new ArrayList<>();
//        list3.add(new Animal());
//        list3.add(new Animal());
//
//        printMe(list);
//        printMe(list2);
//        printMe(list3);

    }
    //PECS rule (Producer Extends Consumer Super)

    static void printMe(List<?> list) {
        //list.add(55);
        for(Object temp: list){
            System.out.println(temp);
        }
    }

//    static void printMe(List<? extends Object> list) {
//        //list.add(55);
//       for(Object temp: list){
//           System.out.println(temp);
//       }
//    }
//    static void printMe2(List<Double> list) {
//        for(Double temp: list){
//            System.out.println(temp);
//        }
//    }
}


//it dont support polymorphic behvioural
// List<com.day6.session2.basics_collections.Animal> list=new ArrayList<com.day6.session2.basics_collections.Animal>();

