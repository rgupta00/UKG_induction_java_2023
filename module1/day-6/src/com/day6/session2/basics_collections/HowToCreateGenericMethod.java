package com.day6.session2.basics_collections;
//u need to create a method that can compare any 3 object
class Emp implements Comparable<Emp>{
    private int id;
    private double name;

    public Emp(int id, double name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    @Override
    public int compareTo(Emp o) {
        return Double.compare(o.getName(), this.getName());
    }
}
public class HowToCreateGenericMethod {
    public static void main(String[] args) {
        Integer a=8866;
        Integer b=-5;
        Integer c=944;
        Integer maxValue=max(a, b, c);

        Emp e1=new Emp(441,6000);
        Emp e2=new Emp(19,59000);
        Emp e3=new Emp(109,560000000);

        System.out.println(maxValue);

        Emp maxSalaryEmp=max(e1,e2,e3);

        System.out.println(maxSalaryEmp);




    }
    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m=a;
        if(b.compareTo(m)>0){
            m=b;
        }
        if(c.compareTo(m)>0){
            m=c;
        }
        return m;
    }
}
