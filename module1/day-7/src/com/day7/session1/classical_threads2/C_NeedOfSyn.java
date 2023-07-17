package com.day7.session1.classical_threads2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//cl, c2 c3
//any object in java can act as lock
//this is a shared object
//java 5: juc : java util concurrent package
//Thread pool ++
//java 5 Lock and Renteract
class Printer{
    //private Object lock=new Object();
    private Lock l=new ReentrantLock(true);
    //c1 c2 c3
    public  void printLetter(String letter){
        //
        //
       try{
           l.lock();
           System.out.print("[");
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){}

           System.out.println( letter+ "]");
       }finally {
           l.unlock();
       }
    }
            //
        ///

}
class Job implements Runnable{
    private Printer printer;
    private String  letter;

    public Job(Printer printer, String letter){
        this.printer=printer;
        this.letter=letter;
    }
    @Override
    public void run() {
        printer.printLetter(letter);
    }
}



//Compo
//class Client implements Runnable{
//    private Printer printer;
//    private String  letter;
//
//    private Thread thread;
//
//    public Client(Printer printer, String letter){
//        this.printer=printer;
//        this.letter=letter;
//        this.thread=new Thread(this);
//        thread.start();
//    }
//    @Override
//    public void run() {
//        printer.printLetter(letter);
//    }
//}
public class C_NeedOfSyn {
    public static void main(String[] args) {

        Printer printer=new Printer();

        Thread c1=new Thread(new Job(printer, "java is best"));
        Thread c2=new Thread(new Job(printer, "java is @%&"));
        Thread c3=new Thread(new Job(printer, "python is best"));

        c1.start();
        c2.start();
        c3.start();


//        Client c1=new Client(printer,"java is best");
//        Client c2=new Client(printer,"java is $@###");
//        Client c3=new Client(printer,"python data science that i want to learn");


    }
}
