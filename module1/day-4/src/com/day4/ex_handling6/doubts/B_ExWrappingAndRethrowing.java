package com.day4.ex_handling6.doubts;
/*
        Syntex not smentic
 */
class CalcuatorEx extends RuntimeException{
    public CalcuatorEx(Throwable cause) {
        super(cause);
    }
}
class Cal{
    public int divide(int a, int b){
       try{
           if(b==0)
               throw new ArithmeticException("arthmatic ex");
           return a/b;
       } catch (ArithmeticException e){
           throw new CalcuatorEx(e);
       }
    }
}
public class B_ExWrappingAndRethrowing {
    public static void main(String[] args) {
      try{
          Cal c=new Cal();
          int result = c.divide(4,0);
          System.out.println(result);
      }catch (CalcuatorEx e){
          System.out.println(e);
          System.out.println(e.getCause());
      }

    }
}
