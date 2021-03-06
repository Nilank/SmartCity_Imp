/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bank;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.BankOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.FinanceRequest;
import System.WorkQueue.PollutionForecastRequest;
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
 * @author srikantswamy
 */
public class BankWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BankWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private BankOrganization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    
    public BankWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, BankOrganization organization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        tblBank.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 36));
        
        populateBankTable();
    }
    
    
    
    public void populateBankTable(){
    
    DefaultTableModel model = (DefaultTableModel)tblBank.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
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
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBank = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Bank Work Area");

        tblBank.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        tblBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Reciever", "Result", "File"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBank.setRowHeight(40);
        tblBank.setRowMargin(5);
        jScrollPane1.setViewportView(tblBank);
        if (tblBank.getColumnModel().getColumnCount() > 0) {
            tblBank.getColumnModel().getColumn(0).setResizable(false);
            tblBank.getColumnModel().getColumn(1).setResizable(false);
            tblBank.getColumnModel().getColumn(2).setResizable(false);
            tblBank.getColumnModel().getColumn(3).setResizable(false);
            tblBank.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("Refresh");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnOpenFile.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnOpenFile.setForeground(new java.awt.Color(204, 0, 51));
        btnOpenFile.setText("Open File");
        btnOpenFile.setBorder(new javax.swing.border.MatteBorder(null));
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnAssign.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(204, 0, 51));
        btnAssign.setText("Assign");
        btnAssign.setBorder(new javax.swing.border.MatteBorder(null));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(204, 0, 51));
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.MatteBorder(null));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)
                                .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1472, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 592, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populateBankTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblBank.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)tblBank.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateBankTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblBank.getSelectedRow();

        if (selectedRow >= 0) {
            FinanceRequest request = (FinanceRequest) tblBank.getValueAt(selectedRow, 0);

            request.setStatus("Processing");

            ProcessBankRequestJPanel processBankRequestJPanel = new ProcessBankRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processBankRequestJPanel", processBankRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblBank.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)tblBank.getValueAt(selectedRow, 0);
        
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBank;
    // End of variables declaration//GEN-END:variables
}
