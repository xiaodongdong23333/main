package com.example.demo;

import org.apache.log4j.Logger;

import java.util.Date;

public class TestLog {

    private static Logger logger = Logger.getLogger(TestLog.class);

    public static void main(String[] args) throws InterruptedException {


        logger.debug("Hello");

        logger.info("fsdf " + new Date().toString());

        logger.warn(" This time is {}" + new Date().toString());

        logger.error(" This time is {}" + new Date().toString());

    }
}
