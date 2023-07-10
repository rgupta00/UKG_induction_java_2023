package com.day3.session1.ex10.need_of_covarient_returntype;

import java.util.Random;

class M{
    @Override
    public String toString(){
        return "hello ";
    }
}
public class MCQ2 {
    public static void main(String[] args) {
        M a=new M();
        M a2=a;

        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
//        System.out.println(a);
//        System.out.println(a2);
    }
}
