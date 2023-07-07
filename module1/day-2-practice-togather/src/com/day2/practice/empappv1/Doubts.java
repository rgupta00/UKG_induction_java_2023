package com.day2.practice.empappv1;
class A{
     int i=55;

}

class B extends A{
     int i=66;
    public void foo(){
        System.out.println(super.i);
    }
}
public class Doubts {
    public static void main(String[] args) {
        B a=new B();
        a.foo();
    }
}
