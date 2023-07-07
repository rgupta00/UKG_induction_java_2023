package com.day2.session1.callbyref;
//swap 2 values by uing call by value
public class A_CallByValue {

    public static void main(String[] args) {
        int i=1;
        int j=2;
        System.out.println("before swaping: "+ i+" : "+ j);
        swap(i,j);
        System.out.println("after swaping: "+ i+" : "+ j);

    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
