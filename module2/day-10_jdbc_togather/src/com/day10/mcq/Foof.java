package com.day10.mcq;
import java.io.*;
interface xyz {
	void abc() throws IOException;
}

interface pqr {
	void abc() throws FileNotFoundException;
}

class Implementation implements xyz, pqr {
	public void abc() throws FileNotFoundException {
		/* implementation */
	}
}



public class Foof{
public static void main(String str[]){
//	String s=new String(null);
//	System.out.print(s);
	}
}