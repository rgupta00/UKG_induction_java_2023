package com.demo;
//DIP vs DI vs IOC
public class Demo {

//	@Autowired
//	private Car car;

	public static void main(String[] args) {
		Tyre tyre=new MrfTyre();
		Engine engine=new TurboEngine();

		//i hv used setter
		Car car =new Car();
		car.setEngine(engine);
		car.setTyre(tyre);

		car.drive();
	}
}
