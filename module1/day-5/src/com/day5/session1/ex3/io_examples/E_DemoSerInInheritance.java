package com.day5.session1.ex3.io_examples;

import java.io.*;

class A {
    int i=10;
    public A(){
        System.out.println("it is a ctr A");
    }
}
class B extends A implements Serializable {
    int j=10;
    public B(){
        System.out.println("it is a ctr B");
    }
}
public class E_DemoSerInInheritance {
    public static void main(String[] args)throws Exception {
//        ObjectOutputStream oos =
//                new ObjectOutputStream(new FileOutputStream("demo.txt"));
//        B b=new B();
//        b.i=567;
//        b.j=123;
//
//        oos.writeObject(b);
        System.out.println("---------------");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.txt"));

        B b=(B)ois.readObject();
        System.out.println(b.i);
        System.out.println(b.j);



    }
}



