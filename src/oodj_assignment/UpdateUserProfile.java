/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class UpdateUserProfile extends javax.swing.JFrame {

    boolean ContactSuccess = false;
    boolean EmailSuccess = false;
    boolean AddressSuccess = false;
    boolean PassSuccess = false;

    /**
     * Creates new form UpdateCustomerProfile
     */
    public UpdateUserProfile() {
        initComponents();
    }

    void ViewUpdateUserProfile(String cont, String email, String add) 
    {
        txtUpdateContact.setText(cont);
        txtUpdateEmail.setText(email);
        txtUpdateAddress.setText(add);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegDetails = new javax.swing.JPanel();
        lblUpdateContact = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUpdateContact = new javax.swing.JTextArea();
        lblAddress = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtUpdateAddress = new javax.swing.JTextArea();
        lblEmail = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtUpdateEmail = new javax.swing.JTextArea();
        btnUpdateDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelPassword = new javax.swing.JPanel();
        lblUpdateNewPW = new javax.swing.JLabel();
        lblUpdateConfPW = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtUpdateConfPW = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtUpdateNewPW = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCurrentPW = new javax.swing.JTextArea();
        lblCurrentPW = new javax.swing.JLabel();
        btnUpdatePW = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelRegDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblUpdateContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUpdateContact.setText("                  Contact No. :");

        txtUpdateContact.setColumns(20);
        txtUpdateContact.setRows(5);
        jScrollPane3.setViewportView(txtUpdateContact);

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAddress.setText("                        Address :");

        txtUpdateAddress.setColumns(20);
        txtUpdateAddress.setRows(5);
        jScrollPane7.setViewportView(txtUpdateAddress);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setText("                             Email :");

        txtUpdateEmail.setColumns(20);
        txtUpdateEmail.setRows(5);
        jScrollPane8.setViewportView(txtUpdateEmail);

        javax.swing.GroupLayout PanelRegDetailsLayout = new javax.swing.GroupLayout(PanelRegDetails);
        PanelRegDetails.setLayout(PanelRegDetailsLayout);
        PanelRegDetailsLayout.setHorizontalGroup(
            PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addComponent(lblUpdateContact, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PanelRegDetailsLayout.setVerticalGroup(
            PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUpdateContact))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblAddress)))
                .addGap(29, 29, 29))
        );

        btnUpdateDetails.setBackground(new java.awt.Color(254, 120, 83));
        btnUpdateDetails.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnUpdateDetails.setForeground(new java.awt.Color(242, 242, 242));
        btnUpdateDetails.setText("UPDATE DETAILS");
        btnUpdateDetails.setAlignmentY(0.0F);
        btnUpdateDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdateDetails.setBorderPainted(false);
        btnUpdateDetails.setIconTextGap(30);
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Change Details");

        lblUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblUpdate.setForeground(new java.awt.Color(254, 120, 83));
        lblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdate.setText("UPDATE PROFILE");
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblUpdateMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Change Password");

        PanelPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblUpdateNewPW.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUpdateNewPW.setText("     Enter New Password :");

        lblUpdateConfPW.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUpdateConfPW.setText("Confirm New Password :");

        txtUpdateConfPW.setColumns(20);
        txtUpdateConfPW.setRows(5);
        jScrollPane5.setViewportView(txtUpdateConfPW);

        txtUpdateNewPW.setColumns(20);
        txtUpdateNewPW.setRows(5);
        jScrollPane4.setViewportView(txtUpdateNewPW);

        txtCurrentPW.setColumns(20);
        txtCurrentPW.setRows(5);
        jScrollPane6.setViewportView(txtCurrentPW);

        lblCurrentPW.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCurrentPW.setText("Enter Current Password :");

        javax.swing.GroupLayout PanelPasswordLayout = new javax.swing.GroupLayout(PanelPassword);
        PanelPassword.setLayout(PanelPasswordLayout);
        PanelPasswordLayout.setHorizontalGroup(
            PanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUpdateNewPW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUpdateConfPW, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(lblCurrentPW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPasswordLayout.setVerticalGroup(
            PanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPasswordLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(PanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPasswordLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPasswordLayout.createSequentialGroup()
                        .addComponent(lblCurrentPW)
                        .addGap(26, 26, 26)))
                .addGroup(PanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPasswordLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblUpdateNewPW)
                        .addGap(30, 30, 30)
                        .addComponent(lblUpdateConfPW))
                    .addGroup(PanelPasswordLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        btnUpdatePW.setBackground(new java.awt.Color(254, 120, 83));
        btnUpdatePW.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnUpdatePW.setForeground(new java.awt.Color(242, 242, 242));
        btnUpdatePW.setText("UPDATE PASSWORD");
        btnUpdatePW.setAlignmentY(0.0F);
        btnUpdatePW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdatePW.setBorderPainted(false);
        btnUpdatePW.setIconTextGap(30);
        btnUpdatePW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePWActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(254, 120, 83));
        btnExit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(242, 242, 242));
        btnExit.setText("EXIT");
        btnExit.setAlignmentY(0.0F);
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExit.setBorderPainted(false);
        btnExit.setIconTextGap(30);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(163, 163, 163))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PanelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdateDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelRegDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdatePW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addComponent(lblUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpdate)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRegDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdatePW, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:
        DataValidation val = new DataValidation();
        String newcont = txtUpdateContact.getText();
        String newem = txtUpdateEmail.getText();
        String newaddress = txtUpdateAddress.getText();

        if (val.isContact(newcont))
        {
            JOptionPane.showMessageDialog(null, "New Contact No. is valid!");
            ContactSuccess = true;
        }

        if (val.isEmail(newem))
        {
            JOptionPane.showMessageDialog(null, "New Email is valid!");
            EmailSuccess = true;
        }

        if (val.isAddress(newaddress))
        {
            JOptionPane.showMessageDialog(null, "New Address is valid!");
            AddressSuccess = true;
        }

        if ((ContactSuccess == true) && (EmailSuccess == true) && (AddressSuccess == true))
        {          
            try
            {
                //you will have to change this according to the local filepath
                //Jay Ren
                //File filex = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
                //Hao
                File filex = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
                
                //read temp file to variables
                //change those variables in both temp file and original file
                Scanner scan2 = new Scanner(filex);              
                scan2.useDelimiter("[:\n]");

                String TPNo = scan2.next();
                String pw = scan2.next();
                String name = scan2.next();
                String gender = scan2.next();
                String address = scan2.next();
                String contactno = scan2.next();
                String email = scan2.next();
                String DOB = scan2.next();   
                scan2.close();

                //write to file (https://stackoverflow.com/questions/3935791/find-and-replace-words-lines-in-a-file)
               // Path detailspath = Paths.get("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\AllUserDetails.txt");
               // Path temppath = Paths.get("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
               
                      Path detailspath = Paths.get("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\AllUserDetails.txt");
                        Path temppath = Paths.get("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
                
                Charset charset = StandardCharsets.UTF_8;

                String detailscontent = new String(Files.readAllBytes(detailspath), charset);
                String tempcontent = new String(Files.readAllBytes(temppath), charset);

                detailscontent = detailscontent.replaceAll(contactno, newcont);
                detailscontent = detailscontent.replaceAll(email, newem);
                detailscontent = detailscontent.replaceAll(address, newaddress);
                Files.write(detailspath, detailscontent.getBytes(charset));
                
                tempcontent = tempcontent.replaceAll(contactno, newcont);
                tempcontent = tempcontent.replaceAll(email, newem);
                tempcontent = tempcontent.replaceAll(address, newaddress);
                Files.write(temppath, tempcontent.getBytes(charset));

                FileOutputStream.nullOutputStream();
            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null, "An Error Occured!" + e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Update Unsuccessful! Please try again.");
        }
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void lblUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUpdateMousePressed

    private void btnUpdatePWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePWActionPerformed
        // TODO add your handling code here:
        DataValidation val = new DataValidation();
        String user_password = txtCurrentPW.getText();
        String new_password = txtUpdateNewPW.getText();

        try
        {
            //you will have to change this according to the local filepath
           // File filex = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
             File filex = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
             

            //read temp file to variables
            //change those variables in both temp file and original file
            Scanner scan2 = new Scanner(filex);              
            scan2.useDelimiter("[:\n]");

            String TPNo = scan2.next();
            String pw = scan2.next();
            String name = scan2.next();
            String gender = scan2.next();
            String address = scan2.next();
            String contactno = scan2.next();
            String email = scan2.next();
            String DOB = scan2.next();   
           
            if (pw.equals(user_password))
            {
                if (val.isPassword(new_password))
                {
                    if (new_password.equals(txtUpdateConfPW.getText()))
                    {
                        //write to file (https://stackoverflow.com/questions/3935791/find-and-replace-words-lines-in-a-file)
                       // Path detailspath = Paths.get("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\AllUserDetails.txt");
                       // Path temppath = Paths.get("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");

                        Path detailspath = Paths.get("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\AllUserDetails.txt");
                        Path temppath = Paths.get("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
                        Charset charset = StandardCharsets.UTF_8;

                        String detailscontent = new String(Files.readAllBytes(detailspath), charset);
                        String tempcontent = new String(Files.readAllBytes(temppath), charset);

                        detailscontent = detailscontent.replaceAll(pw, new_password);
                        Files.write(detailspath, detailscontent.getBytes(charset));

                        tempcontent = tempcontent.replaceAll(pw, new_password);
                        Files.write(temppath, tempcontent.getBytes(charset));

                        FileOutputStream.nullOutputStream();
                        
                        scan2.close();
                        
                        JOptionPane.showMessageDialog(null, "Password Updated!");

                        txtCurrentPW.setText("");
                        txtUpdateNewPW.setText("");
                        txtUpdateConfPW.setText("");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your new password does not match. Try again.");
                        txtCurrentPW.setText("");
                        txtUpdateNewPW.setText("");
                        txtUpdateConfPW.setText("");
                        scan2.close();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "New Password is not valid. Try again.");
                    txtCurrentPW.setText("");
                    txtUpdateNewPW.setText("");
                    txtUpdateConfPW.setText("");
                    scan2.close();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Input does not match current password. Try again.");
                txtCurrentPW.setText("");
                txtUpdateNewPW.setText("");
                txtUpdateConfPW.setText("");
                scan2.close();
            }
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_btnUpdatePWActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        try
        {
            //you will have to change this according to the local filepath
           // File filex = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
             File filex = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
            Scanner scan = new Scanner(filex);
            scan.useDelimiter("[:\n]");

            while(scan.hasNext())
            {
                String TPNo = scan.next();
                String pw = scan.next();
                String name = scan.next();
                String gender = scan.next();
                String add = scan.next();
                String contactno = scan.next();
                String email = scan.next();
                String date = scan.next();

                UserInterface form = new UserInterface();
                form.setData(TPNo, pw, name, gender, add, contactno, email, date);
                form.setVisible(true);

                scan.close();
            }
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, "An Error Occured!" + e);
        }

        this.dispose();

    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPassword;
    private javax.swing.JPanel PanelRegDetails;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btnUpdatePW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCurrentPW;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JLabel lblUpdateConfPW;
    private javax.swing.JLabel lblUpdateContact;
    private javax.swing.JLabel lblUpdateNewPW;
    private javax.swing.JTextArea txtCurrentPW;
    private javax.swing.JTextArea txtUpdateAddress;
    private javax.swing.JTextArea txtUpdateConfPW;
    private javax.swing.JTextArea txtUpdateContact;
    private javax.swing.JTextArea txtUpdateEmail;
    private javax.swing.JTextArea txtUpdateNewPW;
    // End of variables declaration//GEN-END:variables
}
