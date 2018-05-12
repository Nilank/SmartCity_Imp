/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LegalRole;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.LegalOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.CleanEatRequest;
import System.WorkQueue.WorkRequest;
import UserInterface.WeCare.WeCareWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nilan
 */
public class LegalWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private LegalOrganization legalOrganization;
    private Enterprise enterprise;
    private Ecosystem system;
    

    /**
     * Creates new form LegalWorkAreaJPanel
     */
    public LegalWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, LegalOrganization legalOrganization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.legalOrganization =legalOrganization;
        this.enterprise = enterprise ;
        this.system = system;
        tblLawyer.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 36));
        populateTable();
    
    }

   
    
    public void populateTable(){
    
        DefaultTableModel model = (DefaultTableModel)tblLawyer.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : legalOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getStaff().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getStaff().getName();
            row[3] = request.getStatus();
            
            File fileobj=request.getFile();
            
            if(fileobj==null)
            {
                row[4]="No File Attached";
            }else if(fileobj!=null) 
            {
                row[4]=fileobj.getName();
            }
            
            // row[4] = request.getFile().getName();
            
            model.addRow(row);
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLawyer = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Lawyer Work Area");

        tblLawyer.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        tblLawyer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "File Name"
            }
        ));
        tblLawyer.setRowHeight(40);
        tblLawyer.setRowMargin(5);
        jScrollPane1.setViewportView(tblLawyer);

        btnProcess.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(204, 0, 0));
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.MatteBorder(null));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnAssign.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(204, 0, 0));
        btnAssign.setText("Assign");
        btnAssign.setBorder(new javax.swing.border.MatteBorder(null));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnOpenFile.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnOpenFile.setForeground(new java.awt.Color(204, 0, 0));
        btnOpenFile.setText("Open File");
        btnOpenFile.setBorder(new javax.swing.border.MatteBorder(null));
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(204, 0, 0));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1150, 1150, 1150)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(676, 676, 676)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(186, 186, 186)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblLawyer.getSelectedRow();
        
        if (selectedRow < 0) {
          return ;
        }
        
        WorkRequest request = (WorkRequest)tblLawyer.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTable();
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
     
        int selectedRow = tblLawyer.getSelectedRow();

        if (selectedRow >= 0) {
            
            CleanEatRequest request = (CleanEatRequest) tblLawyer.getValueAt(selectedRow, 0);

            request.setStatus("Processing");

            WorkRequestJPanel processWorkRequestJPanel = new WorkRequestJPanel(userProcessContainer, request, system);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblLawyer.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)tblLawyer.getValueAt(selectedRow, 0);
        
        UserAccount rcvr=request.getReceiver();
        
        if(rcvr!=null){
        
        File file=request.getFile();
        
        if(file!=null){
        
        try {
            java.awt.Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(WeCareWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please assign the request before opening the file");
        }
        
    }//GEN-LAST:event_btnOpenFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLawyer;
    // End of variables declaration//GEN-END:variables
}
