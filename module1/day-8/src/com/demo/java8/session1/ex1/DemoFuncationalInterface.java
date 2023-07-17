package com.demo.java8.session1.ex1;
@FunctionalInterface
interface Cal{
	int add(int a, int b);
	default  void foo(){
	}
}
//Name --> hello name
interface Greet{
	public String greet(String name);
}
public class DemoFuncationalInterface {
	public static void main(String[] args) {

//		Greet g=new Greet() {
//			@Override
//			public String greet(String name) {
//				return "hello "+name;
//			}
//		};
//
//		Greet g=(String name)-> {
//				return "hello "+name;
//
//		};

//
//		Greet g= name-> {
//			return "hello "+name;
//
//		};


		Greet g= a-> "hello "+a;

		String message= g.greet("amit");
		System.out.println(message);

//		Cal cal=( a,  b)-> a+b;
//		System.out.println(cal.add(2,4));



		//What is functional interface? SAM
		
		/*
		 * What is functional interface?
		 * @FunctionalInterface
		 * Interface and diamond problem and solution
		 * Interface evolution: default method , static method examples
		 */
	}
}
