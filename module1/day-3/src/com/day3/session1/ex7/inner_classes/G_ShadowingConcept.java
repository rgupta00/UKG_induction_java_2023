package com.day3.session1.ex7.inner_classes;
//class X{
//   void foo(){
//       System.out.println("foo X");
//   }
//}
//class Y extends X{
//    @Override
//    void foo(){
//        System.out.println("foo X overriden");
//    }
//}

class X{
    static void foo(){
        System.out.println("foo X");
    }
}
class Y extends X{
    static void foo(){
        System.out.println("foo X overriden");
    }
}
public class G_ShadowingConcept {
    public static void main(String[] args) {
        X x=new Y();
        ((Y)x).foo();//Shadowing , which method called is decicide by type of pointer

    }
}
