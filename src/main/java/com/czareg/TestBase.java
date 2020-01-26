package com.czareg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public static void setUp(){
        System.out.println("openClient");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("closeClient");
    }
}
