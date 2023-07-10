package com.day3.session1.ex1.relationship_bw_objects;
// subtitablity , extendablity (proof) => inhertance

abstract class Vehicle{
    //data + ctr+ getter /setter
    abstract void  move(String source, String destination);
}
class Metro extends Vehicle{
    void move(String source, String destination){
        System.out.println("moving from "+ source+" to "+ destination+" using metro");
    }
}
class Car extends Vehicle{
    void move(String source, String destination){
        System.out.println("moving from "+ source+" to "+ destination+" using car");
    }
}
class Tractor extends Vehicle{
    void move(String source, String destination){
        System.out.println("moving from "+ source+" to "+ destination+" using Tractor");
    }
}

class Cycle extends Vehicle{
    void move(String source, String destination){
        System.out.println("moving from "+ source+" to "+ destination+" using Cycle");
    }
}
class  Passanger{
    private String passangerName;

    public Passanger(String passangerName) {
        this.passangerName = passangerName;
    }
    //code is flexible
    public void travel(String source, String destination,Vehicle vehicle){
        System.out.println("name of passanger : "+ passangerName);
        vehicle.move(source, destination);
    }

}
public class D_LooseCopling {
    public static void main(String[] args) {
        Vehicle v=new Tractor();
       Passanger passanger=new Passanger("ravi gupta");
       passanger.travel("CP","Noida", v);
    }
}
