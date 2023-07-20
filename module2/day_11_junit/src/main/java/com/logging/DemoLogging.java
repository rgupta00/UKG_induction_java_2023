package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DemoLogging {

    private static  Logger logger=LoggerFactory.getLogger(DemoLogging.class);

    public static void main(String[] args) {

        logger.info("hello to log4j");
        System.out.println("code is working till line 6");


        System.out.println("code is working till line 12");


    }
}
