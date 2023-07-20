package com.day10.doubts;


public class DemoExPropagation {
    public static void main(String[] args) {
      try{
          foo();
      }catch (Exception e){
          System.out.println(e);
      }
    }

    private static void foo() {
        System.out.println("line 1");
        bar();
        System.out.println("line 2");
    }

    private static void bar() {
       int value= jar();
    }

    private static int jar() {
            if(1==1)
                throw new NullPointerException();
        return 12;
    }
}
