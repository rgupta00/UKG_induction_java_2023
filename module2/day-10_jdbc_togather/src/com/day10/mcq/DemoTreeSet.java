package com.day10.mcq;

import java.util.*;


 class ThreadTest implements Runnable{
    @Override
    public void run() throws IllegalMonitorStateException{

    }
}

class Emp{
    int id;
    public Emp(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //getter, setter, ctr
    //equal and hashcode method is defined properly


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class DemoTreeSet {
    public static void main(String[] args) {
        //how to make a immutable copy of the collection?
        List<String> l=new LinkedList<>();
        l.add("foo");
        l.add("bar");
        List<String> l2=Collections.unmodifiableList(l);
       // l2.add("raj");
        for(String temp: l2){
            System.out.println(temp);
        }



//        //list is pointing to the collection ie not syn
//        List<String> list=new LinkedList<>();
//
//
//        //list is pointing to the collection ie  syn
//        List<String> list2=Collections.synchronizedList(list);
        //t1 and t2


        Set<Emp> emps=new TreeSet<>(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return Integer.compare(o2.getId(), o1.getId());
            }
        });

        emps.add(new Emp(12));
        emps.add(new Emp(56));
        System.out.println(emps.size());
    }
}
