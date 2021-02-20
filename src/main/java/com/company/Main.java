package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Test
    public void test() {
        logger.info("=================================================");
        logger.info("test log");
        logger.info("=================================================");
    }
}
