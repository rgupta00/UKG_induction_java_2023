package com.day2.session1.callbyref;
class M{
    void foo(){}
}
public class Demo2 {
    M m2=null;
    void foo(){
      //  m2=null;
        M m=new M();
        m2=m;
    }
    void foo2(){
       // System.out.println(i);
        m2.foo();
    }
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        d.foo();
        d.foo2();
    }
}
