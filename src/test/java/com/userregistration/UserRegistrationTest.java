package com.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void give_FirstName_True_test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.FirstName("surendra");
        Assert.assertTrue(result);
    }

    @Test
    public void give_FirstName_Flase_Test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.FirstName("surendra");
        Assert.assertFalse(result);
    }
}
