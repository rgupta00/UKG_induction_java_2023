package com.day7.session1.guc_demo;

class Task implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            processTheNumber(i);
            //poll the intrept
            if(Thread.currentThread().isInterrupted()){
                System.out.println("stoping the thread...");
                return;
            }
        }
    }

    private void processTheNumber(int i) {
        System.out.println("processing the no: "+ i);
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){}
    }
}
public class Demo {
    public static void main(String[] args) {

        Thread t=new Thread(new Task());
        t.start();
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){}
        Thread.interrupted();
    }
}
