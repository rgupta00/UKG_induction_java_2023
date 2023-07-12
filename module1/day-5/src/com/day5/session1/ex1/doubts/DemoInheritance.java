package com.day5.session1.ex1.doubts;
class A1{
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class B1 extends A1{

    //what is inherited ?

}
public class DemoInheritance {
    public static void main(String[] args) {
        B1 b = new B1();
        b.setI(333);
        System.out.println(b.getI());
    }
}
