/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author HAO
 */
public class MenuManagement extends  Menu{
    
    void load_SelectedMenu_TOComboBox(String selectedMenu , JComboBox comboBox ){
            DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
            comboBox.setModel(cbModel);
            for (int i = 0; i < menu.length; i++) {
                if (selectedMenu.equals(menu[i][0])) {
                    cbModel.addElement(menu[i][1]); 
                }
            }

    }
    
    Boolean verifyEditPrice(JComboBox foodBox , JComboBox prBox){
        if (foodBox.getSelectedIndex()!= -1 && prBox.getSelectedIndex()!= -1) {
            return true;
        }
        else
            return false;
    }
    
    void emptyComboBx (JComboBox comboBox){
    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
            comboBox.setModel(cbModel);
            cbModel.addElement("");
    }
    
    void changePrice_Write_ToMenuFile(String selectedItem , String newPrice){
        for (int i = 0; i < menu.length; i++) {
            if (menu[i][1].equals(selectedItem)) {
                menu[i][2] = newPrice;   
            } 
        }
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(menuFile));
            
            for (int i = 0; i < menu.length; i++) {
                String line = menu[i][0]+":"+ menu[i][1]+":"+ menu[i][2]+"\n";
                pw.write(line);
            }
            pw.close();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
      void removeItem_Write_ToMenuFile(String selectedItem){
          
          String[][] tempMenu = new String[menu.length][3];
          int idx =0;
          int k =0;
          while(k <menu.length){
               if ( menu[k][1].equals(selectedItem)) {
                  idx=1;
                  k++;
                  continue;  
              }
                tempMenu[k-idx] = menu[k];
                k++;
          }
          
          try {
              PrintWriter pw = new PrintWriter(new FileWriter(menuFile));
              for (int i = 0; i < menu.length; i++) {
                  if (tempMenu[i][0]== null) {
                      continue;  
                  }
                String line = tempMenu[i][0]+":"+ tempMenu[i][1]+":"+ tempMenu[i][2]+"\n";
                pw.write(line);
            }
            pw.close();
          } catch (Exception e) {
              System.out.println(e);
          }

    }
      
      void addItem_WriteToMenuFile(JComboBox foodtype , JTextField itemName , JComboBox price){
          
          String fType = foodtype.getSelectedItem().toString();
          String iName = itemName.getText();
          String prc =  price.getSelectedItem().toString();
          String[][] tempAry = new String[(menu.length+1)][3];
          for (int i = 0; i < menu.length; i++) {
              tempAry[i] = menu[i];
          }
          tempAry[menu.length][0] = fType;
          tempAry[menu.length][1] = iName;
          tempAry[menu.length][2] = prc;
          try {
              PrintWriter pw = new PrintWriter(new FileWriter(menuFile));
              for (int i = 0; i < tempAry.length; i++) {
                String line = tempAry[i][0]+":"+ tempAry[i][1]+":"+ tempAry[i][2]+"\n";
                pw.write(line);
            }
            pw.close();
          } catch (Exception e) {
              System.out.println(e);
          }
          
          
          
      
      
      
      }
      
      
      
      
       Boolean verifyAlphabet (JTextField textFieldItemName ){  
        String regexCharOnly ="[A-Za-z ]*";
        Pattern p = Pattern.compile(regexCharOnly);
        Matcher m = p.matcher(textFieldItemName.getText());
        Boolean isString = m.matches();
        if (textFieldItemName.getText().equals(""))
            return false;
        return isString;
    }
       
       
    
    
    
    
    
    }
    
    
    
  
    

