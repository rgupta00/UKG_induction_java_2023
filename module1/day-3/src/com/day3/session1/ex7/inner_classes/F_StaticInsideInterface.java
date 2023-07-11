package com.day3.session1.ex7.inner_classes;
interface M{
    static void foo(){
        System.out.println("hello");
    }
}

class M1 implements M{

}
public class F_StaticInsideInterface {
    public static void main(String[] args) {
        //***static method of interface can be called with the name of interface only***
        M.foo();

        M m=new M1();
       // m.foo();

    }
}
