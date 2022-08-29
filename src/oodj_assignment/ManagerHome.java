/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ManagerHome extends javax.swing.JFrame {
    
    //declare class variables that can be called from child classes
    private String managerID;
    private String pw;
    private String name;
    private String gender;
    private String address;
    private String contactno;
    private String email;
    private String DOB;
    
    //create setter method
    void setData(String mid, String pass, String nm, String gen, String add, String cont, String em, String birth)
    {
        managerID = mid;
        pw = pass;
        name = nm;
        gender = gen;
        address = add;
        contactno = cont;
        email = em;
        DOB = birth;
        
        lblName.setText(name);
    }
    
        /**
     * Creates new form ManagerHome
     */
    public ManagerHome() {
        initComponents();
    }
     
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewMenu = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnViewProf = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnViewOrders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnViewMenu.setBackground(new java.awt.Color(254, 120, 83));
        btnViewMenu.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnViewMenu.setForeground(new java.awt.Color(242, 242, 242));
        btnViewMenu.setText("VIEW/UPDATE MENU");
        btnViewMenu.setAlignmentY(0.0F);
        btnViewMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnViewMenu.setBorderPainted(false);
        btnViewMenu.setIconTextGap(30);
        btnViewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMenuActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(254, 120, 83));
        btnRegister.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(242, 242, 242));
        btnRegister.setText("REGISTER NEW USER");
        btnRegister.setAlignmentY(0.0F);
        btnRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnRegister.setBorderPainted(false);
        btnRegister.setIconTextGap(30);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnViewProf.setBackground(new java.awt.Color(254, 120, 83));
        btnViewProf.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnViewProf.setForeground(new java.awt.Color(242, 242, 242));
        btnViewProf.setText("VIEW PROFILE");
        btnViewProf.setAlignmentY(0.0F);
        btnViewProf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnViewProf.setBorderPainted(false);
        btnViewProf.setIconTextGap(30);
        btnViewProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(254, 120, 83));
        btnLogout.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(242, 242, 242));
        btnLogout.setText("LOG OUT");
        btnLogout.setAlignmentY(0.0F);
        btnLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnLogout.setBorderPainted(false);
        btnLogout.setIconTextGap(30);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(102, 102, 102));
        lblWelcome.setText("Welcome,");
        lblWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblWelcomeMousePressed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(254, 120, 83));
        lblName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNameMousePressed(evt);
            }
        });

        btnViewOrders.setBackground(new java.awt.Color(254, 120, 83));
        btnViewOrders.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnViewOrders.setForeground(new java.awt.Color(242, 242, 242));
        btnViewOrders.setText("VIEW ALL ORDERS");
        btnViewOrders.setAlignmentY(0.0F);
        btnViewOrders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnViewOrders.setBorderPainted(false);
        btnViewOrders.setIconTextGap(30);
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewProf, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(209, 209, 209))))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblWelcome))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewProf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        PreLogin formPreLogin = new PreLogin();
        formPreLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnViewMenuActionPerformed

    private void btnViewProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfActionPerformed
        // TODO add your handling code here:
        ManagerProfile formManagerProfile = new ManagerProfile(managerID, pw, name, gender, address, contactno, email, DOB);
        //formManagerProfile.LoadManagerProfile();
        //ManagerProfile formManagerProfile = new ManagerProfile();
        formManagerProfile.setVisible(true);
    }//GEN-LAST:event_btnViewProfActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        ManagerManageOrders formManageOrders = new ManagerManageOrders();
        formManageOrders.setVisible(true);
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        UserRegistration formUserReg = new UserRegistration();
        formUserReg.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblWelcomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWelcomeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblWelcomeMousePressed

    private void lblNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNameMousePressed

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
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerHome().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnViewMenu;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JButton btnViewProf;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
