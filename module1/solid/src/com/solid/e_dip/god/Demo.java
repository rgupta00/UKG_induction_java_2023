package com.solid.e_dip.god;
//DIP vs DI vs IOC
public class Demo {

//	@Autowired
//	private Car car;

	public static void main(String[] args) {
		Tyre tyre=new MrfTyre();
		Engine engine=new TurboEngine();
		Car car =new Car(engine, tyre);
		car.drive();
	}
}
