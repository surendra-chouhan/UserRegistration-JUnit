package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean result;
    private static final String patternForName = "[A-Z]{1}[a-z]{2,}";
    private static final String patternForEmail = "^[a-zA-Z0-9]+(?:[\\.+_-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z]{1,}+)*$";
    private static final String patternForMobileNumber = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String patternForPassword = "^(?=.*[A-Z])(?=.*[0-9]).{8,20}$";

     public boolean FirstName(String FirstName) {
        result = Pattern.compile(patternForName).matcher(FirstName).matches();
        return result;
    }

    public boolean LastName(String LastName){
        result = Pattern.compile(patternForName).matcher(LastName).matches();
        return result;
    }

    public boolean Email(String Email){
        result = Pattern.compile(patternForEmail).matcher(Email).matches();
        return result;
    }

    public boolean MobileNumber(String MobileNumber){
         result = Pattern.compile(patternForMobileNumber).matcher(MobileNumber).matches();
         return result;
    }

    public boolean Password(String Password){
         result = Pattern.compile(patternForPassword).matcher(Password).matches();
         return result;
    }
}
