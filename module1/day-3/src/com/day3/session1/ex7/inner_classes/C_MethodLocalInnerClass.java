package com.day3.session1.ex7.inner_classes;
class A{
    int i=5555;
    void foo(){
        //if a local variable declared in a method is used inside the method local inner class
        //then it is considered as "effectively final"
       int i=5;//local variable of method foo() of class A?

        class B{
           // int i=44;
            void fooOfB(){
                //A.this.i
                System.out.println("foo method B class "+i );
            }
        }
       // i++;
       // System.out.println(i);
        B b=new B();
        b.fooOfB();
    }
}
public class C_MethodLocalInnerClass {
    public static void main(String[] args) {

        A a=new A();
        a.foo();
    }
}
