package com.day7.session1.classical_threads;

import java.io.BufferedReader;
import java.io.FileReader;

class JobWithEx implements  Runnable{
    @Override
    public void run(){
        try(BufferedReader reader =
                    new BufferedReader(new FileReader("foo.txt"))){
            ///
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
class MyHxHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("thread : "+t.getName()+" ex: "+ e);
    }
}
public class D_HandingExInThreads {
    public static void main(String[] args) {
        //how to handle ex in threads:
        //u have write a call back handler
        //Thread.setDefaultUncaughtExceptionHandler(new MyHxHandler());
        JobWithEx job=new JobWithEx();

        Thread t=new Thread(job);
        t.setUncaughtExceptionHandler(( t1,  e) -> System.out.println(t1+" : "+ e));

        t.start();

    }
}
