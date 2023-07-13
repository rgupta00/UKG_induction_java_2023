package com.day6.session1.basics_collections;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLObject;

import java.util.*;

public class A4_SortingDataCustom {
    public static void main(String[] args) {

        //sorting
        List<Employee> list=new LinkedList<>();
        list.add(new Employee(107,"raj",89000));
        list.add(new Employee(81,"ekta",89090));
        list.add(new Employee(109,"gunika",9900));
        list.add(new Employee(109,"gunika",99000));


        printMe(list);
        //u can apply the sort process iff u have impl... Comparable
        Collections.sort(list);
        System.out.println("-------------sorted as per id---------");

        printMe(list);


        Collections.sort(list, new NameSorterThenSalarySorter());
        System.out.println("-------------sorted as per name and then rev salary---------");

        //how to sort the data
        printMe(list);

        System.out.println("---------------------sorting as per name---------------");

//        Collections.sort(list, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        Collections.sort(list, (Employee o1, Employee o2)-> {
//                return o1.getName().compareTo(o2.getName());
//
//        });

//        Collections.sort(list, (Employee o1, Employee o2)-> o1.getName().compareTo(o2.getName()));

        Collections.sort(list, ( o1,  o2)-> o1.getName().compareTo(o2.getName()));

      //  Collections.sort(list,Comparator.comparing(Employee::getSalary));
       printMe(list);


    }

    private static void printMe(List<Employee> list) {
        Iterator<Employee> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
