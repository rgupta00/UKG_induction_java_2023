package com.day4.ex_handling4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

//overriden method can not throw bigger ex (in hierarchy) then base method

//throwing extra unchecked ex form overren method is ok


//class A{
//    A(){
//    }
//
//    void foo() throws IOException {
//        System.out.println("foo of class A");
//    }
//}
//class B extends   A{
//    B(){
//    }
//
//    @Override
//    void foo()throws FileNotFoundException{
//        System.out.println("foo of class A overren");
//    }
//}
//ctr
//overriding
//overloading No rule
class A{
    void foo(int a)throws Exception{

    }
    void foo(int a, int b){

    }

    A() throws NullPointerException{
        System.out.println("ctr of A");
    }
}
class B extends  A {
    B()throws ArithmeticException, Exception{
      super();
        System.out.println("ctr of A");
    }
}
public class OverridingAndExHanding {
    public static void main(String[] args) {






//        A a=new B();
//        try{
//            a.foo();
//        }catch (IOException e){
//
//        }
    }
}
