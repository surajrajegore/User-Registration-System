package com.bridgelabz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLastName {
    private static UserRegistration userRegistration;


    @BeforeClass
    public static void testBeforeClass(){
        userRegistration = new UserRegistration();
    }
    @Test
    public void testLastName_ThenHappy(){
        Assert.assertEquals(true,userRegistration.isValidLastName("Rajegore"));
    }

    @Test(expected = InvalidUserInformationException.class)
    public void testLastName_thenSad(){
        Assert.assertEquals(true,userRegistration.isValidLastName("rajegore"));
    }

}
