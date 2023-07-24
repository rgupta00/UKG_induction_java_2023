package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {
	Calculator calculator = null;
	@BeforeAll
	public static void beforeAllTest() {}
	@BeforeEach
	public void beforeTest() {
		calculator = new Calculator();
	}
	@Test
	void testAdd() {
		assertEquals(4, calculator.add(1, 3));
	}
	@Test
	void testDivide() {
		assertEquals(4, calculator.add(1, 3));
	}
	@DisplayName(value = "test for multiplication")
	//@Disabled//@EnabledOnOs(OS.WINDOWS)//@EnabledOnJre(JRE.JAVA_8)
	@Test
	void testMultiply() {
		System.out.println("test multiply");
		assertEquals(12, calculator.multiply(3, 4));
	}
	@AfterEach
	public void afterTest() {}
	
	@AfterAll
	public static void afterAllTest() {
		System.out.println("run after all...");
	}

}
