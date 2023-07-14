package com.day7.doubts;

import java.io.*;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Write an application to read a file data.txt containing data like (actually it is a record of an book consisting of
id, isbn, title, author and price)
file contain data like
books.txt
121:A234:java:raj:456
102:S234:c++:ekta:567
1. read the file and populate records in an LinkedList of books
2. write BookApp
3. write method searchBook(book id)
4. write method sellBook(String isbn, int noOfCopies)
5. write method purchageBook(String isbn,int noOfCopies)
6. if Not sufficient book throw exception NotSufficientBookException
 */
class BookApp{
    private List<Book> books;
    public BookApp(){
        books=new LinkedList<>();

        loadData();
    }

    private void loadData() {
        //read the file
        try(BufferedReader br=new BufferedReader(new FileReader(new File("books.txt")))){
            String line=null;
            while ((line=br.readLine())!=null){
                String []tokens = line.split(":");
                //i need to construct a object out of those tokens and populate java object out of them
                //and put object into the link list
                //int id, String isbn, String title, String authorName, int price
                Book book=new Book(Integer.parseInt(tokens[0]),
                        tokens[1], tokens[2], tokens[3],Integer.parseInt( tokens[4]));
                books.add(book);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public Book searchBook(int id){
        for(Book b: books){
            if(b.getId()==id){
                return b;
            }
        }
        return null;
    }

    public void sellBook(String isbn, int noOfCopies){

    }
    public void purchageBook(String isbn,int noOfCopies){

    }
}
public class DemoBookApp {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        BookApp bookApp=new BookApp();
        List<Book>  books=bookApp.getAllBooks();
        for(Book book : books){
            System.out.println(book);
        }
    }
}
