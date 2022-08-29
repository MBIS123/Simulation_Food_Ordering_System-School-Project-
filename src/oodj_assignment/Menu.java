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

/**
 *
 * @author HAO
 */
public class Menu {
    
    //for jinhao
    //File menuFile = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\Menu.txt");
    
    //for jayren
    File menuFile = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\Menu.txt");

    public Menu() {
       
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
            System.out.println(e+ "jaja");
        }
        return null;
    }   
}
