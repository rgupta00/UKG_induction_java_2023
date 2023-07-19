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

class CalculatorTestV2 {

	Calculator calculator = null;

	
	@BeforeEach
	public void beforeTest() {
		calculator = new Calculator();
	}

	@Test
	void testAdd() {
		assertEquals(4, calculator.add(1, 3));
	}

	@Test
	void testAddMulti() {
		assertAll(
					()-> assertEquals(3, calculator.add(2, 1)),
					()-> assertEquals(6, calculator.add(2, 4)),
					()-> assertEquals(9, calculator.add(2, 7))
				);
	}

	@Test
	void testDivideWithArithmaticException() {
		//assertEquals(10, calculator.divide(30, 3));
		assertThrows(ArithmeticException.class, ()-> calculator.divide(20, 0),"divide by zero");
	}
	
	@Test
	void testDivideWithOutException() {
		assertEquals(10, calculator.divide(30, 3));
	}

	
	@DisplayName(value = "test for multiplication")
	//@Disabled
	//@EnabledOnOs(OS.WINDOWS)
	//@EnabledOnJre(JRE.JAVA_8)
	@Test
	void testMultiply() {
		assertEquals(12, calculator.multiply(3, 4));
	}

	@AfterEach
	public void afterTest() {
		System.out.println("run after each test case");
		calculator = null;
	}
	
	

}
