package com.finalproj.app;

import com.mycompany.oop_finalproj.*;
import java.awt.Dimension;
import javax.swing.JDialog;


import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class viewMenu extends javax.swing.JFrame {
    Order currentOrder = new Order();
    
    public viewMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        viewBurgers = new javax.swing.JButton();
        viewCombo = new javax.swing.JButton();
        viewPasta = new javax.swing.JButton();
        viewDrinks = new javax.swing.JButton();
        viewChicken = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        removeOrder = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categories");

        jPanel2.setBackground(new java.awt.Color(7, 130, 73));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "LET ME COOK", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Cambria Math", 1, 36), new java.awt.Color(255, 189, 20))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        viewBurgers.setText("BURGERS");
        viewBurgers.setMaximumSize(new java.awt.Dimension(152, 28));
        viewBurgers.setMinimumSize(new java.awt.Dimension(158, 28));
        viewBurgers.setPreferredSize(new java.awt.Dimension(152, 28));
        viewBurgers.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                viewBurgersStateChanged(evt);
            }
        });
        viewBurgers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBurgersActionPerformed(evt);
            }
        });

        viewCombo.setText("COMBO MEALS");
        viewCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComboActionPerformed(evt);
            }
        });

        viewPasta.setText("PASTAS");
        viewPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPastaActionPerformed(evt);
            }
        });

        viewDrinks.setText("DRINKS");
        viewDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrinksActionPerformed(evt);
            }
        });

        viewChicken.setText("CHICKEN");
        viewChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewChickenActionPerformed(evt);
            }
        });

        viewOrder.setText("VIEW ORDERS");
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });

        checkout.setText("CHECKOUT");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        removeOrder.setText("REMOVE ORDER");
        removeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOrderActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(viewDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewBurgers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewPasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewChicken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBurgers, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewBurgersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBurgersActionPerformed
        if(evt.getSource()==viewBurgers){  
            dispose();
            new burgerMenu().setVisible(true);
        }
    }//GEN-LAST:event_viewBurgersActionPerformed

    private void viewComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComboActionPerformed
        if(evt.getSource()==viewCombo){  
            dispose();
            new comboMenu().setVisible(true);
        }
    }//GEN-LAST:event_viewComboActionPerformed

    private void viewBurgersStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_viewBurgersStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBurgersStateChanged

    private void viewPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPastaActionPerformed
        if(evt.getSource()==viewPasta){
            dispose();
            new pastaMenu().setVisible(true);
        }
    }//GEN-LAST:event_viewPastaActionPerformed

    private void viewDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrinksActionPerformed
        if(evt.getSource()==viewDrinks){
            dispose();
            new drinkMenu().setVisible(true);
        }
    }//GEN-LAST:event_viewDrinksActionPerformed

    private void viewChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewChickenActionPerformed
        if(evt.getSource()==viewChicken){  
            dispose();
            new chickenMenu().setVisible(true);
        }
    }//GEN-LAST:event_viewChickenActionPerformed

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderActionPerformed
        if(evt.getSource()==viewOrder){
            if(currentOrder.getitemSize() == 0){ 
                JOptionPane.showMessageDialog(null, "You haven't added any orders. ","Error Message", JOptionPane.ERROR_MESSAGE);
                dispose();
                new viewMenu().setVisible(true);
            }else{  
                String receipt = currentOrder.viewCart();
                JTextArea text = new JTextArea(receipt);
                text.setEditable(false);
                JOptionPane.showMessageDialog(null, new JScrollPane(text),"Receipt", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new viewMenu().setVisible(true);
            }
            
        }
    }//GEN-LAST:event_viewOrderActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        if(evt.getSource()==checkout){
            if(currentOrder.getitemSize() == 0){ 
                JOptionPane.showMessageDialog(null, "You haven't added any orders. ","Error Message", JOptionPane.ERROR_MESSAGE);
                dispose();
                new viewMenu().setVisible(true);
            }else{  
                int choice = JOptionPane.showConfirmDialog(null,"Would you like to save your receipt?", "Receipt Confirmation",JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION){
                    currentOrder.saveReceipt();
                }
                    String receipt = currentOrder.makeReceipt();
                    JTextArea text = new JTextArea(receipt);
                    text.setEditable(false);
                    JOptionPane.showMessageDialog(null, new JScrollPane(text),"Receipt", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
            }
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void removeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOrderActionPerformed
        if (evt.getSource() == removeOrder){ 
            if(currentOrder.getitemSize() == 0){ 
                JOptionPane.showMessageDialog(null, "You haven't added any orders. ","Error Message", JOptionPane.ERROR_MESSAGE);
                dispose();
                new viewMenu().setVisible(true);
            }else{
                String receipt = currentOrder.viewCart();
                JTextArea text = new JTextArea(receipt);
                text.setEditable(false);
                JOptionPane receiptPane = new JOptionPane(new JScrollPane(text), JOptionPane.INFORMATION_MESSAGE,JOptionPane.DEFAULT_OPTION);
                JDialog dialog = receiptPane.createDialog("Receipt");
                dialog.setModal(false);
                dialog.setLocationRelativeTo(back);
                dialog.setVisible(true);
                
                try{
                    
                    String input = JOptionPane.showInputDialog(null,"Enter item number to remove:", "Item Remover",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    if (Integer.parseInt(input) <0){  
                        
                        JOptionPane.showMessageDialog(null, "Enter a valid item number!", "Error Message", JOptionPane.ERROR_MESSAGE);
                        dispose();
                    }else{  
                        currentOrder.removeItem(input);
                        dispose();
                        dialog.setVisible(false);
                    }
                    
                }catch(Exception e ){   
                    JOptionPane.showMessageDialog(null,"Please input a valid number","Error Message",JOptionPane.WARNING_MESSAGE);
                    dispose();
                    dialog.setVisible(false);
                }
                dispose();
                new viewMenu().setVisible(true);
            }
        }
    }//GEN-LAST:event_removeOrderActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if(evt.getSource()==back){  
            dispose();
            new main().setVisible(true);
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new viewMenu().setLocationRelativeTo(null);
                new viewMenu().setVisible(true);
            }
        });
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton checkout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton removeOrder;
    private javax.swing.JButton viewBurgers;
    private javax.swing.JButton viewChicken;
    private javax.swing.JButton viewCombo;
    private javax.swing.JButton viewDrinks;
    private javax.swing.JButton viewOrder;
    private javax.swing.JButton viewPasta;
    // End of variables declaration//GEN-END:variables
}
