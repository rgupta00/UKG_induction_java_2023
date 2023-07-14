package com.day6.session2.basics_collections;

import java.lang.reflect.Array;

class UnderFlowEx extends RuntimeException{}
class OverFlowEx extends RuntimeException{}

class Stack<T>{
    private T arr[];
    private int top;
    private int MAX=5;

    public Stack(Class<?>clazz){
        top=-1;
        arr=(T[]) Array.newInstance(clazz, MAX);//**
    }
    public T pop(){
        if(top==-1)
            throw new UnderFlowEx();
        return arr[top--];
    }
    public void push(T data){
        if(top==MAX-1)
            throw new OverFlowEx();
        arr[++top]=data;
    }

}



//class Stack{
//    private int arr[];
//    private int top;
//    private int MAX=5;
//
//    public Stack(){
//        top=-1;
//        arr=new int[MAX];
//    }
//    public int pop(){
//        if(top==-1)
//            throw new UnderFlowEx();
//        return arr[top--];
//    }
//    public void push(int data){
//        if(top==MAX-1)
//            throw new OverFlowEx();
//         arr[++top]=data;
//    }
//
//}
public class DemoStack {
    public static void main(String[] args) {

        Stack s=new Stack(Integer.class);
        s.push(292);
        s.push(292);
        s.push(722);
        s.push(220);
        s.push(122);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }
}
