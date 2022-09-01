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
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public UserLogin() {
        initComponents();
    }
    
    private String line;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblTPNo = new javax.swing.JLabel();
        txtTPNo = new javax.swing.JTextField();
        lblWelcome = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnLogin.setBackground(new java.awt.Color(254, 120, 83));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnLogin.setText("LOGIN");
        btnLogin.setAlignmentY(0.0F);
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnLogin.setBorderPainted(false);
        btnLogin.setIconTextGap(30);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Password           :");
        lblPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPasswordMousePressed(evt);
            }
        });

        lblTPNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblTPNo.setForeground(new java.awt.Color(102, 102, 102));
        lblTPNo.setText("TP Number        :");
        lblTPNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTPNoMousePressed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(254, 120, 83));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("WELCOME TO APU CAFETERIA ORDERING SYSTEM");
        lblWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblWelcomeMousePressed(evt);
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
            .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTPNo, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(txtTPNo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTPNo)
                    .addComponent(txtTPNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        String TPNox = txtTPNo.getText();
        String pwx = String.valueOf(txtPassword.getPassword());
        
        if (((TPNox.length() >= 8) && (pwx.length() >= 8)))
        {
            try
            {
                //you will have to change this according to the local filepath
               //File filex = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\AllUserDetails.txt");
                
                // Hao
                File filex = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\AllUserDetails.txt");
                Scanner scan1 = new Scanner(filex);                
                
                boolean flag = false;

                while(scan1.hasNext() && flag == false)
                {

                    line = scan1.nextLine();
                    if((line.contains(TPNox)) && (line.contains(pwx)))
                    {
                        String[] record = line.split(":");
                        String ID = record[0];
                        String pw = record[1];
                        
                        if (TPNox.equals(ID) && (pwx.equals(pw)))
                        {
                            flag = true;
                        }                        
                    }
                }    

                if (flag == true)
                {
                    //create temporary user file
                    // Jay ren
                    //File file = new File("C:\\Users\\hp\\Desktop\\APU\\Year 2\\Modules\\OODJ\\jrenOODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
                    // HAO :
                    File file = new File("C:\\Users\\HAO\\Documents\\NetBeansProjects\\OODJ_Assignment\\src\\oodj_assignment\\tempuserdetails");
                    
                    
                    FileWriter fw = new FileWriter(file);

                    fw.write(line);
                    fw.close();

                    Scanner scan3 = new Scanner(file);
                    scan3.useDelimiter("[:\n]");

                    String TPNo = scan3.next();
                    String pw = scan3.next();
                    String name = scan3.next();
                    String gender = scan3.next();
                    String address = scan3.next();
                    String contactno = scan3.next();
                    String email = scan3.next();
                    String DOB = scan3.next();   
                    scan3.close();

                    JOptionPane.showMessageDialog(null, "Login Successful!");

                    UserInterface passingData =  new UserInterface();
                    passingData.setData(TPNo, pw, name, gender, address, contactno, email, DOB);
                    UserInterface formMenu =  new UserInterface();
                    formMenu.setVisible(true);
                    

                    this.dispose();
                    //formMenu.setBackground(Color.yellow);
                    //formMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Username/Password.");
                    txtTPNo.setText("");
                    txtPassword.setText("");
                }
            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null, "An Error Occured!" + e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid Username/Password.");
            txtTPNo.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPasswordMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPasswordMousePressed

    private void lblTPNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTPNoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTPNoMousePressed

    private void lblWelcomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWelcomeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblWelcomeMousePressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        PreLogin formPreLogin = new PreLogin();
        formPreLogin.setVisible(true);
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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTPNo;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTPNo;
    // End of variables declaration//GEN-END:variables
}
