package com.day4.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExHandling {
    public static void main(String[] args){

        //Write a programm to divide 2 no

        //we can have some special syntex : automatic resource mgt==>ARM
        //resource would be close atomatically by JVM

        try(Scanner sc=new Scanner(System.in)){
            int a, b,c ;
            System.out.println("PE first no");
            a=sc.nextInt();
            System.out.println("PE sec no");
            b=sc.nextInt();
            c=a/b;
            System.out.println("value of c is : "+ c);
        }

        catch (Exception ex){
            System.out.println(ex);
        }

        finally {
            System.out.println("it is no use if u are using ARM");
        }






//        try(Scanner sc=new Scanner(System.in)){
//            int a, b,c ;
//            System.out.println("PE first no");
//            a=sc.nextInt();
//            System.out.println("PE sec no");
//            b=sc.nextInt();
//            c=a/b;
//            System.out.println("value of c is : "+ c);
//        }
//        catch (ArithmeticException ex){
//            System.out.println("pls dont put demo as zero");
//        }catch (InputMismatchException ex){
//            System.out.println("pls only enter ints");
//        }
//        catch (Exception ex){
//            System.out.println("handled ex");
//        }
//
//        finally {
//            System.out.println("it is no use if u are using ARM");
//        }





        //Unchecked ex
//        Scanner sc=null;
//          try{
//               sc = new Scanner(System.in);//Memory leak
//              int a, b,c ;
//              System.out.println("PE first no");
//              a=sc.nextInt();
//              System.out.println("PE sec no");
//              b=sc.nextInt();
//              c=a/b;
//              System.out.println("value of c is : "+ c);
//          }catch (ArithmeticException ex){
//              System.out.println("pls dont put demo as zero");
//          }catch (InputMismatchException ex){
//              System.out.println("pls only enter ints");
//          }finally {
//              sc.close();
//          }

           System.out.println("done");
    }

}
