package com.day7.session1.classical_threads;
//how to start the threads in java : LWP
//Job and worker
class MyJob implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is started "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){}

        System.out.println("thread is ended "+Thread.currentThread().getName());
    }
}
public class A_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Start : "+Thread.currentThread().getName()+
                ": "+Thread.currentThread().getPriority());
        System.out.println("it is main");

        MyJob job=new MyJob();
        Thread thread1=new Thread(job,"A");
        Thread thread2=new Thread(job,"B");
        Thread thread3=new Thread(job,"C");

        thread1.start();
        thread2.start();
        thread3.start();

       try{
           thread1.join();//thraed1 is saying to main join after me
           thread2.join();
           thread3.join(1000,12000);
       }catch (InterruptedException e){

       }

    //how to ensure main should finish at end

        System.out.println("end : "+Thread.currentThread().getName()+
                ": "+Thread.currentThread().getPriority());
    }
}
