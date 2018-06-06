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
        assertEquals(Validator.validation(pwd1).get("result"),false);
        assertEquals(Validator.validation(pwd1).get("message"),"Don't use \"password\" as your password!(caseinsensitive)");
        assertEquals(Validator.validation(pwd6).get("result"),false);
        assertEquals(Validator.validation(pwd6).get("message"),"At least 8 characters long!");
        assertEquals(Validator.validation(pwd2).get("result"),false);
        assertEquals(Validator.validation(pwd2).get("message"),"At lease 1 number needed!");
        assertEquals(Validator.validation(pwd3).get("result"),false);
        assertEquals(Validator.validation(pwd3).get("message"),"At lease 1 special character needed!");
        assertEquals(Validator.validation(pwd4).get("result"),false);
        assertEquals(Validator.validation(pwd4).get("message"),"Both upper & lower case character needed!");
        assertEquals(Validator.validation(pwd5).get("result"),true);
        assertEquals(Validator.validation(pwd5).get("message"),"Password is strong!");

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