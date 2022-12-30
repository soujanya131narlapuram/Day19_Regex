package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static boolean firstNameValidation(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Name " + firstName + " is having valid pattern ");
            return true;
        } else {
            System.out.println("Name " + firstName + " is not having valid pattern");
            return false;
        }
    }

    static boolean lastNameValidation(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Name " + lastName + " is having valid pattern ");
            return true;
        } else {
            System.out.println("Name " + lastName + " is not having valid pattern");
            return false;
        }
    }

    static boolean emailValidation(String email){
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Email " + email + " is having valid pattern");
            return true;
        } else {
            System.out.println("Email " + email + " is not having valid pattern");
            return false;
        }
    }
    static boolean mobileNumberValidation(String mobileNumber){
        Pattern pattern = Pattern.compile("^[0-9]{2} [0-9]{10}");
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Mobile Number " + mobileNumber + " is having valid pattern");
            return true;
        } else {
            System.out.println("Mobile Number " + mobileNumber + " is not having valid pattern");
            return false;
        }
    }
}