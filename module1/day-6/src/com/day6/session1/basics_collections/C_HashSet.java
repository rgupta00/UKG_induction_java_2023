package com.day6.session1.basics_collections;
import java.util.*;

class Product implements Comparable<Product>{
    private int id;
    private double price;

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0;
    }

    //writing good hashcode is not easy topic
    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.getId(), o.getId());
    }
}


public class C_HashSet {
    public static void main(String[] args) {

//        Set<Product> set=new TreeSet<>(( o1,  o2)-> Double.compare(o2.getPrice(), o1.getPrice()));

        //If we are using user define object in Hashset or hashmap
        //dont forget to override eq and hashcode correctly

        Set<Product> set=new HashSet<>();

        set.add(new Product(188,509.00));
        set.add(new Product(16,569.00));
        set.add(new Product(51,5699.00));

        boolean status=set.contains(new Product(188,509.00));
        System.out.println(status);

//       for(Product p: set){
//           System.out.println(p);
//       }

        //Set dont allow duplicate

    }
}
