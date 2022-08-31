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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author HAO
 */
public class Cart extends Menu{
    
    
    String[][] cartItem;
    //for jinhao
    File cart  =  new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Cart.txt");
    //for jayren
    //File cart  =  new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\Cart.txt");

    public Cart() {
        
    }
   
    
    public void write_Order_To_Cart (String foodName, int quantity){
        int foodIndex,totalPerItem;
        int foodPrice =0;
        for( int i =0; i<menu.length;i++){
            if (menu[i][1].equals(foodName)) {
                foodIndex = i;
                
                foodPrice =  Integer.parseInt(menu[i][2]);
                break;
            }
        }
        totalPerItem = quantity* foodPrice;

        try {
            PrintWriter pw = new PrintWriter( new FileWriter(cart,true));
            pw.write(foodName+":"+quantity+":"+totalPerItem +"\n" );
            pw.close(); 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
    }
    
    
    public void write_Order_To_CartFile(){
    }
    
    public void countTotalForEachItem(){
    
    }
    
    public void clearCart(){
    try { 
            //for jinhao
            PrintWriter pw = new PrintWriter(new FileWriter(new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Cart.txt")));
            //for jayren
            //PrintWriter pw = new PrintWriter(new FileWriter(new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\Cart.txt")));
            pw.write("");
            pw.close();
            
        } catch (Exception e) {
        }
    }
    
       public void clearCart(JList cartList, JList totalList){  //clearCart() method overloading
    try { 
            //for jinhao
            PrintWriter pw = new PrintWriter(new FileWriter(new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Cart.txt")));
            //for jayren
           // PrintWriter pw = new PrintWriter(new FileWriter(new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\Cart.txt")));
            pw.write("");
            pw.close();
            read_Order_From_Cart(cartList, totalList);
            cartItem = load_Menu_Data();
        } catch (Exception e) {
        }
    }
    public void read_Order_From_Cart (JList cartList, JList totalList){ // read order from carttxt and display to form
           cartItem = load_cartItem();
           DefaultListModel tempCart =  new DefaultListModel();
           cartList.setModel(tempCart);
           for(int i =0; i< cartItem.length ;i++){
               tempCart.addElement(cartItem[i][0] +"   x "+ cartItem[i][1]);
           }
           
           DefaultListModel tempTotal = new DefaultListModel();
           totalList.setModel(tempTotal);
           for(int i =0; i<cartItem.length ;i++){
               tempTotal.addElement("RM "+cartItem[i][2]);}
           
           new Order().setOrderedItem(cartItem);
           }

    String calc_GrandTotal(){
        int grandTotal=0;
        for(int i=0; i < cartItem.length; i++){
           grandTotal = grandTotal + Integer.parseInt(cartItem[i][2]);
        }
        String sGrandTotal= Integer.toString(grandTotal);

        return sGrandTotal;
      
    }
    
    Boolean checkCartEmpty(){
        if (cartItem.length <= 0 ) {
            System.out.println("hi");
        }
        return null;
    }
    
    
    public String[][] load_cartItem(){
        try {
             BufferedReader rd = new BufferedReader(new FileReader(cart));
             ArrayList<String> cartOrder = new ArrayList<String>();
             String line;
        while (( line = rd.readLine())!= null) {
            cartOrder.add(line);
        }
        String[] cartArray = cartOrder.toArray(new String[0]);          
        String[][] cartArray2D = new String[cartArray.length][3];
        for(int i=0; i< cartArray.length ; i++){
            for(int j=0; j<3; j++){
                cartArray2D[i][j] = cartArray[i].split(":")[j]; 
            }
        }
        return cartArray2D;
        } 
       catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
}
