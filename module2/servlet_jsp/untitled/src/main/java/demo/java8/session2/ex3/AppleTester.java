package demo.java8.session2.ex3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList
				(new Apple("red", 400),
						new Apple(
				"green", 300),
						new Apple("green", 200),
						new Apple("red", 250));

			Predicate<Apple>
					greenApplePredicate= a->a.getColor().equals("green");

			List<Apple> greenApples=
					AppleApp.getAllApplesOnPredicate(apples, greenApplePredicate);

			//method ref vs lambda
//			Predicate<Apple>
//					heavyApplePredicate= a-> a.getWeight()>=250;

			Predicate<Apple>
					heavyApplePredicate= AppleLogic::isHeavy;


			List<Apple> heavyApples=
					AppleApp.getAllApplesOnPredicate(apples, heavyApplePredicate);

			System.out.println("----------all green apples----");
			for(Apple temp: greenApples){
			System.out.println(temp);
		    }

			System.out.println("----------all heavy apples----");
			for(Apple temp: heavyApples){
				System.out.println(temp);
			}

		//heavy as well as green
			Predicate<Apple> p3=greenApplePredicate.and(heavyApplePredicate);

			List<Apple> heavyAndGreenApples=
					AppleApp.getAllApplesOnPredicate(apples, p3);


		//Most imp functional interface in java 8
		
		//Predicate	
			
		//Function
		
		//Consumer
		
		//biConsumer
		//Map<String, Integer>map=new HashMap<String, Integer>();
		
		//Supplier
	
		
		//BiFunction
	
		
		
		
	}
}

















