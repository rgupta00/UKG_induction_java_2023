package com.day3.session1.ex5.interface_vs_abs.b;

//When u should go for interface and when u should go for abstract class
//Kid is a mokey : failing
//only thing is that he have one behavor that is shared with monkey

//"interface break the hierarchy"

//https://stackoverflow.com/questions/55445242/how-do-interfaces-break-dependencies-of-classes

interface Jumpable{
    public void jump();
}
 class Monkey implements Jumpable{
    public void stayOnTree(){
        System.out.println("stayOnTree");
    }
    public void jump(){
        System.out.println("i jump like a champion");
    }
}
class Kid implements Jumpable{
    public void goToSchool(){
        System.out.println("goToSchool :(");
    }
    @Override
    public void jump() {
        System.out.println("i am ever better then monkey in jump process");
    }
}

public class A_Interface_break_the_hierarchy {
    public static void main(String[] args) {
        Kid k=new Kid();
        k.goToSchool();
        k.jump();
        //k.stayOnTree();
    }
}
