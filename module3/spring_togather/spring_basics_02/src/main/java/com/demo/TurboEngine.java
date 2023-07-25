package com.demo;

import org.springframework.stereotype.Component;

//    <bean id="e" class="com.demo.TurboEngine"/>
@Component(value = "e")
public class TurboEngine implements Engine{
	public void move() {
		System.out.println("turbo engine is working");
	}
}
