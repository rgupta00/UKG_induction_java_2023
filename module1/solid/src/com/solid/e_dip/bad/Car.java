package com.solid.e_dip.bad;

public class Car {
	
	private V8Engine engine=new V8Engine();
	private CeatTyre tyre=new CeatTyre();
	
	public Car() {
	}
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
