package com.bridgelabz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMobileNumber {
    private static UserRegistration userRegistration;

    @BeforeClass
    public static void beforeClass() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void testMobileNumber_thenHappy() {
        Assert.assertEquals(true, userRegistration.isValidMobileNumber("91 7261923929"));
    }

    @Test(expected = InvalidUserInformationException.class)
    public void testMobileNumber_thenSad() {
        Assert.assertEquals(true, userRegistration.isValidMobileNumber("92 3425254259"));
    }


}
