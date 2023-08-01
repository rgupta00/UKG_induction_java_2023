package com.empapp.doubts;
class ThreadTest2 implements Runnable{

    @Override
    public void run()throws  RuntimeException {
        System.out.println("it is a job");
        //this is a trick ..if u cant throw a checked ex from a method u can
        //wrap into unchecked ex and throw it
        throw new RuntimeException(new InterruptedException());
    }
}
public class Demo3 {
    public static void main(String[] args) {

    }
}
