package com.day5.session1.ex3.io_examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//unique word of the files
public class B_ReadingAndCpPhoto {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
      //  BufferedInputStream
     //   BufferedOutputStream

        long end=System.currentTimeMillis();

        System.out.println("time taken: "+ (end-start)+ " ms");

    }
}
