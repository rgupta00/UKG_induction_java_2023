package com.demo;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//DIP
//DI: high level module should not resp for creating object of low level module
//rather it should be injected to that...
/*
  <bean id="c" class="com.demo.Car" autowire="byType">
    </bean>
 */
@Component(value = "c")
public class Car {
	//field injection

	private Engine engine;

	private  Tyre tyre;

	public Car(Engine engine, Tyre tyre) {
		System.out.println("para ctr is called");
		this.engine=engine;
		this.tyre=tyre;
	}

	public void setEngine(Engine engine) {
		System.out.println("setEngine is called");
		this.engine = engine;
	}

	public void setTyre(Tyre tyre) {
		System.out.println("setTyre is called");
		this.tyre = tyre;
	}
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
