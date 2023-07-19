package com.doubts;
class FooEx extends Exception{}
//Ex wrapping and rethowing
class MyEx extends Exception{
    public MyEx(String message){
        super(message, new FooEx() );
    }


}
public class DemoEx {
    public static void main(String[] args) {

        try{
            throw new MyEx("hello ");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
