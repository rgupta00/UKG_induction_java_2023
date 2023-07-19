package com.solid.b_ocp;
//OCP :(
public class ProcessShape {

	public static void process(Object shape) {
		if(shape instanceof CircleShape) {
			((CircleShape) shape).drawCircle();
		}else if(shape instanceof SquareShape) {
			((SquareShape) shape).drawSquare();
		}else if(shape instanceof TriangleShape) {
			((TriangleShape) shape).drawTriangle();
		}else if(shape instanceof PentaShape) {
			((PentaShape) shape).drawPenta();
		}
	}
}
