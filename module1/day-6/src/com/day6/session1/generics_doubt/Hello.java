package com.day6.session1.generics_doubt;

import javafx.animation.ScaleTransition;

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
        //case 1
//        List<Dog> dogs=new ArrayList<Dog>();
//        dogs.add(new Dog());
//        dogs.add(new CostlyDog());
//
//        for(Dog d: dogs){
//            System.out.println(d);
//        }
//
        List<Dog> dogs=new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new CostlyDog());
        foo(dogs);

//        List<Cat> cats=new ArrayList<Cat>();
//        cats.add(new Cat());
//        cats.add(new CostlyCat());

        //foo(cats);
    }

    public static  void foo(List<? super Dog> animals){
        animals.add(new Dog());
        //animals.add(new Cat());

        for(Object a: animals){
            System.out.println(a);
        }
    }


    //extends : upper bound
//    public static  void print(List<? extends Object> animals){
//       // animals.add(null);
//        for(Animal c: animals){
//            System.out.println(c);
//        }
//    }

}