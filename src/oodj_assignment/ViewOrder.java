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
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author HAO
 */
public class ViewOrder extends Menu{
    
    File orderFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Order.txt");
    
    String[][] customerOrderHistory;

    public ViewOrder(JList orderIdList,JList orderItemList,JList grandTotalList) {
        customerOrderHistory = load_orderHistory();
        showCustomerOrderHistory(orderIdList,orderItemList,grandTotalList);
    }
    
    void showUserName(JLabel userNameLabel){
    userNameLabel.setText(customerName+ " Welcome back.");
    }
    
    void showCustomerOrderHistory (JList orderIdList,JList orderItemList,JList grandTotalList){
        
        DefaultListModel temp = new DefaultListModel();
        orderIdList.setModel(temp);
        for(int i=0; i< customerOrderHistory.length;i++){
            temp.addElement(" "+ customerOrderHistory[i][0]);   
    }
        DefaultListModel temp2 = new DefaultListModel();
        orderItemList.setModel(temp2);
        for(int i=0; i< customerOrderHistory.length;i++){
            temp2.addElement(" "+ customerOrderHistory[i][3]);   
    }
        DefaultListModel temp3 = new DefaultListModel();
        grandTotalList.setModel(temp3);
        for(int i=0; i< customerOrderHistory.length;i++){
            temp3.addElement(" RM"+customerOrderHistory[i][5]);   
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
            int x =0;
            for (int k = 0; k < cusOrderHistory2D.length; k++) {
                if (cusOrderHistory2D[k][2].equals(customerTpNO)) {
                    cusHistory[x] = cusOrderHistory2D[k];
                    System.out.println(Arrays.toString(cusHistory[x])+ x);
                    x++;
                }   
            }
        for(int m = 0; m < cusHistory.length; m++){
            System.out.println(Arrays.toString(cusHistory[m]));
        }
        
        return cusHistory;
        } 
       catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
}
