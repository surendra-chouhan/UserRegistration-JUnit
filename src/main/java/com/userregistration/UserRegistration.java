package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean result;
    private static final String patternForName = "[A-Z]{1}[a-z]{2,}";

    public boolean FirstName(String FirstName) {
        result = Pattern.compile(patternForName).matcher(FirstName).matches();
        return result;
    }

    public boolean LastName(String LastName){
        result = Pattern.compile(patternForName).matcher(LastName).matches();
        return result;
    }

}
