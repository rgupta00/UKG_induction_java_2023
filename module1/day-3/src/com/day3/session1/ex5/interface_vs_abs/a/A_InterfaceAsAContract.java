package com.day3.session1.ex5.interface_vs_abs.a;
/*
    What is interface :
    act as a contract bw 2 parties
    or
    it is a specification of a behaviour
 */


public class A_InterfaceAsAContract {

    public static void main(String[] args) {
        //raj need to use the stack class for impl some logic
        // :)
        Stack stack=new StackRavi();
        myLogic(stack);


        System.out.println(Stack.i);

    }

     static void myLogic(Stack stack) {

         stack.push(3);
         stack.push(3);
         stack.push(3);
         stack.push(3);
         stack.push(3);


         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());

    }
}
