package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// <bean id="t" class="com.demo.MrfTyre"/>
@Component(value = "t")
@Primary
public class MrfTyre  implements Tyre{
	public void rotate() {
		System.out.println("MRF tyre is rotating");
	}
}
