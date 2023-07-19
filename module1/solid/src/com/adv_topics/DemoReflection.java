package com.adv_topics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
class Foo{
    private Foo(){
        System.out.println("dare to call me");
    }
}
public class DemoReflection {
    public static void main(String[] args)throws Exception {

        //framework*
     Class<?> clazz=Class.forName("com.adv_topics.Foo");

     Constructor[]constructors=clazz.getDeclaredConstructors();

        constructors[0].setAccessible(true);

        Object o=constructors[0].newInstance();
        Foo foo=(Foo)o;



//        Emp e1=new Emp(1,"raj",50000);
//        Emp e2=new Emp(11,"ekta",50000);



    //why freamework is intrested in my code*

    //java refl can help u to get the meta data of class at run time
//        Class<?> clazz=e1.getClass();
//        //i want to get info about all methods
//        Method[]methods=clazz.getMethods();
//        for(Method m: methods){
//            System.out.println(m.getName()+": "+ Modifier.toString(m.getModifiers()));
//        }

        //abstraction -> reflection can break abs

        //java reflection is like a janampartri that give
        //inforation about all the meta data of class at run time

    }
}
