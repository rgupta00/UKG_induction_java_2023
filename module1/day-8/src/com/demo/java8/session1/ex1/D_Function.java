package com.demo.java8.session1.ex1;
//A-> B

import java.util.function.Function;
class EmpData{
    private int id;
    private double salary;

    public EmpData(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmpData{");
        sb.append("id=").append(id);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}

class Emp{
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
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
}
public class D_Function {
    public static void main(String[] args) {
       //Function : ek chees of dusri chee me convert karna hey
        //name -> nos
        Function<String, Integer> f= name ->name.length();
        System.out.println(f.apply("rajesh shama"));

        //new Emp -> salary

//        Function<Emp, Double> f2=e-> e.getSalary();
//        Function<Emp, Double> f2=Emp::getSalary;
//
//        Emp e=new Emp(1,"raj",45000);
//
//        Double salary= f2.apply(e);
//
//        System.out.println(salary);

        Function<Emp, EmpData> f3= emp -> new EmpData(emp.getId(), emp.getSalary());


    }
}
