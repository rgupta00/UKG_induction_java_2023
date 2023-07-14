package com.day7.session1.classical_threads2;
//cl, c2 c3
//Printer
//class Printer{
//    //synchronized method vs "synchronized block"
//    private Object lock=new Object();
//    public  void printLetter(String letter){
//        //critical section
//        //
//        //
//        //
//        ///
//       synchronized (lock){
//           System.out.print("[");
//           try{
//               Thread.sleep(1000);
//           }catch (InterruptedException e){}
//           System.out.println( letter+ "]");
//       }
//        //
//        ///
//        //
//    }
//}

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Printer{
    //synchronized: it downside* no way to put fairness
    //  interface ---> imp
    //java 5: Lock-> ReeterntLock, ReadWriteLock

    private Lock lock=new ReentrantLock(true);

    public  void printLetter(String letter){

        //
        ///
       try{
           lock.lock();
           System.out.print("[");
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){}
//           if(1==1)
//                throw new NullPointerException();
           System.out.println( letter+ "]");
       }finally {
           lock.unlock();
       }

        //
       //

    }
}





class Client implements Runnable{
    private Printer printer;
    private String  letter;

    private Thread thread;

    public Client(Printer printer, String letter){
        this.printer=printer;
        this.letter=letter;
        this.thread=new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        printer.printLetter(letter);
    }
}
public class C_NeedOfSyn {
    public static void main(String[] args) {

        Printer printer=new Printer();
        Client c1=new Client(printer,"java is best");
        Client c2=new Client(printer,"java is $@###");
        Client c3=new Client(printer,"python data science that i want to learn");


    }
}
