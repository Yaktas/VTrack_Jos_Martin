package com.cybertek.tests.d6_testng;

import org.testng.annotations.*;

public class BeforeAfterTest {

    @Test
    public void test1() {

        System.out.println("this is test one");
    }

    @Test
    public void test2() {

        System.out.println("this is test two");
    }



    @BeforeMethod
    public void setupMethod() {

        System.out.println("BEFORE METHOD");
        System.out.println("OPENING CHROME");
    }

    @AfterMethod
    public void teardownMethod() {

        System.out.println("AFTER METHOD");
        System.out.println("CLOSING CHROME");

    }

    @BeforeClass
    public void setupclass() {

        System.out.println("BEFORE CLASS RUNNNIG ONLY ONE TIME");
    }

    @AfterClass
    public void teardownClass() {

        System.out.println("AFTER CLASS RUNNNIG ONLY ONE TIME");
    }



}
