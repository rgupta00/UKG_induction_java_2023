package com.day4.ex_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B_CheckedVsUncheckedEx {
    //throw vs throws :
    public static void main(String[] args)throws FileNotFoundException{

        BufferedReader br=new BufferedReader(new FileReader(new File("demo.txt")));
        System.out.println("file is found");


//       try{
//           BufferedReader br=new BufferedReader(new FileReader(new File("demo.txt")));
//           System.out.println("file is found");
//       }catch(FileNotFoundException ex){
//           System.out.println(ex);
//       }
//        System.out.println("done");
    }


}



