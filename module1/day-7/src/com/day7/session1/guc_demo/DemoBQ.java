package com.day7.session1.guc_demo;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DemoBQ {

    private static BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }

    private static void consumer()throws InterruptedException {
        //InterruptedException *
        while (true){
            System.out.println("got:"+queue.take()+" :"+queue.size());
        }
    }

    private static void produce() throws InterruptedException {
        Random random=new Random();
        while (true){
            try{
                Thread.sleep(new Random().nextInt(1000));
            }catch (InterruptedException e){}

            Integer value=random.nextInt(100);
            System.out.println("put: "+value +" :"+queue.size());
            queue.put(value);//Blocking method
        }
    }
}
