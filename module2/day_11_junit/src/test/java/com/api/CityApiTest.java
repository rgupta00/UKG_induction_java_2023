package com.api;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class CityApiTest {

    private CityApi cityApi;

    @BeforeEach
    public void beforeEach(){
        cityApi=new CityApi();
    }


    @Test
    @Timeout(value = 4200, unit = TimeUnit.MILLISECONDS)
    public void getCityApiTest(){
        Assertions.assertEquals("banglore", cityApi.getCityApi(2,5));
    }
    @AfterEach
    public void afterEach(){
        cityApi=null;
    }

}
