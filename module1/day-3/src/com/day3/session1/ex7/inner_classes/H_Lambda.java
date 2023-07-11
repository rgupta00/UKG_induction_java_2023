package com.day3.session1.ex7.inner_classes;
//java 8 lambada expression is actaully most of the time is a good raplacemt of ann.. inner class
//lamada work iff u have only one abs method inside the interface
//SAM: sinle abstract method wala interface FunctionalInterface
@FunctionalInterface
interface Foof{
    void foof();
    static void fooStatic(){}
   default void foof2(){}
}
public class H_Lambda {
    public static void main(String[] args) {
        //java 7==> java 8=> java 8 compiler is more intellegent then java 7 compiler
        //"type inference"

        //peice of code vs object
        Foof f=() -> System.out.println("foof method is overriden");
        f.foof();

//        Foof f=new Foof() {
//            @Override
//            public void foof() {
//                System.out.println("foof method is overriden");
//            }
//        };
//
//        f.foof();
    }
}
