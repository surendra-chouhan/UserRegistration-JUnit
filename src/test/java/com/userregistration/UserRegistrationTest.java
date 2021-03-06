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
    public void give_FirstName_True_Test() throws UserRegistrationException {
        boolean result = user.FirstName("Surendra");
        Assert.assertTrue(result);
    }

    @Test
    public void give_FirstName_False_Test() {
        try{
            user.FirstName("surendra");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void give_LastName_True_Test() throws UserRegistrationException {
        boolean result = user.LastName("Chouhan");
        Assert.assertTrue(result);
    }

    @Test
    public void give_LastName_False_Test() {
        try{
            user.LastName("chouhan");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void give_Email_True_Test() throws UserRegistrationException {
        boolean result = user.Email("chouhansurendra88@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void give_Email_False_Test() {
        try{
            user.Email("Sure.@.com");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void give_MobileNumber_True_Test() throws UserRegistrationException {
        boolean result = user.MobileNumber("91 9987451480");
        Assert.assertTrue(result);
    }

    @Test
    public void give_MobileNumber_False_Test() {
        try{
            user.MobileNumber("...2348133");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void give_Password_True_Test() throws UserRegistrationException {
        boolean result = user.Password("Surendra@123");
        Assert.assertTrue(result);
    }

    @Test
    public void give_Password_False_Test() {
        try{
            user.Password("sure@123");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }
}
