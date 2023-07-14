package com.day7.java8.session2.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.day7.java8.session2.ex4.Dish.Type;

public class DishTesterExaple2 {
	
	public  DishSelectedField getDishSelectedField(Dish d){
		return new DishSelectedField(d.getName(), d.getCalories());
	}
	public static void main(String[] args) {

		List<Dish> allDishes = getAllDishes();
		// Example: return the names of dishes that are low in calories (<400) sorted by number of calories

		// Getting all veg dishes
	
		// Get list of All Dishes only containing name and calValue
		
		// create a List by selecting the first three dishes that have more than 300 calories
		
		
		/*
		 * allMatch, anyMatch,noneMatch, findFirst, findAny
		 */

		// find out whether the menu has a vegetarian option: anyMatch
		
		// find out whether the menu ishealthy :allMatch
		// (ie. all dishes are below 1000 calories):
		
		// noneMatch: opposite of allMatch

		// find if any food item is veg? findAny
		
		// Primitive stream specializations

		// IntStream,DoubleStream, and LongStream==> avoide boxing cost

		// get all the cal values of all food items
				
		// using primitive stream
		// find max cal values for all dishes, Optional
		/*
		 * What type of quaries Collect helps:Collectors.groupingBy(..)
		 * ------------------------------------- 
		 * 1. Dishes grouped by type 
		 * 2. Dishes grouped by caloric level 
		 * 3. Dishes grouped by type and then caloric level 
		 * 4. Count dishes in each groups 
		 * 5. Most caloric dishes by type 
		 * 6. Sum calories by type
		 */

		// Dishes grouped by type
		
		// Dishes grouped by calorific level
		/*
		 * if (dish.getCalories() <= 400)
				return CaloricLevel.DIET;
			else if (dish.getCalories() <= 700)
				return CaloricLevel.NORMAL;
			else
				return CaloricLevel.FAT;
		 * 
		 */

		// Dishes grouped by type and then caloric level
		allDishes.stream().collect(Collectors.groupingBy((Dish dish)-> {
				if (dish.getCalories() <= 400)
					return CaloricLevel.DIET;
				else if (dish.getCalories() <= 700)
					return CaloricLevel.NORMAL;
				else
					return CaloricLevel.FAT;
			
		}));
		
	}

	

	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(new Dish("pork", false, 800,
				Type.MEAT), new Dish("beef", false, 700, Type.MEAT),
				new Dish("chicken", false, 400, Type.MEAT), new Dish(
						"french fries", true, 530, Type.OTHER), new Dish(
						"rice", true, 350, Type.OTHER), new Dish(
						"season fruit", true, 120, Type.OTHER), new Dish(
						"pizza", true, 550, Type.OTHER), new Dish(
						"prawns", false, 300, Type.FISH), new Dish(
						"salmon", false, 450, Type.FISH));
		return disheds;
	}

}
