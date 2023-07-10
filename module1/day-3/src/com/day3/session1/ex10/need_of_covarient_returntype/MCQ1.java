package com.day3.session1.ex10.need_of_covarient_returntype;
//class Foo {}
//class A{
//    public Foo add(){
//        return new Foo();
//    }
//}
//
//class B extends  A{
//    @Override
//    public Object add(){
//        return new Object();
//    }
//
//}

class Foo {}
class A{
    public Object add(){
        System.out.println("add of class A");
        return null;
    }
}

class B extends  A{
    @Override
    public Foo add(){
        System.out.println("add of class B");
        return new Foo();
    }

}

public class MCQ1 {
    public static void main(String[] args) {
        A a=new A();
        Object temp=a.add();
      //  temp.toString();
    }
}
