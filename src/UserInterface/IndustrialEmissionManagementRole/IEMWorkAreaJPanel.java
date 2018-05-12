/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.IndustrialEmissionManagementRole;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.IndustrialEmissionManagementOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.CleanEatRequest;
import System.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.io.File;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nilan
 */
public class IEMWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private IndustrialEmissionManagementOrganization industrialEmissionManagementOrganization;
    private Enterprise enterprise;
    private File file;
    private Ecosystem system;
    
    

    /**
     * Creates new form IEMWorkAreaJPanel
     */
    public IEMWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, IndustrialEmissionManagementOrganization industrialEmissionManagementOrganization, Enterprise enterprise, Ecosystem system) {

        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.industrialEmissionManagementOrganization = industrialEmissionManagementOrganization;
        this.enterprise = enterprise;
        this.system = system;
        tblIEM.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 36));
       
        populateTable();
        
    }

   
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblIEM.getModel();
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((CleanEatRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            
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
        tblIEM = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Industrial Emission Management Work Area");

        tblIEM.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        tblIEM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "File Name"
            }
        ));
        tblIEM.setRowHeight(40);
        tblIEM.setRowMargin(5);
        jScrollPane1.setViewportView(tblIEM);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(99, 99, 99)))
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(185, 185, 185)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WorkRequestJPanel", new IEMWorkRequestJPanel(userProcessContainer, account, enterprise,file, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIEM;
    // End of variables declaration//GEN-END:variables
}
