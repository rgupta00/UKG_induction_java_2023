package com.day6.session1.basics_collections;

import java.util.*;

//shopping cart with map
//Map<String, List<Product>>
//class Customer{
//
//}
class Key implements Comparable<Key>{
    private int k;

    public Key(int k) {
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return k == key.k;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    @Override
    public int hashCode() {
        return Objects.hash(k);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Key{");
        sb.append("k=").append(k);
        sb.append('}');
        return sb.toString();
    }
    public int compareTo(Key key){
        return Integer.compare(this.getK(), key.getK());
    }
}


public class D_MapExample2 {
    public static void main(String[] args) {
       Map<Key,String> map=new TreeMap<>();
        map.put(new Key(22),"22");

        System.out.println(map.get(new Key(22)));





       // Map<Customer, List<Product>> map=new HashMap<>();//what is fill ration in map




    }
}