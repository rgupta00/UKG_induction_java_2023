package com.day3.session1.ex7.inner_classes;

class Outer{
    private int i=55;

    class  Inner{
       private int i=555;
        public void foo(){
            System.out.println("foo of Inner class"+ Outer.this.i);//55
            System.out.println("foo of Inner class"+ this.i);//555
        }
    }
    //fooOuter must not static method ..outerwise it will not work
    //static method dont hv this
    public  void fooOuter(){
        Inner in=this.new Inner();
        in.foo();
    }
}
public class A_DemoInnerClass {
    public static void main(String[] args) {
    //how to create the object of inner class
        Outer o=new Outer();
        Outer.Inner in=o.new Inner();
        in.foo();

//        Outer.Inner in=new Outer().new Inner();
//        in.foo();
//
//        Outer.Inner in=new Outer().new Inner();
//        in.foo();

    }
}
