package a.c;
import a.b.*;
public class B extends A{
    public static void main(String[] args) {

        B b=new B();
        System.out.println(b.k);
        System.out.println(b.j);

       b.fooProtected();

//        A a=new A();
//        System.out.println(a.j);
//        a.fooPublic();
    }
}
