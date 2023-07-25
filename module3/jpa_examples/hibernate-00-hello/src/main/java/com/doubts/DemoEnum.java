package com.doubts;

import lombok.*;
//38 40 42 44 46
enum ShirtSize{
    S, M , L, XL , XXL;
}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Shirt{
    private int id;
    private String brand;
    private String color;
    private double price;
    private  ShirtSize size;

}
public class DemoEnum {
    public static void main(String[] args) {
        Shirt shirt=new Shirt(1,"PE","blue",1200.00,ShirtSize.M);

        System.out.println(shirt);
    }
}
