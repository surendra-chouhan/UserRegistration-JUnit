package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean result;
    public static String patternForName = "[A-Z]{1}[a-z]{2,}";
    public static String patternForEmail = "^[a-zA-Z0-9]+(?:[\\+._-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]{1,}(?:\\.[a-zA-Z]{2,5})?(?:\\.[a-zA-Z]{2,5})?$";
    public static String patternForMobileNumber = "^[0-9]{2}[ ][0-9]{10}$";
    public static String patternForPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

     public void FirstName(String FirstName) throws UserRegistrationException {
        if(!Pattern.compile(patternForName).matcher(FirstName).matches());
            throw new UserRegistrationException("Invalid First Name");
     }

    public void LastName(String LastName) throws UserRegistrationException{
        if(!Pattern.compile(patternForName).matcher(LastName).matches());
            throw new UserRegistrationException("Invalid Last Name");
    }

    public void Email(String Email) throws UserRegistrationException{
        if(!Pattern.compile(patternForEmail).matcher(Email).matches());
            throw new UserRegistrationException("Invalid Email ID");
    }

    public void MobileNumber(String MobileNumber) throws UserRegistrationException{
         if(!Pattern.compile(patternForMobileNumber).matcher(MobileNumber).matches());
            throw new UserRegistrationException("Invalid Mobile Number");
    }

    public void Password(String Password) throws UserRegistrationException {
        if (!Pattern.compile(patternForPassword).matcher(Password).matches()) ;
        throw new UserRegistrationException("Invalid Password");
    }
     public boolean checkEmail(String email){
         result = Pattern.compile(patternForEmail).matcher(email).matches();
         return result;
     }
}
