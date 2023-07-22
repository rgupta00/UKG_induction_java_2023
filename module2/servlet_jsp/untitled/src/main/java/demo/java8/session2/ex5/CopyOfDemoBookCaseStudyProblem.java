package demo.java8.session2.ex5;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
//		List<Book> booksWithMoreThen400Pages
//				=allBooks.stream()
//				.filter(b->b.getPages()>=400)
//				.collect(toList());
//
//		booksWithMoreThen400Pages.forEach(b-> System.out.println(b));

		
		// 2. Find all books that are java books and more then 400 pages
//		Predicate<Book> p1=b->b.getPages()>=400;
//		Predicate<Book> p2=b->b.getTitle().equals("java");
//		List<Book> booksWithMoreThen400Pages
//				=allBooks.stream()
//				.filter(p1.and(p2))
//				.collect(toList());
//
//		booksWithMoreThen400Pages.forEach(b-> System.out.println(b));
		
		// 3. We need the top three longest books

//		Comparator<Book> comparator=
//				( o1,  o2)-> Integer.compare(o2.getPages(), o1.getPages());
//
//
//
//
//
//		List<Book> top2LogestBook
//				=allBooks.stream()
//				.sorted(( o1,  o2)-> Integer.compare(o2.getPages(), o1.getPages()) )
//				.limit(2)
//				.collect(toList());
//		top2LogestBook.forEach(b-> System.out.println(b));

		// 4. We need from the fourth to the last longest books

		// 5. We need to get all the publishing years

		// 6. We need all the authors names who have written a book

		//i want all the author names
		//List<Book>---> Book --> List<Author>
//		Stream<Stream<Author>>  st=
//				allBooks.stream().map(b->b.getAuthors().stream());
//

//		Stream<Author>  st=
//				allBooks.stream().flatMap(b->b.getAuthors().stream());

//		List<String> names=
//				allBooks.stream()
//						.flatMap(b->b.getAuthors().stream())
//						.map(a->a.getName())
//						.distinct()
//						.collect(toList());

//		Set<String> names=
//				allBooks.stream()
//						.flatMap(b->b.getAuthors().stream())
//						.map(a->a.getName())
//						.collect(toSet());
//
//		names.forEach(n-> System.out.println(n));




		// We need all the origin countries of the authors

//				Set<String> names=
//				allBooks.stream()
//						.flatMap(b->b.getAuthors().stream())
//						.map(a->a.getCountry())
//						.collect(toSet());
//
//		names.forEach(n-> System.out.println(n));


		//

		// We want the most recent published book.
	
		// We want to know if all the books are written by more than one author
//		boolean status= allBooks
//				.stream()
//				.allMatch( book -> book.getAuthors().size()>1);
//
//		System.out.println(status);

//		boolean status= allBooks
//				.stream()
//				.noneMatch( book -> book.getAuthors().size()>1);
//
//		System.out.println(status);

		//we want any book writen by more then one author

		Optional<Book> bookOpt=  allBooks
				.stream()
				.filter(b->b.getAuthors().size()==1)
				.findAny();

		String tiltle= bookOpt.map(b->b.getTitle()).orElse(" not found");
		System.out.println(tiltle);
//		Book book=bookOpt.orElse(null);






		// We want one of the books written by more than one author. (findAny)

		
		// We want the total number of pages published.

	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
	
		// We want all the titles of the books

	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.
		Map<Integer, List<Book>>bookListMap=
				allBooks.stream()
						.collect(Collectors.groupingBy(Book::getYear));

		bookListMap.forEach(( k,  v)-> System.out.println("key: "+k+ " : "+ v));


		

		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays
				.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList
				(new Author("raj", "gupta", "in"),
						new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays
				.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 300, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
