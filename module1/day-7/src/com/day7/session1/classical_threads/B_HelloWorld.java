package com.day7.session1.classical_threads;
//creating extending thread class
//Runnable -->Threads
class MyThread extends Thread{
    public void run(){
        System.out.println("it is job of the thread");
    }
}
public class B_HelloWorld {
    public static void main(String[] args) {

        MyThread t=new MyThread();
        t.start();
    }
}
