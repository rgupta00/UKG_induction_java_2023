package com.day3.session1.ex7.inner_classes;
//
//class Outer{
//    private int i=33;
//    class Inner{
//        private int i=333;
//        public void printI(){
//            System.out.println(this.i);
//            System.out.println(Outer.this.i);
//        }
//    }
//    public  void demo(){
//        Inner inner=this.new Inner();
//        inner.printI();
//    }
////    public static void demo(){
////        Inner inner=new Inner();
////        inner.printI();
////    }
//}


class Outer{
    private int i=33;
    private class Inner{
        private int i=333;
        public void printI(){
            System.out.println(this.i);
            System.out.println(Outer.this.i);
        }
    }

}
public class A_DemoInnerClass {
    public static void main(String[] args) {

      //  Outer o=new Outer();
//       Outer.Inner inn=o.new Inner();
//        Outer.Inner inn2=o.new Inner();
//        Outer.Inner inn3=o.new Inner();

        //or

//        Outer.Inner inn=new Outer().new Inner();
//        Outer.Inner inn2=new Outer().new Inner();
//        Outer.Inner inn3=new Outer().new Inner();


    }
}
