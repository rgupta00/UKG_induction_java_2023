package com.empapp.controller;
//java 5: variable argument method
class Foo{
    //int ...a vs int []a
    public void foo(String temp, int ...a){
        System.out.println(temp);
        for(int t: a){
            System.out.println(t);
        }
    }
}
public class DemoHello {

    public static void main(String[] args) {
        int arr[]={4,6,7,7};
        Foo f=new Foo();
        f.foo("foo",4,7,8);
    }
}
