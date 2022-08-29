/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */

public class ManagerProfile extends javax.swing.JFrame{

   String ManagerID;
   String ManagerPW;
   String ManagerName;
   String ManagerGender;
   String ManagerAddress;
   String ManagerContact;
   String ManagerEmail;
   String ManagerDOB;

    /**
     * Creates new form ManagerProfile
     */
    public ManagerProfile() {
        initComponents();
        txtManagerID.setText("SIU");
    }
    
    //constructor method
    public ManagerProfile(String ID, String Pass, String Name, String gen, String add, String cont, String email, String date)
    {
        initComponents();

        ManagerID = ID;
        ManagerPW = Pass;
        ManagerName = Name;
        ManagerGender = gen;
        ManagerAddress = add;
        ManagerContact = cont;
        ManagerEmail = email;
        ManagerDOB = date;
        
        txtManagerID.setText(ManagerID);
        txtManagerName.setText(ManagerName);
        txtManagerContact.setText(ManagerContact);
        txtManagerEmail.setText(ManagerEmail);
        txtManagerDOB.setText(ManagerDOB);
        txtManagerGender.setText(ManagerGender);
        txtManagerAddress.setText(ManagerAddress);
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lblWelcome = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        PanelRegDetails = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblTPNo = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTPNo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtContact = new javax.swing.JTextArea();
        btnViewOrders = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        lblMyProfile = new javax.swing.JLabel();
        btnUpdateManagerProfile = new javax.swing.JButton();
        PanelRegDetails1 = new javax.swing.JPanel();
        lblManagerName = new javax.swing.JLabel();
        lblManagerID = new javax.swing.JLabel();
        lblManagerContact = new javax.swing.JLabel();
        lblManagerEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblManagerEmail1 = new javax.swing.JLabel();
        txtManagerID = new javax.swing.JTextField();
        txtManagerName = new javax.swing.JTextField();
        txtManagerGender = new javax.swing.JTextField();
        txtManagerDOB = new javax.swing.JTextField();
        txtManagerContact = new javax.swing.JTextField();
        txtManagerEmail = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtManagerAddress = new javax.swing.JTextArea();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(254, 120, 83));
        lblWelcome.setText("MY PROFILE");
        lblWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblWelcomeMousePressed(evt);
            }
        });

        lblPic.setText("[Insert Photo Here]");

        PanelRegDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("                            Name :");

        lblTPNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTPNo.setText("                   TP Number :");

        lblContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContact.setText("                  Contact No. :");

        txtTPNo.setColumns(20);
        txtTPNo.setRows(5);
        jScrollPane1.setViewportView(txtTPNo);

        txtName.setColumns(20);
        txtName.setRows(5);
        jScrollPane2.setViewportView(txtName);

        txtContact.setColumns(20);
        txtContact.setRows(5);
        jScrollPane3.setViewportView(txtContact);

        javax.swing.GroupLayout PanelRegDetailsLayout = new javax.swing.GroupLayout(PanelRegDetails);
        PanelRegDetails.setLayout(PanelRegDetailsLayout);
        PanelRegDetailsLayout.setHorizontalGroup(
            PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTPNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PanelRegDetailsLayout.setVerticalGroup(
            PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblTPNo)))
                .addGroup(PanelRegDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblContact))
                    .addGroup(PanelRegDetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnViewOrders.setBackground(new java.awt.Color(254, 120, 83));
        btnViewOrders.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnViewOrders.setForeground(new java.awt.Color(242, 242, 242));
        btnViewOrders.setText("UPDATE");
        btnViewOrders.setAlignmentY(0.0F);
        btnViewOrders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnViewOrders.setBorderPainted(false);
        btnViewOrders.setIconTextGap(30);

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

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(PanelRegDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(PanelRegDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(770, 339));

        btnExit1.setBackground(new java.awt.Color(254, 120, 83));
        btnExit1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(242, 242, 242));
        btnExit1.setText("EXIT");
        btnExit1.setAlignmentY(0.0F);
        btnExit1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExit1.setBorderPainted(false);
        btnExit1.setIconTextGap(30);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        lblMyProfile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblMyProfile.setForeground(new java.awt.Color(254, 120, 83));
        lblMyProfile.setText("MY PROFILE");
        lblMyProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMyProfileMousePressed(evt);
            }
        });

        btnUpdateManagerProfile.setBackground(new java.awt.Color(254, 120, 83));
        btnUpdateManagerProfile.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnUpdateManagerProfile.setForeground(new java.awt.Color(242, 242, 242));
        btnUpdateManagerProfile.setText("UPDATE");
        btnUpdateManagerProfile.setAlignmentY(0.0F);
        btnUpdateManagerProfile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdateManagerProfile.setBorderPainted(false);
        btnUpdateManagerProfile.setIconTextGap(30);
        btnUpdateManagerProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManagerProfileActionPerformed(evt);
            }
        });

        PanelRegDetails1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblManagerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblManagerName.setText("                            Name :");

        lblManagerID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblManagerID.setText("                  Manager ID :");

        lblManagerContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblManagerContact.setText("                  Contact No. :");

        lblManagerEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblManagerEmail.setText("                             Email :");

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGender.setText("                          Gender :");

        lblDOB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDOB.setText("                               DOB :");

        lblManagerEmail1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblManagerEmail1.setText("                        Address :");

        txtManagerID.setEditable(false);

        txtManagerName.setEditable(false);

        txtManagerGender.setEditable(false);

        txtManagerDOB.setEditable(false);

        txtManagerContact.setEditable(false);

        txtManagerEmail.setEditable(false);
        txtManagerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManagerEmailActionPerformed(evt);
            }
        });

        txtManagerAddress.setEditable(false);
        txtManagerAddress.setColumns(20);
        txtManagerAddress.setRows(5);
        jScrollPane4.setViewportView(txtManagerAddress);

        javax.swing.GroupLayout PanelRegDetails1Layout = new javax.swing.GroupLayout(PanelRegDetails1);
        PanelRegDetails1.setLayout(PanelRegDetails1Layout);
        PanelRegDetails1Layout.setHorizontalGroup(
            PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                                .addComponent(lblManagerID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtManagerID, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                                .addComponent(lblManagerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtManagerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                                .addComponent(lblManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtManagerGender))
                            .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                                .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtManagerDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblManagerEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                            .addComponent(lblManagerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtManagerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PanelRegDetails1Layout.setVerticalGroup(
            PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagerID)
                    .addComponent(txtManagerID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagerName)
                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtManagerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtManagerDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagerContact)
                    .addComponent(txtManagerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagerEmail)
                    .addComponent(txtManagerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelRegDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblManagerEmail1))
                    .addGroup(PanelRegDetails1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateManagerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelRegDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMyProfile)
                .addGap(18, 18, 18)
                .addComponent(PanelRegDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateManagerProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblWelcomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWelcomeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblWelcomeMousePressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:        
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void lblMyProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMyProfileMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMyProfileMousePressed

    private void txtManagerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManagerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManagerEmailActionPerformed

    private void btnUpdateManagerProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManagerProfileActionPerformed
        // TODO add your handling code here:
        UpdateManagerProfile ump = new UpdateManagerProfile();
        ump.ViewUpdateManagerProfile(ManagerContact, ManagerEmail, ManagerAddress);
        ump.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateManagerProfileActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRegDetails;
    private javax.swing.JPanel PanelRegDetails1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnUpdateManagerProfile;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblManagerContact;
    private javax.swing.JLabel lblManagerEmail;
    private javax.swing.JLabel lblManagerEmail1;
    private javax.swing.JLabel lblManagerID;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JLabel lblMyProfile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblTPNo;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextArea txtContact;
    private javax.swing.JTextArea txtManagerAddress;
    private javax.swing.JTextField txtManagerContact;
    private javax.swing.JTextField txtManagerDOB;
    private javax.swing.JTextField txtManagerEmail;
    private javax.swing.JTextField txtManagerGender;
    private javax.swing.JTextField txtManagerID;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextArea txtName;
    private javax.swing.JTextArea txtTPNo;
    // End of variables declaration//GEN-END:variables
}
