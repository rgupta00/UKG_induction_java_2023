package com.day6.session1.basics_collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A3_SortingData {
    public static void main(String[] args) {

        //sorting
        List<String> list=new LinkedList<>();
        list.add("car");
        list.add("foo");
        list.add("bus");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
        //BS
        int index=Collections.binarySearch(list,"z1");
        System.out.println(index);
        //how to sort the data

    }
}
