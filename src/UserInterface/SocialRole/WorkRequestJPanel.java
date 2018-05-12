/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SocialRole;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Network.Network;
import System.Organization.EarthJusticeOrganization;
import System.Organization.Organization;
import static System.Organization.Organization.Type.SocialOrganization;
import System.Organization.SmartCityOrganization;
import System.Organization.SocialOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.NonProfitableRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nilan
 */
public class WorkRequestJPanel extends javax.swing.JPanel {;
    
        private JPanel userProcessContainer;
        private UserAccount userAccount;
        private Enterprise enterprise;
        private Ecosystem system;

    /**
     * Creates new form WorkRequestJPanel
     */
    
        WorkRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Ecosystem system) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.userAccount = userAccount;
         this.enterprise = enterprise;
         this.system = system;
         
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Non-Proftable Work Request");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setText("Message");

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnBack.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 0, 0));
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequest.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(204, 0, 0));
        btnRequest.setText("Request >>");
        btnRequest.setBorder(new javax.swing.border.MatteBorder(null));
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(386, 386, 386))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(631, 631, 631)
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel2)
                        .addGap(386, 386, 386)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(192, 192, 192)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        String message = txtArea.getText();
        
        if(message.equals("") || message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        
        NonProfitableRequest nprequest = new NonProfitableRequest();
        nprequest.setMessage(message);
        nprequest.setSender(userAccount);
        nprequest.setStatus("Message Sent");
        
        Organization org = null;
        
        for(Network network : system.getNetworkList()){
            System.out.println("Work Request JPanel before Enterprise Loop");
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
        for(Organization organization : enterprise.getOrganizaionDirectory().getOrganizationList()){
            if(organization instanceof EarthJusticeOrganization){
                org = organization;
                break;
            }
        }
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(nprequest);
            userAccount.getWorkQueue().getWorkRequestList().add(nprequest);
        }
        JOptionPane.showMessageDialog(null, "Request message sent");
      }
       
        
        
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SocialOrgWorkAreaJPanel sowajp = (SocialOrgWorkAreaJPanel) component;
        sowajp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
