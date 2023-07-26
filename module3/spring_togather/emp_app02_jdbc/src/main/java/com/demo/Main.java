package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        //AbstractApplicationContext > ApplicationContext
        AbstractApplicationContext ctx=
                new AnnotationConfigApplicationContext(FooAppConfig.class);
        ctx.registerShutdownHook();//shut down hook @PreDestroy

        Foo foo=ctx.getBean("foo",Foo.class);
        foo.doWork();
        foo.doWork();

        System.out.println("-------------------");
    }
}
