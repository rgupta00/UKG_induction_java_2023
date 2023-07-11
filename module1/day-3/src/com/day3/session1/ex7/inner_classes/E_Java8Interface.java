package com.day3.session1.ex7.inner_classes;
//java collection
//raj
//java 8: inside the interface u can have default and static method
interface Stack{
     void push(int i);
     int pop();
     public static void fooStatic(){
         System.out.println("it is a static method inside the interface");
     }
     //default is not related to visiblity here
    // protected default int peek() will not work
    public default int peek(){
         System.out.println(" it is a defult imp");
         return 1;
     }
}
//amit
class StackImpl1 implements Stack{
    @Override
    public int peek(){
        System.out.println(" it is a defult imp overriden");
        return 1;
    }
    @Override
    public void push(int i) {

    }

    @Override
    public int pop() {
        return 0;
    }
}

//sumit

class StackImpl2 implements Stack{

    @Override
    public void push(int i) {

    }

    @Override
    public int pop() {
        return 0;
    }
}

public class E_Java8Interface {
    public static void main(String[] args) {
//what is the use of static method inside the interface ?
        //just to call logic for means for interface

        Stack s=new StackImpl2();

    }
}
