package com.userregistration;

import java.util.Collection;
import java.util.regex.Pattern;

@FunctionalInterface
interface IValidUserRegistration{
    boolean valid(String pattern, String input);
}

public class UserRegistration {
    public static String patternForName = "[A-Z]{1}[a-z]{2,}";
    public static String patternForEmail = "^[a-zA-Z0-9]+(?:[\\+._-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]{1,}(?:\\.[a-zA-Z]{2,5})?(?:\\.[a-zA-Z]{2,5})?$";
    public static String patternForMobileNumber = "^[0-9]{2}[ ][0-9]{10}$";
    public static String patternForPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    IValidUserRegistration result = (pattern, input) -> Pattern.compile(pattern).matcher(input).matches();

     public boolean FirstName(String FirstName) throws UserRegistrationException {
         if(result.valid(patternForName, FirstName))
             return true;
         else
             throw new UserRegistrationException("Invalid First Name");
     }

    public boolean LastName(String LastName) throws UserRegistrationException{
        if(result.valid(patternForName, LastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    }

    public boolean Email(String Email) throws UserRegistrationException {
        if (result.valid(patternForEmail, Email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email ID");
    }

    public boolean MobileNumber(String MobileNumber) throws UserRegistrationException {
        if (result.valid(patternForMobileNumber, MobileNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    }

    public boolean Password(String Password) throws UserRegistrationException {
        if (result.valid(patternForPassword, Password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }
     public boolean checkEmail(String email) throws UserRegistrationException {
         return Pattern.compile(patternForEmail).matcher(email).matches();
     }
}
