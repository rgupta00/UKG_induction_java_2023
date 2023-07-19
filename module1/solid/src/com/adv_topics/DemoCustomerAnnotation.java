package com.adv_topics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//how to process anntations
//1. create custom anntation
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    String message() default "u are learner";
}
//2. apply the ann
class MyDemo{
    @MyAnn(message = "u all are champs")
    public void foo(){
        System.out.println("foo method is called");
    }
}
//3. process the ann=> using java reflection
public class DemoCustomerAnnotation {
    public static void main(String[] args) {
        //i want to process that annotation
        //we can use java reflection to process the anntation
        MyDemo d=new MyDemo();
//        Method[]methods=MyDemo.class.getDeclaredMethods();
        Method[]methods=d.getClass().getDeclaredMethods();

        for(Method m: methods){
            //hey method do u have that annotation?
            if(m.isAnnotationPresent(MyAnn.class)){
                //give me that annotation
                MyAnn ann=m.getAnnotation(MyAnn.class);
                //let me process that annotation
                System.out.println(ann.message());
            }
        }




    }
}
