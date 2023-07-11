package com.day3.session1.ex7.inner_classes;

interface Foof2{
    void foo();
}
public class J_MainDiffByLambaAndAnnInnerClass {
    int i=666;
    public static void main(String[] args) {
        J_MainDiffByLambaAndAnnInnerClass ob=new J_MainDiffByLambaAndAnnInnerClass();
        ob.demo();
    }
    public  void demo(){

        Foof2 foo2=new Foof2() {
            int i=55;
            @Override
            public void foo() {
                System.out.println("foo overriden "+this.i);
            }
        };
        foo2.foo();

    }
}
