package com.adv_topics;

import java.util.*;
@FunctionalInterface
interface Foof{
    void foo();
}
//Annnotation is aka meta data
class A{
    void foo(){
        System.out.println("foo A");
    }
    //2010
    @Deprecated
    @SuppressWarnings({"rawtypes","unchecked"})
    public void oldApi(){
        List list=new ArrayList();
        list.add("foo");
        System.out.println("really old code");
    }
}
class B extends  A{
    @Override
    void foo(){
        System.out.println("foo is Overriden");
    }
    public void newApi(){
        System.out.println("really old code");
    }
}
public class DemoAnnotation {
    public static void main(String[] args) {
        B b=new B();
        //b.oldApi();

    }
}
