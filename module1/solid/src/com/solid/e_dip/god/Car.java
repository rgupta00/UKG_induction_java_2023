package com.solid.e_dip.god;
//DIP
//DI: high level module should not resp for creating object of low level module
//rather it should be injected to that...
public class Car {
	
	private Engine engine;
	private Tyre tyre;
	
	public Car(Engine engine, Tyre tyre) {
		this.engine=engine;
		this.tyre=tyre;
	}
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
