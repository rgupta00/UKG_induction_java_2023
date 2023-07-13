package com.day6.session2.basics_collections;

import com.sun.deploy.util.Waiter;

//generic can help u design application better
interface Floable{}
interface Drinkable{}

class Juice implements Floable,Drinkable{}
class Water implements Floable,Drinkable{}
class Petrol implements Floable{}
class Cake {}
//class Glass<T>{
//    private T ob;
//    public T getOb() {
//        return ob;
//    }
//    public void setOb(T ob) {
//        this.ob = ob;
//    }
//}
class Glass<T extends Floable>{
    private T ob;
    public T getOb() {
        return ob;
    }
    public void setOb(T ob) {
        this.ob = ob;
    }
}
public class DemoGenerics {
    public static void main(String[] args) {
        //step 3

//        Glass<Floable> glass = new Glass<Floable>();
//        glass.add(new Water());

       Glass<Petrol> glass = new Glass<>();
       glass.setOb(new Petrol());

        //step 2
//       Glass<Juice> glass = new Glass<>();
//       glass.setOb(new Juice());
//       Juice j=glass.getOb();

//
//        Juice j= (Juice) glass.getOb();


    }
}




//Without generics : java 1.4
//class Glass{
//    private Object ob;
//
//    public Object getOb() {
//        return ob;
//    }
//
//    public void setOb(Object ob) {
//        this.ob = ob;
//    }
//}
