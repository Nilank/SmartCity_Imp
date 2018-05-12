/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LegalRole;

import System.Ecosystem;
import System.WorkQueue.CleanEatRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nilan
 */
public class WorkRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private CleanEatRequest request;
    private Ecosystem system;
    

    /**
     * Creates new form WorkAreaJPanel
     */
   
    WorkRequestJPanel(JPanel userProcessContainer, CleanEatRequest request, Ecosystem system) {
       initComponents(); 
       this.userProcessContainer = userProcessContainer;
       this.request = request;
       this.system = system;
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        lblResult.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblResult.setText("Response: ");

        txtResult.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(204, 0, 0));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.MatteBorder(null));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 0, 0));
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblResult)
                        .addGap(59, 59, 59)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(lblResult))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LegalWorkAreaJPanel lwajp = (LegalWorkAreaJPanel) component;
        lwajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        request.setTestResult(txtResult.getText());
        if(txtResult.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Request message sent");
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
