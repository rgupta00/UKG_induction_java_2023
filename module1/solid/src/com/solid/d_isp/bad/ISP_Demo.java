package com.solid.d_isp.bad;
//ISP
class Bird{
    public void sound(){
        System.out.println("sound");
    }
    public void eat(){
        System.out.println("eat");
    }
    public void swim(){
        System.out.println("swim");
    }
    public void fly(){
        System.out.println("fly");
    }
}
class Eagle extends Bird{
    public void swim(){
        throw new RuntimeException("cant swim");
    }
    public void fly(){
        System.out.println("master of flying!");
    }
}
class Duck extends Bird{
    public void swim(){
        throw new RuntimeException("cant swim");
    }
    public void fly(){
        System.out.println("master of flying!");
    }
}

class Emu extends Bird{
    public void swim(){
        throw new RuntimeException("cant swim");
    }
    public void fly(){
        throw new RuntimeException("cant fly");
    }
}

public class ISP_Demo {
    public static void main(String[] args) {

        //raj
        Emu e=new Emu();
        e.swim();

    }
}
