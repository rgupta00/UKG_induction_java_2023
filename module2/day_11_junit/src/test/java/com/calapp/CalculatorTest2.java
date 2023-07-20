package com.calapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest2 {

    private Calculator calculator;
    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
        calculator=new Calculator();
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv" , numLinesToSkip = 1)
    public void addTestWithCSVFile(int firstNo, int secNo, int result){
        System.out.println("-------addTestWithCSVFile----------");
        assertEquals(result, calculator.add(firstNo,secNo));
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
        calculator=null;
    }
}
