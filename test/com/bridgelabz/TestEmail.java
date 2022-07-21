package com.bridgelabz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestEmail {
    private String email;
    private boolean expected;
    private static UserRegistration userRegistration;


    @BeforeClass
    public static void beforeClass(){
       userRegistration = new UserRegistration();
    }

    public TestEmail(String email, boolean expected) {
        this.email = email;
        this.expected = expected;
    }

    @Test
    public void testEmail(){
        Assert.assertEquals(expected,userRegistration.isValidEmail(email));
    }

    @Parameterized.Parameters
    public static List<Object[]> emailInputs(){
        return Arrays.asList(new Object[][]{ {"abc@yahoo.com",true},
                {"abc121@.com",false},
                {"abc-100@yaho.com",true},
                {"abc.1000@yahoo.com.au",true},
                {"abc",false},
                {"abc.100@yahoo.com",true},
                {"abc@.com.my",false}});
    }

}
