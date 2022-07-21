package com.bridgelabz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPassword {

    private static UserRegistration userRegistration;

    @BeforeClass
    public void testBeforeClass() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void testPassword_thenHappy() {
        Assert.assertEquals(true, userRegistration.isValidPassword("Suraj@4332"));
    }

    @Test(expected = InvalidUserInformationException.class)
    public void testPassword_thenSad() {
        Assert.assertEquals(true, userRegistration.isValidPassword("Suraj@22123"));
    }
}
