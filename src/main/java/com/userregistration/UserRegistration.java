package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean result;
    private static final String patternForName = "[A-Z]{1}[a-z]{2,}";
    private static final String patternForEmail = "^[a-zA-Z0-9]+(?:[\\.+_-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z]{1,}+)*$";

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
}
