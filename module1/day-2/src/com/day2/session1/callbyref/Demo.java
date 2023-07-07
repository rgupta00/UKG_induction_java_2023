package com.day2.session1.callbyref;

public class Demo {
    //whatever visiblty modifer is there in java
    //can be be appled on instace /static varible

   protected int i=6;//instance varaible=>
    // stored in heap with as the state of the object
    static int j=66;//class varaible  or static variabale
    //it store in method area with the meta data of the class

    public static void foof3(){
        System.out.println("foo3 is a static method");
    }


    public static void foof2(){
        //System.out.println(i);
        System.out.println(j);
        foof3();
       Demo demo=new Demo();
       demo.foof4();
    }

    public void foof4(){
     final   int k=66;//local variable

        System.out.println("foof4 method");
    }

    public void foof(){
        System.out.println(i);
        System.out.println(j);
        foof4();
//        foof3();
//        foof2();
    }

    public static void main(String[] args) {

    }
}
