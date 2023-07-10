package com.day3.session1.ex4.final_demo;
class Person{
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class E_FinalMethodArg {

    public static void main(String[] args) {
        //strictfp?
        final    double i=55.0000;

        final Person person=new Person();
        person.setAge(22);
        System.out.println(person.getAge());
        foo(person);
        System.out.println(person.getAge());
    }

    ///all the method args are local varaible
    //only one modifier is allowed "final" *
    private static void foo(  final Person person) {
        person.setAge(person.getAge()+10);
    }
}
