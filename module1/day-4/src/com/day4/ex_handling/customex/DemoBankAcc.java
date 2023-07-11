package com.day4.ex_handling.customex;

class InvalidRadiusException extends Exception{
    public InvalidRadiusException(String message){
        super(message);
    }
}
class Circle{
    private int radius;
    public Circle(int radius) throws InvalidRadiusException{
        this.radius = radius;
        if(radius<=0)
            throw new InvalidRadiusException("invalid radius "+ radius);
    }
    public double getPerimeter(){
        return Math.PI* radius*2;
    }
}
public class DemoBankAcc {
    public static void main(String[] args) {
        Circle c=null;
       try{
            c=new Circle(-2);
           System.out.println(c.getPerimeter());
       }catch (InvalidRadiusException e){
           System.out.println(e.getMessage());
       }
        System.out.println(c);
    }
}
