package com.day5.session1.ex0.object_orientation;
class Rectangle{
    private int l;
    private int b;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getArea(){
        return l*b;
    }
}
//class Square extends Rectangle{
//    public Square(int l) {
//        super(l, l);
//    }
//}

class Square{
    private Rectangle rectangle;
    public Square(int l){
        rectangle=new Rectangle(l,l);
    }

    //Square is re using the code of Rectangle class :
    public int getArea(){
        return rectangle.getArea();
    }

    public void changeDimension(int changeValue){
        rectangle.setB(changeValue);
        rectangle.setL(changeValue);
    }

}
public class A_SqRectangeProblem {
    public static void main(String[] args) {
        Square square=new Square(3);
        System.out.println(square.getArea());
        square.changeDimension(5);
        System.out.println(square.getArea());


//        Square sq=new Square(4);
//        System.out.println(sq.getArea());
//        sq.setB(5);
//        System.out.println(sq.getArea());
    }
}
