package com.demo.java8.session1.ex2;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoLambdaExpession2 {

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 540),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300));

		//print all the book
		//java 8 make syn very simpiler to SQL

		//i want to print all costly book > 500
//		books.stream()
//				.filter(b->b.getPrice()>=500)
//				.map(b-> b.getTitle())
//				.forEach(title-> System.out.println(title));


		//print all books
//		books.stream().forEach(b-> System.out.println(b));
//		books.forEach(b-> System.out.println(b));


		//print costly book > 500
//		books.stream()
//				.filter(Book::isCoslty)
//				.forEach(b-> System.out.println(b));

		books.stream()
				.filter(Book::isCoslty)
				.forEach(System.out::println);

		//i want name of all costly book
		Set<String> namesOnly=
				books.stream()
						.filter(Book::isCoslty)
						.map(b-> b.getTitle())
						.collect(Collectors.toSet());

		//i want sum of all prices

//		double totalPrice=books
//				.stream()
//				.mapToDouble(b-> b.getPrice())
//				.sum();
//
//		System.out.println(totalPrice);

//		double totalPrice=books
//				.stream()
//				.map(b-> b.getPrice())
//				.sum();

		//System.out.println(totalPrice);



		//collection -> streams function -----> terminal operations
		//print name only

		//print total price of all the books


	}
}
