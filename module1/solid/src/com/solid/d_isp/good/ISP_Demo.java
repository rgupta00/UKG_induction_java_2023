package com.solid.d_isp.good;
//ISP
interface Flyable{
    public void fly();
}
interface Swimmable{
    public void swim();
}
class Bird{
    public void sound(){
        System.out.println("sound");
    }
    public void eat(){
        System.out.println("eat");
    }
}
class Eagle extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("flying method is overriden");
    }
}
class Emu extends Bird{

}


public class ISP_Demo {
    public static void main(String[] args) {
    Bird e=new Eagle();
        ((Eagle)e).fly();


    }
}
