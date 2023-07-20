package com.calapp;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import  static org.junit.jupiter.api.Assertions.*;
//now a days any java framework = concept + annotation
public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void beforeAll(){
        //jdbc connection factory code
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
        calculator=new Calculator();
    }

    @Disabled
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_11})
    @DisabledOnOs(OS.WINDOWS)
    @Test
    public void addTest(){
        System.out.println("---add test---");
        assertEquals(4, calculator.add(2,2));
    }

    @Disabled
    @Test
    public void multiplyTest(){
        System.out.println("---mutiple test---");
        assertEquals(40, calculator.multiply(2,20));
    }
    @Disabled
    @Test
    public void divideTestPostive(){
        System.out.println("---divide test---");
        assertEquals(2, calculator.divide(40,20));
    }

    @Disabled
    @Test
    public void divideTestFailure(){
        System.out.println("---divide test---");


//        Assertions
//                .assertThrows(ArithmeticException.class, ()->calculator.divide(40,0));

//        ArithmeticException ex=
//                assertThrows(ArithmeticException.class, ()->calculator.divide(40,0));
//
//        assertEquals("demo must not be zero", ex.getMessage());

        ArithmeticException ex=
                assertThrows(ArithmeticException.class, ()->calculator.divide(40,0));

        assertEquals("demo must not be zero", ex.getMessage());
    }

    //i want to run the add test case acc to that csv file



    @AfterEach
    public void afterEach(){
        System.out.println("after each");
        calculator=null;
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }
}
