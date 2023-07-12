package com.day4.ex_handling6.doubts;
class A{
    private int a;
    A(int a){
      this.a=a;
    }
}
class B extends  A{
    private int b;
    B(int a, int b){
        super(a);
        this.b=a;
    }
}
public class DemoDoubt {
    public static void main(String[] args) {
        A a=new B(1,3);

    }
}
