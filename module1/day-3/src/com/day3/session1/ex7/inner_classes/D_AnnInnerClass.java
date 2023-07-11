package com.day3.session1.ex7.inner_classes;
//interface Cookable{
//    int cookFactor=10;
//    void cook();
//}

class Cookable{
    public void fooFinal(){
        System.out.println("foo final ");
    }
    void cook(){
        System.out.println("?");
    }
}
public class D_AnnInnerClass {
    public static void main(String[] args) {


        //ann inner class
        Cookable c=new Cookable() {
            @Override
            public void fooFinal(){
                System.out.println("foo final override ");
            }
           void foo123(){
               System.out.println("foo123 method");
           }
            @Override
            public void cook() {
                System.out.println("street food ");
                foo123();
            }
        };
        c.cook();
       // c.foo123();


//
//        Cookable c2=new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("hotel food");
//            }
//        };
//
//        c2.cook();
//
//        Cookable c3=new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("5 star hotel food");
//            }
//        };
//
//        c3.cook();
//
//
//        Cookable c4=new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("7 star hotel food");
//            }
//        };
//        c4.cook();
    }
}
