package com.demo;
//DIP
//DI: high level module should not resp for creating object of low level module
//rather it should be injected to that...
public class Car {
	
	private Engine engine;
	private Tyre tyre;

	public Car(){
		System.out.println("ctr of car is called");
	}
	//			0				1
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
