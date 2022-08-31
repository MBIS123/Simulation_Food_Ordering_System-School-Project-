/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.awt.MenuItem;
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
public class Menu {
    
    //for jinhao
    
    File menuFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Menu.txt");
    
    String [][] menu;
    static  protected String customerName;
    static  protected String customerTpNO;
    
    //for jayren  thx bro
    //File menuFile = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\Menu.txt");

    public Menu() {
        menu = load_Menu_Data();
    }
    
    void setCustomerDetails(String cusName, String cusTpNo){
        customerName = cusName;
        customerTpNO = cusTpNo;
    
    }
    
    String[][] load_Menu_Data (){
        ArrayList<String> menuItem1;
        try {
             BufferedReader rd = new BufferedReader(new FileReader(menuFile));
             ArrayList<String> menuAL = new ArrayList<String>();
             String line;
        while (( line = rd.readLine())!= null) {
            menuAL.add(line);
        }
        rd.close();
        
        String[] menuArray = menuAL.toArray(new String[0]);
        String[][] menuArray2D = new String[menuArray.length][3];
        for(int i=0; i< menuArray.length ; i++){
            for(int j=0; j<3; j++){
                menuArray2D[i][j] = menuArray[i].split(":")[j]; 
            }
        }
        return menuArray2D;  
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    void display_Menu_To_List(JList localFoodList, JList WesternFoodList,JList BeverageList,JList priceLocalFoodList,JList priceWesternList,JList priceBeverageList){
        DefaultListModel temp1 = new DefaultListModel();
        localFoodList.setModel(temp1);
        for(int i=0; i< menu.length;i++){
            if("Local".equals(menu[i][0])){
                temp1.addElement(menu[i][1]);   }
    }
    
        DefaultListModel temp3 = new DefaultListModel();
        WesternFoodList.setModel(temp3);
        for(int i=0; i< menu.length;i++){
            if("Western Food".equals(menu[i][0])){
                temp3.addElement(menu[i][1]);   }
        }
        
        DefaultListModel temp2 = new DefaultListModel();
        BeverageList.setModel(temp2);
        for(int i=0; i< menu.length;i++){
            if("Beverage".equals(menu[i][0])){
                temp2.addElement(menu[i][1]);   }
    }
        DefaultListModel price1 = new DefaultListModel();
        priceLocalFoodList.setModel(price1);
        for(int i=0; i< menu.length;i++){
            if("Local".equals(menu[i][0])){
                price1.addElement("RM"+menu[i][2]);   }
    }
        DefaultListModel price2 = new DefaultListModel();
        priceWesternList.setModel(price2);
        for(int i=0; i< menu.length;i++){
            if("Western Food".equals(menu[i][0])){
                price2.addElement("RM"+menu[i][2]);   }
    }
        DefaultListModel price3 = new DefaultListModel();
        priceBeverageList.setModel(price3);
        for(int i=0; i< menu.length;i++){
            if("Beverage".equals(menu[i][0])){
                price3.addElement("RM"+menu[i][2]);   }
    }
    }
}
