package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestMethodOrder(OrderAnnotation.class)
class CustomerCrudTest {

	@BeforeEach
	public void beforeTest() {
			System.out.println("before every test case");
	}

	@Order(value = 1)
	@Test
	void testAddCustomer() {
		System.out.println("testAddCustomer");
	}

	@Order(value = 3)
	@Test
	void testUpdateCustomer() {
		System.out.println("testUpdateCustomer");
	}

	@Order(value = 4)
	@Test
	void testDeleteCustomer() {
		System.out.println("testDeleteCustomer");
	}

	@Order(value = 2)
	@Test
	void testGetCustomer() {
		System.out.println("testGetCustomer");
	}
	@AfterEach
	public void afterTest() {
		System.out.println("run after each test case");

	}

}
