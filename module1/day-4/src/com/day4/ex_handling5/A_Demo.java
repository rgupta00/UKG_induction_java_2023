package com.day4.ex_handling5;
class TryEx extends  Exception{}
class FinallyEx extends Exception{}

public class A_Demo {
    public static void main(String[] args) {

      try{
          foo();
      }catch (Exception e){
          System.out.println(e);
      }
    }

    private static void foo() {

    }

}
