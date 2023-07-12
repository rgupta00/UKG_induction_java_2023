package com.day5.session1.ex1.ob_class;
import java.util.*;
//class  X extends String{
//}
public class Demo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());


        Employee[]employees=new Employee[100];
        Employee e1=new Employee(1,"raj",789900);

        int i=0;
        for(Employee e: employees){
            e=new Employee(1,"raj",789900);
        }

       // e1=null;

        System.gc();//req hey come on
        Runtime.getRuntime().gc();// two method





        System.out.println("done");
//        Employee e2=new Employee(1,"raj",789900);
//
//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//
//        Map<Employee, String> map=new HashMap<Employee, String>();
//        map.put(new Employee(1,"raj",789900), "raj");
//
//        if(map.containsKey(new Employee(1,"raj",789900))){
//            System.out.println("yes");
//        }else
//            System.out.println("no");




        //*if two objects are equals() then there hashcode() must be same*

//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//
//        if(e1.equals(e2)){
//            System.out.println("are eq");
//        }else
//            System.out.println("not eq");












//
//        Employee e=new Employee(1,"raj",789900);
    //    System.out.println(e);
//        String s1="india";
//        String s2=new String("india");
//       if(s1==s2)
//           System.out.println("yes");
//       else
//           System.out.println("no");

    }
}
