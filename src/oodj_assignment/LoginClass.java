/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class LoginClass 
{
    private String id; //refers to ManagerID or TPNumber
    private String password;
    
    public LoginClass(String i, String p)
    {
        id = i;
        password = p;
    }
    
    public String login(String u)
    {
        String status = null;
        
        try
        {
            BufferedReader input = new BufferedReader(new FileReader("UserDetails.txt"));
            String line = null;
            while ((line = input.readLine()) != null)
            {
                String[] values = line.split(":");
                if (id == values[0])
                {
                    JOptionPane.showMessageDialog(null, "Success");
                } 
            }
        }
        catch(IOException e)
        {
        
        }
        return status;
    }
}

