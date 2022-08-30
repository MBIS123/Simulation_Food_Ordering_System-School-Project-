/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author HAO
 */
public class Payment extends Menu{
    
    
    String grandTotal;
    
    void set_GrandTotal(String grandTotal){
        this.grandTotal = grandTotal;
    }
    
    String get_GrandTotal(){
    return grandTotal;
    }
    
    Boolean verifyAccountHolderName (JTextField textFieldAccountHolder ){  
        String regexCharOnly ="[A-Za-z ]*";
        Pattern p = Pattern.compile(regexCharOnly);
        Matcher m = p.matcher(textFieldAccountHolder.getText());
        Boolean isString = m.matches();
        if (textFieldAccountHolder.getText().equals(""))
            return false;
        return isString;
    }
    
    Boolean verifyAccountNo (JTextField txtFildAccountNo){

        String regexDigit ="[0-9- ]{12,16}";
        Pattern p = Pattern.compile(regexDigit);
        Matcher m = p.matcher(txtFildAccountNo.getText());
        Boolean isReal = m.matches();
        return isReal;
    }
    
    Boolean verifyCardNo (JTextField txtFldCardNo){
        String regexDigit ="[0-9]{4}";
        Pattern p = Pattern.compile(regexDigit);
        Matcher m = p.matcher(txtFldCardNo.getText());
        Boolean isReal = m.matches();
        return isReal;
    }
    Boolean verifySecurityCode(JTextField txtSecurityCode){
        String regexDigit ="[0-9]{3}";
        Pattern p = Pattern.compile(regexDigit);
        Matcher m = p.matcher(txtSecurityCode.getText());
        Boolean isReal = m.matches();
        return isReal;
    }
    
  
    
}
