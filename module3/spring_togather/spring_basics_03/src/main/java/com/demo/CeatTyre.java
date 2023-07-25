package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "t2")
public class CeatTyre implements Tyre {
	public void rotate() {
		System.out.println("CEAT tyre is rotating");
	}
}
