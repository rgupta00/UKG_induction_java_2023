package com.day2.practice.ex1;

import java.util.Scanner;

abstract class Shape{
   abstract   void getArea();
}
class Circle extends  Shape{
    @Override
    void getArea() {
        System.out.println("PI X r X r");
    }
}
class Square extends  Shape{
    void getArea(){
        System.out.println("L X L");
    }
}

class Triangle extends  Shape{
    void getArea(){
        System.out.println("0.5 X b X h");
    }
}
public class B_Overriding {
    public static void main(String[] args) {
//
//        Shape s=new Shape();
//        s.getArea();

//        Shape t=new Triangle();
//        t.getArea();

        Shape shape=null;
        //Runtime time poly
        System.out.println("PE ur choice");
        System.out.println("1. for T 2 for C and 3 for Square");
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        if(choice==1)
            shape=new Triangle();
        else   if(choice==2)
            shape=new Circle();
        else
            shape=new Square();

        shape.getArea();
    }
}
