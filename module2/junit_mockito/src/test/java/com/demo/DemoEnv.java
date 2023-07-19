package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DemoEnv {
	
	@Tag(value = "test")
	@Test
	void testAdd() {
		System.out.println("test env");
	}

	@Tag(value = "prod")
	@Test
	void testDivide() {
		System.out.println("prod evn");
	}

}
