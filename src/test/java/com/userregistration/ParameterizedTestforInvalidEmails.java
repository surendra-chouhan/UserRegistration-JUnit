package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTestforInvalidEmails {
    private String email;

    UserRegistration user;

    public ParameterizedTestforInvalidEmails(String email) {
        this.email = email;
    }

    @Before
    public void set() {
        user = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[] {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                                            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"});
    }

    @Test
    public void givenEmail_CheckFalse() {
        try{
            user.Email(email);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
