package com.day3.session1.ex9.doubts;
//com.day3.session1.ex9.doubts.Emp     @      677327b6 (hashcode*)
//com.day3.session1.ex9.doubts.Emp      @     677327b6
//public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
 class Emp{
    private int id;
    private String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public   String toString(){
        return "id :"+id+" name: "+name;
    }
}
public class DemoWhatIstoStringMethod {

    public static void main(String[] args) {
        Emp emp=new Emp(1,"raj");
        System.out.println(emp);
    }
}
