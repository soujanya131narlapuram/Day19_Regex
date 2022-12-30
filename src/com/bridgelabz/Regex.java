package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static boolean nameValidation(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Name " + firstName + " is having valid format ");
            return true;
        } else {
            System.out.println("Name " + firstName + " is not having valid format");
            return false;
        }
    }
}