/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author HAO
 */
public class ViewOrder extends Menu{
    
    //for jinhao
    //File orderFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Order.txt");
    //for jayren
    File orderFile = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\Order.txt");
    
    String[][] customerOrderHistory;
    String[][] managerOrderHistory;

    public ViewOrder(JList orderHistoryList) {
        customerOrderHistory = load_orderHistory();
        showCustomerOrderHistory(orderHistoryList);
    }
    
    public ViewOrder()
    {
        managerOrderHistory = managerload_orderHistory();
    }
    
    void showCustomerOrderHistory (JList orderHistoryList){
        
        DefaultListModel temp = new DefaultListModel();
        orderHistoryList.setModel(temp);
        System.out.println(customerOrderHistory[1]);
        for(int i=0; i< customerOrderHistory.length;i++){
            temp.addElement( customerOrderHistory[i][0]+customerOrderHistory[i][3]+customerOrderHistory[i][5]);   
    }
    }
  
    public String[][] load_orderHistory(){
        try {
             BufferedReader rd = new BufferedReader(new FileReader(orderFile));
             ArrayList<String> allOrder = new ArrayList<String>();
             String line;
        while (( line = rd.readLine())!= null) {
            allOrder.add(line);
        }
        String[] customerOrderHistory = allOrder.toArray(new String[0]);
        String[][] cusOrderHistory2D = new String[customerOrderHistory.length][6];
        for(int i=0; i< customerOrderHistory.length ; i++){
            for(int j=0; j<6; j++){
                cusOrderHistory2D[i][j] = customerOrderHistory[i].split(":")[j]; 
                System.out.println(Arrays.toString(cusOrderHistory2D[i])+ "hahaha");
            }
        }
        int i =0;
        int cnt=0; // array size of cusOrderHistory
        while(i <cusOrderHistory2D.length){
            if (cusOrderHistory2D[i][2].equals(customerTpNO)) {
                cnt = cnt +1;
            }
            i++;
        }
        String[][] cusHistory = new String[cnt][6];
            for (int k = 0; k < cusHistory.length; k++) {
                if (cusOrderHistory2D[k][2].equals(customerTpNO)) {
                    cusHistory[k] = cusOrderHistory2D[k];
                }   
            }
            System.out.println( Arrays.toString( cusHistory[0])); 
        return cusHistory;
        } 
       catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public String[][] managerload_orderHistory(){
        try {
             BufferedReader rd = new BufferedReader(new FileReader(orderFile));
             ArrayList<String> allOrders = new ArrayList<String>();
             String line;
        while (( line = rd.readLine())!= null) {
            allOrders.add(line);
        }
        String[] allcustomerOrders = allOrders.toArray(new String[0]);
        String[][] allcustomerOrders2D = new String[allcustomerOrders.length][6];
        for(int i=0; i< allcustomerOrders.length ; i++){
            for(int j=0; j<6; j++){
                allcustomerOrders2D[i][j] = allcustomerOrders[i].split(":")[j]; 
            }
        }
        return allcustomerOrders2D;
        } 
       catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
}
