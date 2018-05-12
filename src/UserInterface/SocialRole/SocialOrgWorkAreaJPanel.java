/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SocialRole;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import static System.Organization.Organization.Type.SocialOrganization;
import System.Organization.SocialOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.DFSRequest;
import System.WorkQueue.NonProfitableRequest;
import System.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nilan
 */
public class SocialOrgWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private SocialOrganization socialOrganization;
    private Ecosystem system;
    /**
     * Creates new form SocialOrgWorkAreaJPanel
     */
    public SocialOrgWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,SocialOrganization socialOrganization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.socialOrganization = socialOrganization;
        this.enterprise = enterprise;
        this.system = system;
        // valueLabel.setText(enterprise.getName());
        tblSocial.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 36));
        populateRequestTable();
        
    }

    
    
    public void populateRequestTable(){
         DefaultTableModel model = (DefaultTableModel) tblSocial.getModel();
         model.setRowCount(0);
         for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
             Object[] row = new Object[4];
             row[0] = request.getMessage();
             row[1] = request.getReceiver();
             row[2] = request.getStatus();
             String action = ((NonProfitableRequest) request).getAction();
             row[3] = action == null ? "Request sent to run campaign regarding Air Pollution" : action;
             model.addRow(row);
         }
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSocial = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        tblSocial.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        tblSocial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Action"
            }
        ));
        tblSocial.setRowHeight(40);
        tblSocial.setRowMargin(5);
        jScrollPane1.setViewportView(tblSocial);

        btnRefresh.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(204, 0, 0));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.MatteBorder(null));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Social Organization Work Area");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(jLabel1)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WorkRequestJPanel", new WorkRequestJPanel(userProcessContainer, userAccount, enterprise, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSocial;
    // End of variables declaration//GEN-END:variables
}
