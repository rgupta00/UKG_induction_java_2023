package com.day4.ex_handling4;

import sun.awt.WindowIDProvider;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

/*

Automatic Resource Mgt : Java 7
purpose : programmer not need to close the resouce
 */
//Autoclosable Java 7
class Window implements AutoCloseable {
    public Window(){
        System.out.println("ctr of window");
    }
    @Override
    public void close() throws IOException {
        System.out.println("close method");
    }
    public void doWork(){
        System.out.println("do work of window class");
    }
}
class Door implements AutoCloseable {
    public Door(){
        System.out.println("ctr of Door");
    }
    @Override
    public void close() throws IOException {
        System.out.println("close method of door");
    }
    public void doWork(){
        System.out.println("do work of door class");
    }
}
public class C_UnderstandingARM {
    public static void main(String[] args) {
        try(Window window=new Window()){
            window.doWork();
        }catch (Exception ex){
            System.out.println("some ex happens "+ ex);
        }
    }
}
