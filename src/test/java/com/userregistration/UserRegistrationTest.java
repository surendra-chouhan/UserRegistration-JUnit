package com.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void give_FirstName_True_Test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.FirstName("Surendra");
        Assert.assertTrue(result);
    }

    @Test
    public void give_FirstName_False_Test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.FirstName("surendra");
        Assert.assertFalse(result);
    }

    @Test
    public void give_LastName_True_Test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.LastName("Chouhan");
        Assert.assertTrue(result);
    }

    @Test
    public void give_LastName_False_Test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.LastName("chouhan");
        Assert.assertFalse(result);
    }
}
