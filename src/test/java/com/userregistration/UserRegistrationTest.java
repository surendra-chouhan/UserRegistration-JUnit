package com.userregistration;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user;
    @Before
    public void set(){
        user = new UserRegistration();
    }

    @Test
    public void give_FirstName_True_Test() {
        boolean result = user.FirstName("Surendra");
        Assert.assertTrue(result);
    }

    @Test
    public void give_FirstName_False_Test() {
        boolean result = user.FirstName("surendra");
        Assert.assertFalse(result);
    }

    @Test
    public void give_LastName_True_Test() {
        boolean result = user.LastName("Chouhan");
        Assert.assertTrue(result);
    }

    @Test
    public void give_LastName_False_Test() {
        boolean result = user.LastName("chouhan");
        Assert.assertFalse(result);
    }

    @Test
    public void give_Email_True_Test() {
        boolean result = user.Email("chouhansurendra88@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void give_Email_False_Test() {
        boolean result = user.Email("abc..2002@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void give_MobileNumber_True_Test() {
        boolean result = user.MobileNumber("91 9987451480");
        Assert.assertTrue(result);
    }

    @Test
    public void give_MobileNumber_False_Test() {
        boolean result = user.MobileNumber("9987451480");
        Assert.assertFalse(result);
    }

    @Test
    public void give_Password_True_Test() {
        boolean result = user.Password("Surendra@123");
        Assert.assertTrue(result);
    }

    @Test
    public void name() {
        boolean result = user.Password("Surendra123");
        Assert.assertFalse(result);
    }
}
