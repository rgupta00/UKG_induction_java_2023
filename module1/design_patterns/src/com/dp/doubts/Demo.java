package com.dp.doubts;
class Foo2{
    private static Foo2 f;
   private Foo2(){
        System.out.println("ctr is called");
    }
    static {
        System.out.println("static init block");
    }
    public static Foo2 getInstance(){
       return new Foo2();
    }
}
public class Demo {
    public static void main(String[] args)throws Exception {
        Class.forName("com.dp.doubts.Foo2");
        Foo2.getInstance();
    }
}
