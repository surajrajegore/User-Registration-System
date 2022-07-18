package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    final static String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
    final static String LAST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}";
    final static String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    final static String MOBILE_NO_REGEX = "(91)?\\s{1}?[6-9]{1}[0-9]{9}$";

    public static void main(String[] args) {
        System.out.println("Welcome to User registration Using Regex");

        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Enter First Name");
        userRegistration.isValidFirstName(UserInput.getInput());

        System.out.println("Enter Last Name");
        userRegistration.isValidLastName(UserInput.getInput());

        System.out.println("Enter Email");
        userRegistration.isValidEmail(UserInput.getInput());

        System.out.println("Enter mobile number:");
        userRegistration.isValidMobileNumber(UserInput.getInput());
    }

    private static boolean isValidInput(String regex, String userInput) {

        boolean b = Pattern.matches(regex, userInput);

        return b;
    }


    private void isValidFirstName(String userInput) {

        try {
            if (isValidInput(FIRST_NAME_REGEX, userInput)) {
                System.out.println("Valid First Name : " + userInput);
            } else {
                throw new InvalidUserInformationException("Invalid First Name : " + userInput);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
    }

    private void isValidLastName(String userInput) {

        try {
            if (isValidInput(LAST_NAME_REGEX, userInput)) {
                System.out.println("Valid Last Name : " + userInput);
            } else {
                throw new InvalidUserInformationException("Invalid Last Name : " + userInput);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
    }

    private void isValidEmail(String userInput) {
        try {
            if (isValidInput(EMAIL_REGEX, userInput)) {
                System.out.println("Valid Email Address : " + userInput);
            } else {
                throw new InvalidUserInformationException("Invalid Email:" + userInput);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }

    }

    private void isValidMobileNumber(String userInput){
        try{
            if (isValidInput(MOBILE_NO_REGEX, userInput)){
                System.out.println("Valid Mobile Number:" +userInput);
            }else {
                throw new InvalidUserInformationException("Invalid Mobile Number " +userInput);
            }
        }catch (InvalidUserInformationException e){
            System.out.println(e);
        }
    }
}
