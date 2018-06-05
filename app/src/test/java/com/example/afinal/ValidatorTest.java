package com.example.afinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    int cnt=0;
    private String pwd1, pwd2, pwd3, pwd4, pwd5, pwd6;
    @BeforeClass
    public static void before(){
        System.out.println("JUnit test starts!");
    }
    @Before
    public void setup(){
        pwd1="passworD";
        pwd2="passworDd";
        pwd3="passworD8";
        pwd4="password8!";
        pwd5="passworD8!";
        pwd6="passwor";
        System.out.println("Set up for testing function validation\n");
    }
    @Test
    public void validationTest() {
        //assertEquals(4, 2 + 2);
        assertTrue(!Validator.validation(pwd1));
        assertTrue(!Validator.validation(pwd6));
        //assertTrue(!Validator.validation(pwd2));
        //assertTrue(!Validator.validation(pwd3));
        //assertTrue(!Validator.validation(pwd4));
        //assertTrue(Validator.validation(pwd5));
    }
    @After
    public void cntJUnit(){
        cnt++;
        System.out.println("\nTest of method #"+cnt+" finished!");
    }
    @AfterClass
    public static void after(){
        System.out.println("JUnit test ends!");
    }
}