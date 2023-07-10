package com.day3.session1.ex5.interface_vs_abs.a;

public class StackRavi implements Stack{
    private int arr[];
     private int top;
     private final  int SIZE=5;

    public StackRavi() {
        this.arr = new int[5];
        this.top=-1;
    }
    public int pop(){
        if(top==-1){
            System.out.println("no element is found");
            return -1;
        }
        return arr[top--];
    }
    public void push(int el){
        if(top==SIZE-1){
            System.out.println("no element can be added");
        }
         arr[++top]=el;
    }
}
