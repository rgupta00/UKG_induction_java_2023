package com.day6.session1.basics_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A1_HowIteratorWork {
    public static void main(String[] args) {
//        List<String> list=new LinkedList<>();
//        list.add("bus");
//        list.add("car");
//        list.add("foo");
//        System.out.println(list);
//        Iterator<String> it=list.iterator();
//        it.next();
//        it.remove();
      //  it.remove();
        /*
        IllegalStateException
	at java.util.LinkedList$ListItr.remove(LinkedList.java:923)
         */

     //   System.out.println(list);
//
//
        //How to create our own iterator
        List<String> list=new LinkedList<>();
        list.add("bus");
        System.out.println(list);
        System.out.println("----------------------");
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            it.next();
            it.remove();
            System.out.println(it);
        }
        System.out.println(list);












//
//        System.out.println(list.get(0));//O(1)
//        list.add(0,"raj");


//        List<String> list=new LinkedList<>();
//        list.add("bus");
//        list.add("car");
//        list.add("foo");
//        System.out.println(list.get(0));//O(N)
    }
}
