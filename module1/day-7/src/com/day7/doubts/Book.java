package com.day7.doubts;

import java.util.Objects;

//121:A234:java:raj:456
public class Book {
    private int id;
    private String isbn;
    private String title;
    private String authorName;
    private int price;

    public Book(int id, String isbn, String title, String authorName, int price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }



    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && price == book.price && Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, title, authorName, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", authorName='").append(authorName).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
