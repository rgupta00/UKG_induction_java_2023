package com.day4.ex_handling5;
class Door implements AutoCloseable{

    public Door(){
        System.out.println("it is a ctr");
    }
    @Override
    public void close() throws Exception {
        System.out.println("door is closing");
        throw new ArithmeticException("got ArithmeticException");
    }
    public void doLogic(){
        System.out.println("logic of opening door");
        throw new NullPointerException("got NullPointerException");
    }
}
public class DemoSuppressedEx_ARM {
    public static void main(String[] args) {
//        try(Door d=new Door()){
//            d.doLogic();
//            //ARM ke case me.. the  ex ie thrown from close method is suppressed
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            Throwable[]throwables=  e.getSuppressed();
//            System.out.println("suppressed ex");
//            for(Throwable t: throwables){
//                System.out.println(t.getMessage());
//            }
//        }
    }
}
