package com.example.afinal;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {
    public Validator(){
        super();
    }
    //main
    public static void main(String[] args){
        System.out.print(Validator.validation("passwordd5!"));
    }
    /*
     * 1. Not a 'password'
     * 2. At least 8 characters long
     * 3. Contain at least 1 number
     * 4. Contain both upper & lower case alphabet
     * 5. Contain at least 1 special character
     * */
    public static boolean validation(String pwd){
        Pattern p5=Pattern.compile("[^A-Za-z0-9]");
        Matcher m5=p5.matcher(pwd);
        boolean rule5=m5.find();

        if(pwd.equalsIgnoreCase("password")){
            System.out.println("Don't use \"password\" as your password!(caseinsensitive)");
            return false;
        }
        else if(pwd.length()<8){
            System.out.println("At least 8 characters long!");
            return false;
        }/*
                else if(!pwd.matches(".*\\d+.*")){
            System.out.println("At lease 1 number needed!");
            return false;
        }
        else if(!pwd.matches(".*[A-Z].*")||!pwd.matches(".*[a-z].*")){
            System.out.println("Both upper & lower case character needed!");
            return false;
        }
        else if(!rule5){
            System.out.println("At lease 1 special character needed!");
            return false;
        }

        */

        else{
            System.out.println("Password is strong!");
            return true;
        }
    }
}
