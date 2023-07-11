package com.day4.ex_handling;
class A{}
class B extends A{}
class C extends A{}

class Animal{
    public void sound(){}
}
class Cat extends  Animal{
    public void sound(){
        System.out.println("cat sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog sound");
    }
}

public class C_SomeCommonExInJava {


    public static void main(String[] args) {
        //ArrayStoreExeption

        //        NullPointerException

        //        ArithmeticException

        //        IOException

        //        ArrayIndexOutOfBoundsException
//        int arr[]={3,6,7};
//        System.out.println(arr[5]);
        //        ClassNotFoundException

        //        IllegalArgumentException

        //        FileNotFoundException

        //         IllegalStateException

        //        ClassCastException

        //        ArrayStoreExeption

        //A <---B
        //A<---C
//        A b=new B();
//        A a=new C();
//        if(a instanceof B) {
//            B b1 = (B) a;
//        }else {
//            System.out.println("not possible");
//        }



    }
}
