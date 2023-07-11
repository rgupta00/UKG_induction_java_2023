package com.day4.ex_handling4;

public class A_NeverThrowsExFromFinallyBlock {
    public static void main(String[] args) {
      try{
          foo();
      }catch (Exception e){
          System.out.println(e);
      }
    }

    //Suppressed exception
    private static void foo() {
        try{
            throw  new NullPointerException();

        }finally {
            throw  new ArithmeticException();
        }
    }
}
