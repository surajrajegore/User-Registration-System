package com.bridgelabz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFirstName {
    private static UserRegistration userRegistration;

    @BeforeClass
    public static void beforeClass(){
        userRegistration = new UserRegistration();
    }

    @Test
    public void testFirstName_thenHappy(){
        Assert.assertEquals(true,userRegistration.isValidFirstName("Suraj"));
    }

    @Test(expected = InvalidUserInformationException.class)
    public void testFirstNameException_thenSad(){
        Assert.assertEquals(true,userRegistration.isValidFirstName("suraj"));
    }
}
