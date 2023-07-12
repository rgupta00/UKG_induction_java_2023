package com.day5.session1.ex1.doubts;

class Cat{
    void sound(){
        System.out.println("sound method ..");
    }
}
class A{
    //if ex is unchked ex then throws is not mandatory

    public void foo()throws NullPointerException{
       Cat c=null;
       c.sound();
    }
}
public class DemoEx{
    public static void main(String[] args) {
          A a= new A();
          a.foo();

    }
}
