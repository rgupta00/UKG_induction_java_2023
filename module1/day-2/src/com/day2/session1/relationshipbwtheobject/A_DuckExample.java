package com.day2.session1.relationshipbwtheobject;

class Duck{
    private String color;
    public Duck(String color){
       this.color = color;
    }
    //behaviour of duck
    public void swim(){
        System.out.println("duck is swimming .."+ color);
    }
}

 class Pond{
    private Duck[] ducks=new Duck[5];

    public Pond(){
        init();
    }
    public  void init(){
        for(int i=0;i<ducks.length;i++){
            ducks[i]=new Duck("White");
        }
    }
    public void showPond(){

        for(Duck d: ducks){

            d.swim();
        }
    }

}

public class A_DuckExample {

    public static void main(String[] args) {
        Pond p=new Pond();
        p.showPond();
    }

}
