/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EarthJusticeRole;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.EarthJusticeOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.NonProfitableRequest;
import System.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nilan
 */
public class EJWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EarthJusticeOrganization earthJusticeOrganization;
    private NonProfitableRequest request;
    private Ecosystem system;
    

    /**
     * Creates new form EJWorkAreaJPanel
     */
    public EJWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,EarthJusticeOrganization earthJusticeOrganization, Enterprise enterprise, Ecosystem system ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.earthJusticeOrganization = earthJusticeOrganization;
        this.enterprise = enterprise;
        this.system = system;
        populateTable();
        tblProcess.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 36));
    }

   

    public void populateTable(){
    
    DefaultTableModel model = (DefaultTableModel)tblProcess.getModel();
        model.setRowCount(0);
        for(WorkRequest request : earthJusticeOrganization.getWorkQueue().getWorkRequestList()){
        Object[] row = new Object[4];
        row[0] = request;
        row[1] = request.getSender().getStaff().getName();
        row[2] = request.getReceiver() == null ? null : request.getReceiver().getStaff().getName();
        row[3] = request.getStatus();
        model.addRow(row);
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcess = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        tblProcess.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        tblProcess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ));
        tblProcess.setRowHeight(40);
        tblProcess.setRowMargin(5);
        jScrollPane1.setViewportView(tblProcess);

        btnRefresh.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(204, 0, 0));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.MatteBorder(null));

        btnAssign.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(204, 0, 0));
        btnAssign.setText("Assign");
        btnAssign.setBorder(new javax.swing.border.MatteBorder(null));
        btnAssign.setRequestFocusEnabled(false);
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(204, 0, 0));
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.MatteBorder(null));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("NGO Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(357, 357, 357))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))))
            .addGroup(layout.createSequentialGroup()
                .addGap(706, 706, 706)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblProcess.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)tblProcess.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTable();
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProcess.getSelectedRow();
        if (selectedRow >= 0){
         NonProfitableRequest request = (NonProfitableRequest) tblProcess.getValueAt(selectedRow, 0);
         request.setStatus("Processing");
         WorkRequestJPanel processWorkRequestJPanel = new WorkRequestJPanel(userProcessContainer, request, account, enterprise, system); 
         userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer);
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
         
        }        
    
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProcess;
    // End of variables declaration//GEN-END:variables
}
