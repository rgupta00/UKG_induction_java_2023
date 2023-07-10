package com.day3.session1.ex1.relationship_bw_objects;
//Inhertance
class A{

    private int i;

    A(int i){
        this.i = i;
    }
    public void print(){
        System.out.println("i: "+ i);
    }
}
class B extends  A{

    private int j;

    B(int i, int j){
        super(i);
        this.j = j;
    }
    public void print(){
       super.print();
       //prime purpose of inhertance is code resuablity X
        // subtitablity , extendablity (proof)

        System.out.println("j: "+ j);
    }
}
public class C_ISA {
    public static void main(String[] args) {

        A a=new B(3,6);

    }
}
