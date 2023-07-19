package com.doubts;
import java.util.*;
import java.util.stream.Collectors;

class EmpSalarySorter implements Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return Double.compare(o2.getSalary(), o1.getSalary());
    }
}

class Emp implements Comparable<Emp>{
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    //java call it
    //e1.compareTo(e2)
    @Override
    public int compareTo(Emp o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
public class RequirmentOfComparable {
    public static void main(String[] args) {

        List<String> list2=new ArrayList<>();
        list2.add("foo");
        list2.add("bar");
        list2.add("jar");
        Collections.sort(list2);


        List<Emp> emps=new ArrayList<>();
        emps.add(new Emp(1,"raj",70000.00));
        emps.add(new Emp(2,"amit",78000.00));
        emps.add(new Emp(3,"sumit",50000.00));

        Collections.sort(emps);
        System.out.println("-------------emp sorted as per id--------------");
        for(Emp e: emps){
            System.out.println(e);
        }

        Collections.sort(emps, new EmpSalarySorter());
        System.out.println("-------------emp sorted as per salary--------------");
        for(Emp e: emps){
            System.out.println(e);
        }

        //i want name of all emp sorted as per salary in desc order

        List<String> namesOnly=emps
                .stream()
                //.sorted(new EmpSalarySorter())
//                .sorted(new Comparator<Emp>() {
//                    @Override
//                    public int compare(Emp o1, Emp o2) {
//                        return Double.compare(o2.getSalary(), o1.getSalary());
//                    }
//                })
              //  .sorted(( o1,  o2) -> Double.compare(o2.getSalary(), o1.getSalary()))
                .sorted(Comparator.comparing(Emp::getSalary).reversed())
                .map(emp-> emp.getName())
                .collect(Collectors.toList());


        namesOnly.forEach(name-> System.out.println(name));

    }
}
