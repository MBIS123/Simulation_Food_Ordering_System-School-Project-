/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author HAO
 */
public class Feedback extends Menu{
    
   static protected String orderID;
   //File feedbackFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Feedback.txt");
    File feedbackFile  =  new File("Feedback.txt");

   void setOrderID(String orderId){
       this.orderID = orderId;
   }
    
    void write_To_FeedbackFile(JRadioButton q1Yes,JRadioButton q1No,JTextField q2YesJTextField,JRadioButton q2No ,JRadioButton q3Yes,JRadioButton q3No,JTextField q4TextField){
        try {
        
            PrintWriter pw = new PrintWriter(new FileWriter(feedbackFile,true));
            String feedbackID = generate_FeedBack_Id();
            String q1Feedback =  q1FeedBack(q1Yes, q1No);
            String q2Feedback = q2Feedback(q2YesJTextField, q2No);
            String q3Feedback = q3FeedBack(q3Yes, q3No);
            String q4Feedback = q4FeedBack(q4TextField);
            pw.write(feedbackID+":"+ orderID+ ":"+q1Feedback+ ":"+q2Feedback+":"+q3Feedback+":"+q4Feedback+"\n");
            pw.close();
        } catch (Exception e) {
        }
    }
    
        
    String generate_FeedBack_Id(){
     try {
             BufferedReader rd = new BufferedReader(new FileReader(feedbackFile));
             ArrayList<String> allFeedback = new ArrayList<String>();
             String line;
        while (( line = rd.readLine())!= null) {
            allFeedback.add(line);
        }
         String feedbackID = "f"+ Integer.toString(allFeedback.size()+1);
         new Feedback().setOrderID(orderID);
         return feedbackID;
        } 
       catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
        
     String q1FeedBack (JRadioButton q1Yes, JRadioButton q1No){
        String userSatisfaction="";
         if (q1Yes.isSelected()) {
             userSatisfaction = "User is satisfied with order process";
         }
         else if (q1No.isSelected()) {
             userSatisfaction = "User is not satisfied with order process"; 
         }
        return userSatisfaction;
    }
     
    String q2Feedback(JTextField q2YesJTextField,JRadioButton q2No){
        String unnecessarySteps="";
        if (!(q2YesJTextField.getText().trim().equals(""))) {
            unnecessarySteps = q2YesJTextField.getText();
        }
        else if (q2No.isSelected()) {
            unnecessarySteps = "No unnescessary steps";
        }
        return unnecessarySteps;
    }
    
    String q3FeedBack (JRadioButton q3Yes, JRadioButton q3No){
        String isConvenient="";
         if (q3Yes.isSelected()) {
             isConvenient = "User think it is more convenient";
         }
         else if (q3No.isSelected()) {
             isConvenient= "User think it is not convenient"; 
         }
        return isConvenient;
    }
    
    String q4FeedBack (JTextField q4TextField){
        return q4TextField.getText();
    }

     Boolean allAnswered(JRadioButton q1Yes,JRadioButton q1No,JTextField q2YesJTextField,JRadioButton q2No ,JRadioButton q3Yes,JRadioButton q3No,JTextField q4TextField){
        if (!(q1Yes.isSelected()) && !(q1No.isSelected())){ 
             return false;}
        if (!(q3Yes.isSelected()) && !(q3No.isSelected())){ 
             return false;}
        if (q2YesJTextField.getText().trim().equals("") && !(q2No.isSelected())){ 
             return false;}
        return true;
     }
     
     
     
     
     
       
        
        
    }
    
    
    

