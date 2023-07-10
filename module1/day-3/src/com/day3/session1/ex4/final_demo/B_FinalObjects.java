package com.day3.session1.ex4.final_demo;
class Val{
    private int val;

    public Val(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
}
public class B_FinalObjects {
    public static void main(String[] args) {

        //this is a local variable
        //constant pointer vs pointer to constant
        //object ie is pointed by v is not constant
        //only pointer is final
       final Val v=new Val(44);
        System.out.println(v.getVal());
      // v=null;
       // v=new Val(55);

        //u can change the state
        v.setVal(v.getVal()*2);
        System.out.println(v.getVal());


    }
}
