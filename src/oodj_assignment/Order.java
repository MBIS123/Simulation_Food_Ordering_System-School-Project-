/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author HAO
 */
public class Order  {
    
    static String[][] orderedItem;
    
    public Order(){
    }
    
    void setOrderedItem (String[][] orderedItem){ // after customer paid set the item in cart.txt to orderedItem
        this.orderedItem = orderedItem;
    }
     
    File orderFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Order.txt");
   
    File cartFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Cart.txt");
    
    void write_Order_to_OrderFIle(){
        try {
        PrintWriter pw = new PrintWriter(new FileWriter(orderFile),true);
        pw.write(orderedItem[0][0]+"hihi");
        pw.close();
        } catch (Exception e) {
            System.out.println(e+ "herela");
        }
    }
    
    String generate_Order_Id(){
    String orderID = "O"+ Integer.toString(orderedItem.length);
    return orderID;
    }
    
    
    
}
