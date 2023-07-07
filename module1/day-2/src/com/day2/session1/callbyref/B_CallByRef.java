package com.day2.session1.callbyref;
//swap 2 values by uing call by value
class Value{
    private int val;

    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    public Value(int val) {
        this.val = val;
    }

}
public class B_CallByRef {


    public static void main(String[] args) {

        Value i=new Value(1);
         Value j=new Value(2);

        Value[]values=new Value[2];
        values[0]=i;
        values[1]=j;
        System.out.println();
        changeArrayElement(values);



//        System.out.println("before swaping: "+ i.getVal()+" : "+ j.getVal());
//        swap(i,j);
//        System.out.println("after swaping: "+ i.getVal()+" : "+ j.getVal());

        //when u are passing the ref ...copy of ref is passed

        System.out.println("original value: "+ i.getVal());
        changeId(i);
        System.out.println("changed value: "+ i.getVal());

    }

    public  static void changeArrayElement(Value[] values){
        Value temp=values[0];
        values[0]=values[1];
        values[1]=temp;
    }



    public  static void changeId(Value value){
        //value=new Value(555);
        value.setVal(value.getVal()+10);
    }


    public static void swap(Value a, Value b){
        Value temp=a;
        a=b;
        b=temp;
    }
}
