//Loose coupling
//   rajat is moving from LN to noida using metro
//   Passnager                          Metro
//3 kind of relatiship :
//IS A
//HAS A
//USE -A

///i can choose abstraction here:Vehicle
//using 2 things: abstract class vs interface (5 year)
abstract  class Vehicle{
    public abstract  void move(String s, String d);
}


class Metro extends Vehicle{
    public void move(String s, String d){
        System.out.println("moving in metro from "+ s+" to "+ d);
    }
}

class Car extends  Vehicle{
    public void move(String s, String d){
        System.out.println("moving using car from "+ s+" to "+ d);
    }
}

class Bike extends  Vehicle{
    public void move(String s, String d){
        System.out.println("moving using bike from "+ s+" to "+ d);
    }
}

class  Passanger {
    private String name;

    public Passanger(String passangerName){
        name=passangerName;
    }

    public void travel(String s, String d, Vehicle vehicle){
        System.out.println("name of passanger is :"+ name);
        vehicle.move(s, d);
    }
}




public class DemoPassangerProblem {

    public static void main(String[] args) {
       // Metro m=new Metro();
        Vehicle vehicle=new Car();
        Passanger p = new Passanger("rajat");
        p.travel("laxmi nagar","Noida",vehicle);


    }
}
