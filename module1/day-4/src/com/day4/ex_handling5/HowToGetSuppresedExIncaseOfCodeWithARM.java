package com.day4.ex_handling5;
class TryEx1 extends Exception{}
class FinallyEx1 extends Exception{}
public class HowToGetSuppresedExIncaseOfCodeWithARM {
    public static void main(String[] args) {

       try{
           foo();
       }catch (Exception ex){
           System.out.println(ex);
           Throwable []throwables=ex.getSuppressed();
           for(Throwable temp: throwables){
               System.out.println(temp);
           }
       }
    }


    private static void foo()throws Exception {
        Exception t=null;
        try {
            throw new TryEx1();
        } catch (Exception e){
            t=e;
        }
        finally {
            FinallyEx1 e2= new FinallyEx1();
            if(t!=null){
                e2.addSuppressed(t);
            }
            throw e2;
        }
    }





        //    private static void foo()throws Exception {
//
//        try{
//            throw  new TryEx1();
//        }finally {
//            throw new FinallyEx1();
//        }
//    }
}
