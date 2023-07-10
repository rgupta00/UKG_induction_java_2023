package com.day2.practice.ex1;

 class Foo {
    public static void main(String[] args) {
        Bar bar=new Bar();
        bar.bar();
    }
}

public class Bar{
    void bar(){
        System.out.println("bar method of class bar");
    }
}