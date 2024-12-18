/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.finalproj.app;
import com.mycompany.oop_finalproj.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class chickenMenu extends javax.swing.JFrame {
    static Order currentOrder = new Order();
    MenuItem item;
    String[] chicken ={"Fried Chicken","Barbeque Chicken","Chicken Parmesan","Chicken Alfredo","Braised Chicken"};
    double[] chickenPrice = {80.00,105.00,120.00,120.00,210.00};
    /**
     * Creates new form chickenMenu
     */
    public chickenMenu() {
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

        jPanel2 = new javax.swing.JPanel();
        friedChicken = new javax.swing.JButton();
        braisedChicken = new javax.swing.JButton();
        bbq = new javax.swing.JButton();
        chickParm = new javax.swing.JButton();
        chickFred = new javax.swing.JButton();
        backtoMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chicken Menu");

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

        friedChicken.setText("Fried Chicken (₱80.00)");
        friedChicken.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                friedChickenStateChanged(evt);
            }
        });
        friedChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friedChickenActionPerformed(evt);
            }
        });

        braisedChicken.setText("Braised Chicken (₱210.00)");
        braisedChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                braisedChickenActionPerformed(evt);
            }
        });

        bbq.setText("Barbeque Chicken (₱105.00)");
        bbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbqActionPerformed(evt);
            }
        });

        chickParm.setText("Chicken Parmesan (₱120.00)");
        chickParm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickParmActionPerformed(evt);
            }
        });

        chickFred.setText("Chicken Alfredo(₱120.00)");
        chickFred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickFredActionPerformed(evt);
            }
        });

        backtoMenu.setText("BACK");
        backtoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chickFred, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chickParm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(friedChicken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bbq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(braisedChicken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backtoMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(friedChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bbq, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chickParm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chickFred, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(braisedChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backtoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void friedChickenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_friedChickenStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_friedChickenStateChanged

    private void friedChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friedChickenActionPerformed
        if(evt.getSource()==friedChicken){
            item = new MenuItem(chicken[0],chickenPrice[0]);
            currentOrder.addItem(item);
            JOptionPane.showMessageDialog(null,"Added Fried Chicken to Orders!!","Order Confirmation",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new viewMenu().setVisible(true);
        }
    }//GEN-LAST:event_friedChickenActionPerformed

    private void braisedChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_braisedChickenActionPerformed
        if(evt.getSource()==braisedChicken){
            item = new MenuItem(chicken[4],chickenPrice[4]);
            currentOrder.addItem(item);
            JOptionPane.showMessageDialog(null,"Added Braised Chicken to Orders!","Order Confirmation",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new viewMenu().setVisible(true);
        }
    }//GEN-LAST:event_braisedChickenActionPerformed

    private void bbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbqActionPerformed
        if(evt.getSource()==bbq){
            item = new MenuItem(chicken[1],chickenPrice[1]);
            currentOrder.addItem(item);
            JOptionPane.showMessageDialog(null,"Added Barbeque Chicken to Orders!","Order Confirmation",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new viewMenu().setVisible(true);
        }
    }//GEN-LAST:event_bbqActionPerformed

    private void chickParmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickParmActionPerformed
        if(evt.getSource()==chickParm){
            item = new MenuItem(chicken[2],chickenPrice[2]);
            currentOrder.addItem(item);
            JOptionPane.showMessageDialog(null,"Added Chicken Parmesan to Orders!","Order Confirmation",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new viewMenu().setVisible(true);
        }
    }//GEN-LAST:event_chickParmActionPerformed

    private void chickFredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickFredActionPerformed
        if(evt.getSource()==chickFred){
            item = new MenuItem(chicken[3],chickenPrice[3]);
            currentOrder.addItem(item);
            JOptionPane.showMessageDialog(null,"Added Chicken Alfredo to Orders!","Order Confirmation",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new viewMenu().setVisible(true);
        }
    }//GEN-LAST:event_chickFredActionPerformed

    private void backtoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoMenuActionPerformed
        if (evt.getSource()==backtoMenu){
            dispose();
           new viewMenu().setVisible(true);
        }
    }//GEN-LAST:event_backtoMenuActionPerformed

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
            java.util.logging.Logger.getLogger(chickenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chickenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chickenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chickenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chickenMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtoMenu;
    private javax.swing.JButton bbq;
    private javax.swing.JButton braisedChicken;
    private javax.swing.JButton chickFred;
    private javax.swing.JButton chickParm;
    private javax.swing.JButton friedChicken;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
