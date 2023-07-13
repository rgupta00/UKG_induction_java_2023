package com.day6.session1.basics_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A2_Iterator {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("bus");
        System.out.println(list);
        System.out.println("----------------------");
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String data=it.next();
            System.out.println(data);
            it.remove();
            String data2=it.next();
            System.out.println(data2);


        }
        System.out.println(list);
    }
}
