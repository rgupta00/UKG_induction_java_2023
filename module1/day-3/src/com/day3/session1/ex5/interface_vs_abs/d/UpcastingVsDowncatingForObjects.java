package com.day3.session1.ex5.interface_vs_abs.d;
class A{
        void foo(){
            System.out.println("foo of base class A");
        }
}
class B extends A{
    void fooB(){
        System.out.println("fooB of base class B");
    }
}
class C extends A{
    void fooC(){
        System.out.println("fooC of base class C");
    }
}
public class UpcastingVsDowncatingForObjects {
    public static void main(String[] args) {
//        B b=new B();
//        A a=b;
//        ((C) a).fooC();

        C c=new C();
        A a=c;
        ((C) a).fooC();


//       B b=new B();
//       A a=b;//using ref of A u can only call method witch are also there in base class
//
//       a.foo();
//
//       //if u want to use exclusive method of class B u have use typecasting
//       ((B) a).fooB();


    }
}
