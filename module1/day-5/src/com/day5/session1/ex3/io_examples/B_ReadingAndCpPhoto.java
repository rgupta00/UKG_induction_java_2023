package com.day5.session1.ex3.io_examples;

import java.io.*;

//unique word of the files
public class B_ReadingAndCpPhoto {
    public static void main(String[] args)throws Exception {
        long start=System.currentTimeMillis();
      //  BufferedInputStream
     //   BufferedOutputStream

        BufferedInputStream fis=
                new BufferedInputStream
                        (new FileInputStream("/home/raj/Desktop/photo/ali.jpeg"));

        BufferedOutputStream fos=new BufferedOutputStream(
                new FileOutputStream("/home/raj/Desktop/photo/ali_copy.jpeg"));

        int byteRead=-1;
        while ((byteRead=fis.read())!=-1){
            fos.write(byteRead);
        }

        fis.close();
        fos.close();

        long end=System.currentTimeMillis();





//        FileInputStream fis=new FileInputStream("/home/raj/Desktop/photo/ali.jpeg");
//        FileOutputStream fos=new FileOutputStream("/home/raj/Desktop/photo/ali_copy.jpeg");
//
//        int byteRead=-1;
//        while ((byteRead=fis.read())!=-1){
//            fos.write(byteRead);
//        }
//
//        fis.close();
//        fos.close();
//
//        long end=System.currentTimeMillis();


        System.out.println("time taken: "+ (end-start)+ " ms");

    }
}
