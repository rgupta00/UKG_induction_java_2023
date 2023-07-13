package com.day6.session1.basics_collections;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

import java.util.*;
class Dog{}
class Cat{}
class Emp{}
public class A_ArrayListBasics {
    public static void main(String[] args) {
        //Car c=new Car()  bad code
        //Vehicle v=new Car() good code
       //design as per interface
        //Generic: java 5=> type safty to the data str
        //Wrapper class , autoboxing and unboxing

//        List list=new ArrayList();
//
//        list.add(new Cat());
//        list.add(new Dog());
//        list.add(33);

        //...

//        Cat cat=(Cat)list.get(1);

//       Object ob=list.get(1);
//
//        System.out.println("----------------");




//        //java 5
//        List<String> list=new ArrayList<String>();
//        list.add(new StringBuilder("foo").toString());
//        list.add("car");
//        list.add(new String("abc"));



        int arr[]={3,6,7};
//        for(int temp: arr){
//            System.out.println(temp);
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //java 7
        List<String> list=new ArrayList<>();
        list.add(new StringBuilder("foo").toString());
        list.add("car");
        list.add(new String("abc"));

        //System.out.println(list);

        //syntex suger => under the hood it use iterator pattern

//        for(String temp: list){
//            System.out.println(temp);
//        }

        //Demo of iterator

//        System.out.println(list);//foo car abc
//        Iterator<String> it=list.iterator();
//        while (it.hasNext()){
//            String data=it.next();
//            if(data.equals("car")){
//                it.remove();
//            }
//        }
//        System.out.println(list);// foo abc


        System.out.println(list);//foo car abc
        ListIterator<String> it=list.listIterator(list.size());
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        //do yourself
        //How to add/delete/update a value using ListIterator
       // System.out.println(list);// foo car abc



        //univeral
       // Iterator: iterate + delete
        // ListIterator: iterate + CRUD + back and forth
        //Enumeration : Vector : lagacy class: it only help u to iterator

    }


}













