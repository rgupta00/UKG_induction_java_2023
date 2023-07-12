package com.day5.session1.ex3.io_examples;
import java.io.*;
//unique word of the files
public class A_HelloWorld {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try(FileReader fr= new FileReader(new File("data.txt"))){
            int data=1;
            while ((data=fr.read())!=-1){
                System.out.println(data);
            }
        }catch (FileNotFoundException ex){
            System.out.println("file is not found");
        }
        catch (IOException ex){
            System.out.println("some io ex");
        }



//
//        try{
//            FileReader fr= new FileReader(new File("data.txt"));
//            int data=1;
//            while ((data=fr.read())!=-1){
//                System.out.println(data);
//            }
//        }catch (FileNotFoundException ex){
//            System.out.println("file is not found");
//        }
//        catch (IOException ex){
//            System.out.println("some io ex");
//        }


//       try{
//           BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
//           String line=null;
//           while ((line=br.readLine())!=null){
//               System.out.println(line);
//           }
//
//       }catch (FileNotFoundException ex){
//           System.out.println("file is not found");
//       }
//       catch (IOException ex){
//           System.out.println("some io ex");
//       }

        long end=System.currentTimeMillis();
        System.out.println("time taken: "+ (end-start)+ " ms");

    }
}
