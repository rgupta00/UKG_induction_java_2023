package com.day2.session1.relationshipbwtheobject;

import sun.security.jgss.krb5.Krb5InitCredential;

import java.io.PushbackInputStream;

/*

 */
//dad
//class  KrishnaDairy{
//    //overloading
////    void sellMilk(int i){
////        System.out.println("sellmilk method");
////    }
//    void sellMilk(){
//        System.out.println("normal milk");
//    }
//}
////krishna
//class ImportedKrishnaDairy extends KrishnaDairy{
//    //overriding
//     @Override  //Java 5: annotation : aka meta data ie data about data*
//    void sellMilk(){
//        System.out.println("pasteurized milk");
//    }
//}

//class A{
//    int i=6;
//    void foo(){
//        System.out.println("foo method : "+i);
//    }
//}
//class B extends A{
//    int j=66;
//
//    void foo(){
//      super.foo();//inhertance support resuablity
//        System.out.println("foo2 of class B "+j +" : "+i);
//    }
//}

class A{
    int i=6;
    public A(int i){
        this.i=i;
    }
}
class B extends A{
    int j=66;
    public B(int i, int j){
        super(i);
        this.j=j;
    }
}

public class B_InheritanceEx {
    public static void main(String[] args) {
        A a=new B(3,7);
    }
}
