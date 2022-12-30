package com.bridgelabz;

public class RegexMain {
    public static void main(String[] args) {
        Regex.firstNameValidation("Soujanya");
        Regex.firstNameValidation("souju");
        Regex.lastNameValidation("Narlapuram");
        Regex.lastNameValidation("kolipaka");
        Regex.emailValidation("SOUJANYA131@GMAIL.COM");
        Regex.emailValidation("soujanya131@gmail");
        Regex.mobileNumberValidation("91 7382573349");
        Regex.mobileNumberValidation("7382573349");
        Regex.passwordValidation("pwd123");
        Regex.passwordValidation("souju@234");
    }
}