package com.day3.session1.ex5.interface_vs_abs.d;
abstract class Animal{
   abstract public void sound();
}
class Dog extends Animal {
    public void nightWatchManShip(){
        System.out.println("jagate raho bho bho");
    }
    @Override
    public void sound() {
        System.out.println("bho bho");
    }
}
class CosltyDog extends Dog {
    public void nightWatchManShip(){
        System.out.println("jagate raho bho bho with style");
    }
    @Override
    public void sound() {
        System.out.println("bho bho style");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meou meou");
    }
}

public class InstanceOfOperator {
    public static void main(String[] args) {
        //i dont know where is cat and where is dog?
        //me
        Animal [] animals=getAnimals();
        //if animal is dog then ask him to do nightWatchManShip otherwise ask him to sound

        for(Animal a: animals){
            a.sound();
            if(a instanceof Dog)
               ((Dog)a).nightWatchManShip();
        }



    }





    //harsh
    public static Animal[] getAnimals() {
        Animal [] animals={new Dog(), new Dog(), new Cat(), new Cat(),new CosltyDog(), new Dog()};
        return animals;
    }
}
