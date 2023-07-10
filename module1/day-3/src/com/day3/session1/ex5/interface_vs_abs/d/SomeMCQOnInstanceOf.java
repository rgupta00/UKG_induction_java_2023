package com.day3.session1.ex5.interface_vs_abs.d;
interface Cookable{
    void cook();
}
class MyFood implements Cookable{
    @Override
    public void cook() {
        System.out.println("food is ready");
    }
}
class Foo{

}
public class SomeMCQOnInstanceOf {
    public static void main(String[] args) {
        MyFood f=new MyFood();
        Foo f2=new Foo();

        if( f2 instanceof Cookable){
            System.out.println("yes");
        }else
            System.out.println("no");

//        if( f instanceof Cookable){
//            System.out.println("yes");
//        }else
//            System.out.println("no");
    }
}
