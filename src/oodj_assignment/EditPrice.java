/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

/**
 *
 * @author HAO
 */
public class EditPrice extends javax.swing.JFrame {

    /**
     * Creates new form EditPrice
     */
    MenuManagement objMM = new MenuManagement();
    public EditPrice() {
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

        jLabel1 = new javax.swing.JLabel();
        btnLocal = new javax.swing.JRadioButton();
        btnWestern = new javax.swing.JRadioButton();
        btnBeverage = new javax.swing.JRadioButton();
        btnExit1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        cbBoxFood = new javax.swing.JComboBox<>();
        priceCbBx = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 120, 83));
        jLabel1.setText("Edit Price");

        btnLocal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLocal.setForeground(new java.awt.Color(254, 120, 83));
        btnLocal.setText("Local Food");
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });

        btnWestern.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnWestern.setForeground(new java.awt.Color(254, 120, 83));
        btnWestern.setText("Western Food");
        btnWestern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWesternActionPerformed(evt);
            }
        });

        btnBeverage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBeverage.setForeground(new java.awt.Color(254, 120, 83));
        btnBeverage.setText("Beverage");
        btnBeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeverageActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Select Item ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Set new price  : RM");
        jLabel3.setToolTipText("");

        btnConfirm.setBackground(new java.awt.Color(204, 255, 204));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(102, 102, 102));
        btnConfirm.setText("Change New Price");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        cbBoxFood.setMaximumRowCount(200);
        cbBoxFood.setEnabled(false);
        cbBoxFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBoxFoodActionPerformed(evt);
            }
        });

        priceCbBx.setMaximumRowCount(200);
        priceCbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        priceCbBx.setSelectedIndex(-1);
        priceCbBx.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLocal)
                        .addGap(18, 18, 18)
                        .addComponent(btnWestern)
                        .addGap(18, 18, 18)
                        .addComponent(btnBeverage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(cbBoxFood, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(priceCbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExit1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocal)
                    .addComponent(btnWestern)
                    .addComponent(btnBeverage))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBoxFood, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(priceCbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit1)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new UpdateMenu().setVisible(true);
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        priceCbBx.setSelectedIndex(-1);
        if (btnLocal.isSelected()) {
            btnWestern.setEnabled(Boolean.FALSE);
            btnBeverage.setEnabled(Boolean.FALSE);
            cbBoxFood.setEnabled(Boolean.TRUE);
            priceCbBx.setEnabled(Boolean.TRUE);
            objMM.load_SelectedMenu_TOComboBox("Local", cbBoxFood);
        }
        else{
            cbBoxFood.setEnabled(Boolean.FALSE);
            priceCbBx.setEnabled(Boolean.FALSE);
            btnWestern.setEnabled(Boolean.TRUE);
            btnBeverage.setEnabled(Boolean.TRUE);
            objMM.emptyComboBx(cbBoxFood);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnWesternActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWesternActionPerformed
        priceCbBx.setSelectedIndex(-1);
        if (btnWestern.isSelected()) {
            btnLocal.setEnabled(Boolean.FALSE);
            btnBeverage.setEnabled(Boolean.FALSE);
            cbBoxFood.setEnabled(Boolean.TRUE);
            priceCbBx.setEnabled(Boolean.TRUE);
            objMM.load_SelectedMenu_TOComboBox("Western Food", cbBoxFood);
        }
        else{
             priceCbBx.setEnabled(Boolean.FALSE);
            cbBoxFood.setEnabled(Boolean.FALSE);
            btnLocal.setEnabled(Boolean.TRUE);
            btnBeverage.setEnabled(Boolean.TRUE);
            objMM.emptyComboBx(cbBoxFood);
        }  
    }//GEN-LAST:event_btnWesternActionPerformed

    private void btnBeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeverageActionPerformed
        priceCbBx.setSelectedIndex(-1);
        if (btnBeverage.isSelected()) {
            btnLocal.setEnabled(Boolean.FALSE);
            btnWestern.setEnabled(Boolean.FALSE);
            cbBoxFood.setEnabled(Boolean.TRUE);
            priceCbBx.setEnabled(Boolean.TRUE);
            objMM.load_SelectedMenu_TOComboBox("Beverage", cbBoxFood);
        }
        else{
             priceCbBx.setEnabled(Boolean.FALSE);
            cbBoxFood.setEnabled(Boolean.FALSE);
            btnLocal.setEnabled(Boolean.TRUE);
            btnWestern.setEnabled(Boolean.TRUE);
            objMM.emptyComboBx(cbBoxFood);
        }  
    }//GEN-LAST:event_btnBeverageActionPerformed

    private void cbBoxFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBoxFoodActionPerformed
      priceCbBx.setSelectedIndex(-1);
    }//GEN-LAST:event_cbBoxFoodActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (objMM.verifyEditPrice(cbBoxFood, priceCbBx)) {

        int reply =JOptionPane.showConfirmDialog(null," Do u want set the price for " + cbBoxFood.getSelectedItem()+" to RM"+priceCbBx.getSelectedItem(),"Confirmation",JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            objMM.changePrice_Write_ToMenuFile(cbBoxFood.getSelectedItem().toString(), priceCbBx.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null,"Price changed sucessfully");
            this.dispose();
            new UpdateMenu().setVisible(true);
        }
        }
        else
            JOptionPane.showMessageDialog(null,"Please ensure item and new price is selected!","Warning",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(EditPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnBeverage;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnExit1;
    private javax.swing.JRadioButton btnLocal;
    private javax.swing.JRadioButton btnWestern;
    private javax.swing.JComboBox<String> cbBoxFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> priceCbBx;
    // End of variables declaration//GEN-END:variables
}
