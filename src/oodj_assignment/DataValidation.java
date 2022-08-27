/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;
import java.util.regex.*;
import java.time.*;
import java.time.format.*;

/**
 *
 * @author hp
 */
public class DataValidation {
    
    public boolean isTP (String input)
    {
        return (input.length() == 6); 
        //check if TPNumber has length of 6
        //formatting within text field ensures only numbers will be entered
    }
    
    public boolean isName(String input)
    {
        boolean stat = false;
        if (input.length() > 0)
        {
            input = input.replaceAll("\\s", "");
            stat = input.chars().allMatch(Character::isLetter); //true or false
        }
        return stat;
    }
    
    public boolean isContact(String input)
    {
        //if first two numbers are 01
            //if third number is anything but 1, length == 10
            //else if third number is 1, length == 11
        //else fail
        boolean stat = false;

        if (input.length() > 0)
        {
            if ((input.charAt(0) == '0') && (input.charAt(1) == '1'))
            {
                if (input.charAt(2) == '1')
                {
                    stat = (input.length() == 11);
                }
                else
                {
                    stat = (input.length() == 10);
                }
            }
        }
        else
        {
            return stat;
        }
       
        return stat;
    }
    
    public boolean isEmail(String input)
    {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; //https://www.javatpoint.com/java-email-validation
        Pattern pattern = Pattern.compile(regex);  
        
        Matcher matcher = pattern.matcher(input);
        return (matcher.matches());
    }
    
    public boolean isAddress(String input)
    {
        input = input.replaceAll("\\s", "");
        return (input.length() > 0);
    }
    
    public boolean isPassword(String input)
    {
        boolean onenumber = false;
        boolean uppercase = false;
        boolean onespec = false;
        boolean min8 = false;
        boolean valid = false;

        
        if (input.length() >= 8)
        {
            min8 = true;
            //at least one number
            if (Pattern.compile("[0-9]").matcher(input).find())
            {
                onenumber = true;
            } 

            //at least one uppercase
            if (Pattern.compile("[A-Z]").matcher(input).find())
            {
                uppercase = true;
            } 

            //at least one special character
            if (Pattern.compile("[^,A-Za-z0-9]").matcher(input).find())
            {
                onespec = true;
            } 
        }
       
        if ((min8 == true) && (onenumber == true) && (uppercase == true) && (onespec == true))
        {
            valid = true;
        }
        
        return valid;
    }
}
