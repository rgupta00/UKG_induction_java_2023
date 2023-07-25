package com.doubts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("demo2.xml");

        C c=ctx.getBean("c", C.class);
        c.printC();
    }
}
