package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 <context:component-scan base-package="com.demo"/>
    <!--<context:annotation-config/>-->
 */
//Bootstrap
@Configuration  //<!--<context:annotation-config/>-->
@ComponentScan(basePackages = {"com.demo"})// <context:component-scan base-package="com.demo"/>
public class AppConfig {
}
