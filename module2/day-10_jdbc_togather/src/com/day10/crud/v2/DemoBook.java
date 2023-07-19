package com.day10.crud.v2;

import java.util.ArrayList;
import java.util.List;

class Book{
    private int id;
    private int price;

    public Book(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class DemoBook {
    public static void main(String[] args) {
        List<Book>books = new ArrayList<>();
        books.add(new Book(1,100));
        books.add(new Book(18,600));
        books.add(new Book(71,300));

//        int total=books.stream()
//                .map(b-> b.getPrice())
//                 .reduce(100, (x,y)->x+y);
//        int total=books.stream()
//                .mapToInt(b-> b.getPrice())
//                        .sum();
        //System.out.println(total);


    }
}
