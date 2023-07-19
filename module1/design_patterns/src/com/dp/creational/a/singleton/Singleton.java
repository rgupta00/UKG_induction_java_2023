package com.dp.creational.a.singleton;

import java.io.Serializable;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
//when u need only one object of a class in whole project
//Runtime

//Attempt 1: Eager
//final public class Singleton{
//    private static Singleton singleton=new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return singleton;
//    }
//}
//------------------multithrading issues--------------
//
//final public class Singleton{
//    //Lazy
//    private  static Singleton singleton;
//
//    private Singleton(){}
//
//    //t1 t2
//    public  static Singleton getInstance(){
//        if(singleton==null){
//            synchronized (Singleton.class){
//                if(singleton==null){
//                    singleton=new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
//}


//singleton can be broken using java reflection

//singleton can be broken using clonning
//singleton can be broken using serilation vs
final public class Singleton {
    //Lazy
    private volatile static Singleton singleton;

    private Singleton(){}

    //t1 t2
    public  static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}






