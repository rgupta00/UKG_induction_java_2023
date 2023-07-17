package com.demo.java8.session2.ex4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishTesterExample {
	
	public static void main(String[] args) {
		List<Dish> allDishes=getAllDishes();
		//Return the names of dishes that are low in calories (<400),
		//Sorted by number of calories
//		List<String> namesOnly=
//				allDishes.stream()
//						.filter(dish-> dish.getCalories()<400)
//						.sorted(( o1,  o2)-> Double.compare(o2.getCalories(), o1.getCalories()))
//						.map(dish-> dish.getName())
//						.collect(Collectors.toList());
//		System.out.println(namesOnly);

//		List<String> namesOnly=
//				allDishes.stream()
//						.filter(dish-> dish.getCalories()<400)
//						.sorted(Comparator.comparing(Dish::getCalories))
//						.map(dish-> dish.getName())
//						.collect(Collectors.toList());
//		System.out.println(namesOnly);

//		Stream<String> namesOnly=
//				allDishes.stream()
//						.filter(dish-> dish.getCalories()<400)
//						.sorted(Comparator.comparing(Dish::getCalories))
//						.map(dish-> {
//							System.out.println("map method ..");
//							return dish.getName();
//						});
//
//		namesOnly.forEach(name-> System.out.println(name));
//		System.out.println("----------------------");

		//u can not use same stream twice
//		Stream<String> s1=Arrays.asList("foo","bar").stream();
//		s1.forEach(n-> System.out.println(n));
		//s1.forEach(n-> System.out.println(n));

		/*
		filtering: pork
		mapping: pork
		filtering: beef
		mapping: beef
		filtering: chicken
		mapping: chicken
		 */
//		List<String> names = allDishes.stream()
//				.filter( d->{
//					System.out.println("filtering: "+d.getName());
//					return d.getCalories()>300;
//				})
//				.map(d->{
//					System.out.println("mapping: "+d.getName());
//					return d.getName();
//				})
//				.limit(2)
//				.collect(Collectors.toList());


				List<String> names = allDishes.stream()
				.filter( d-> d.getCalories()>300)
						.peek(d->System.out.println("filtering: "+d.getName()))
				.map(d->d.getName())
						.peek(name-> System.out.println("mapping "+name))

				.limit(2)
				.collect(Collectors.toList());

	}
	
	//[season fruit, prawns, rice]
	//[rice, prawns, season fruit]
	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		return disheds;
	}
}
