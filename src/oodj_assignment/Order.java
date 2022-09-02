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

/**
 *
 * @author HAO
 */
public class Order extends Menu {
    
    static String[][] orderedItem;
    String paymentMethod;
    String paymentAmount;
    
    public Order(){
    }
    
    void setOrderedItem (String[][] orderedItem){ // after customer add a item set the item in cart.txt to orderedItem
        this.orderedItem = orderedItem;
    }
    

    
    void setPaymentDetails(String paymentMethod, String paymentAmount){
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
    }
    
    //for jinhao
    File orderFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Order.txt");
    File cartFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Cart.txt");

    void write_Order_to_OrderFIle(){
        String orderFood= "";
        for(int i= 0; i< orderedItem.length; i++){
        orderFood = orderFood + orderedItem[i][0]+" x "+orderedItem[i][1]+ ",";
        }
        String orderId = generate_Order_Id();
        try {
        PrintWriter pw = new PrintWriter(new FileWriter(orderFile,true));
        pw.write(orderId+":"+customerName+":"+customerTpNO+":"+orderFood+":"+ paymentMethod+":"+paymentAmount+"\n");
        pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
   
    
    String generate_Order_Id(){
     try {
             BufferedReader rd = new BufferedReader(new FileReader(orderFile));
             ArrayList<String> allOrder = new ArrayList<String>();
             String line;
        while (( line = rd.readLine())!= null) {
            allOrder.add(line);
        }
         String orderID = "O"+ Integer.toString(allOrder.size()+1);
         new Feedback().setOrderID(orderID);
         return orderID;
        } 
       catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    
    
    
    
    
    
    
    
    
}
