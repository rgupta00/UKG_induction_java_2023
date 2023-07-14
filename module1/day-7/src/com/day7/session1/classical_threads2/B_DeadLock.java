package com.day7.session1.classical_threads2;
//
public class B_DeadLock {
    public static void main(String[] args) {
        //what is resource for threads
         Object r1="bat";
         Object r2="bat";

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r1){
                    System.out.println("t1 want to get lock on r1(bat)");

                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){e.printStackTrace();}

                    synchronized (r2){
                        System.out.println("t1 want to get lock on r2(ball)");
                    }
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r2){
                    System.out.println("t2 want to get lock on r2");

                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){e.printStackTrace();}

                    synchronized (r1){
                        System.out.println("t2 want to get lock on r1");
                    }
                }
            }
        });

        t1.start();
        t2.start();

    }
}
