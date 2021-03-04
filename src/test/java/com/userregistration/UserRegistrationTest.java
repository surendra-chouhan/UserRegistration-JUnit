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
    public void give_FirstName_False_Test() {
        try{
            user.FirstName("Surendra");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
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
    public void give_Email_False_Test() {
        try{
            user.Email("Sure.@.com");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
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
    public void give_Password_False_Test() {
        try{
            user.Password("Sure");
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }
}
