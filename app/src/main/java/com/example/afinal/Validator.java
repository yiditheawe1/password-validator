package com.example.afinal;
import java.lang.*;
import java.util.HashMap;
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
    public static HashMap validation(String pwd){
        Pattern p5=Pattern.compile("[^A-Za-z0-9]");
        Matcher m5=p5.matcher(pwd);
        boolean rule5=m5.find();

        if(pwd.equalsIgnoreCase("password")){
            HashMap hm=new HashMap();
            hm.put("result",false);
            hm.put("message","Don't use \"password\" as your password!(caseinsensitive)");
            return hm;
        }
        else if(pwd.length()<8){
            HashMap hm=new HashMap();
            hm.put("result",false);
            hm.put("message","At least 8 characters long!");
            return hm;
        }
        else if(!pwd.matches(".*\\d+.*")){
            HashMap hm=new HashMap();
            hm.put("result",false);
            hm.put("message","At lease 1 number needed!");
            return hm;
        }
        else if(!pwd.matches(".*[A-Z].*")||!pwd.matches(".*[a-z].*")){
            HashMap hm=new HashMap();
            hm.put("result",false);
            hm.put("message","Both upper & lower case character needed!");
            return hm;
        }
        else if(!rule5){
            HashMap hm=new HashMap();
            hm.put("result",false);
            hm.put("message","At lease 1 special character needed!");
            return hm;
        }



        else{
            HashMap hm=new HashMap();
            hm.put("result",true);
            hm.put("message","Password is strong!");
            //System.out.println("Password is strong!");
            return hm;
        }
    }
}
