package com.day3.session1.ex7.inner_classes;
interface Cal{
    public int add(int a, int b);
}
interface MyName{
    public String appendChamps(String name);
}

public class I_DemoLambda2 {
    public static void main(String[] args) {

//        MyName myName=new MyName() {
//            @Override
//            public String appendChamps(String name) {
//                return "you are champs! "+name;
//            }
//        };
//
        MyName myName= name -> "you are champs! "+name;

        String newData=myName.appendChamps("ravi");
        System.out.println(newData);


//        Cal cal=new Cal() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };

//        Cal cal=(int a, int b) ->{
//                return a+b;
//
//        };

//        Cal cal=(int a, int b) ->a+b;

        Cal cal=( a,  b) ->a+b;
        int result=  cal.add(2,4);

        System.out.println(result);

    }
}
