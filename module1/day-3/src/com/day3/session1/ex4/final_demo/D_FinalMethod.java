package com.day3.session1.ex4.final_demo;
//what is final method?
//class Api{
//   final public void myLogic(){
//
//    }
//}
//class MyString extends String{
//
//}
 class KrishnaDairy{
    public void sellMilk(){
        System.out.println("selling normal milk");
    }
    //final method can be overriden but can be overloded
   final public void galla(){
        System.out.println("it is galla :)");
    }
}
class ImporvedKrishnaDairy extends  KrishnaDairy{
    public void sellMilk(){
        System.out.println("selling pasteurized milk");
        galla();
    }
}

public class D_FinalMethod {
    public static void main(String[] args) {

    }
}
