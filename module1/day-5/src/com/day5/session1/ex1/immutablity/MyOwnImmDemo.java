package com.day5.session1.ex1.immutablity;

import java.util.Arrays;
import java.util.Date;

class Foo{
    private int i;

    public Foo() {}

    public Foo(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Foo{");
        sb.append("i=").append(i);
        sb.append('}');
        return sb.toString();
    }
}
final class ImmutableClass{
    final  private int i;
    final  private int arr[];
    final  private Foo foo;
    final  private Date date;

    //dont give setter

    public int getI() {
        return i;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public Foo getFoo() {
        return new Foo(foo.getI());
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public ImmutableClass(int i, int[] arr, Foo foo, Date date) {
        this.i = i;
        this.arr = Arrays.copyOf(arr, arr.length);
        this.foo = new Foo(foo.getI());
        this.date = (Date) date.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImmutableClass{");
        sb.append("i=").append(i);
        sb.append(", arr=").append(Arrays.toString(arr));
        sb.append(", foo=").append(foo);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
public class MyOwnImmDemo {
    public static void main(String[] args) {
        int arr[]={3,6,7};

        Foo foo=new Foo();
        foo.setI(333);

        Date date=new Date();

        //int i, int[] arr, Foo foo, Date dat
        ImmutableClass ob=new ImmutableClass(11,arr, foo, date);

        System.out.println(ob);

        arr[0]=1777;
        foo.setI(foo.getI()+300);

        date.setDate(19);//marked for deprecated

        System.out.println(ob);

        int arr2[]=ob.getArr();
        arr2[2]=10000;



    }
}
