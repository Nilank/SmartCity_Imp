/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VehicalEmissionManagementRole;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.VehicleEmissionManagementOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.DFSRequest;
import System.WorkQueue.WorkRequest;
import UserInterface.SmartTrafficRole.TrafficWorkRequestJPanel;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nilan
 */
public class VEMWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private VehicleEmissionManagementOrganization vemOrganization;
    private Ecosystem system;
    
    

    /**
     * Creates new form EMWorkAreaJPanel
     */
    
    public VEMWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, VehicleEmissionManagementOrganization vehicleEmissionManagementOrganization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.vemOrganization = vemOrganization;
        this.enterprise = enterprise;
       
        this.system = system;
        dfsTable.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 36));
        
        // valueLabel.setText(enterprise.getName());
        populateRequestTable();
        
    }
    
     public void populateRequestTable(){
         DefaultTableModel model = (DefaultTableModel) dfsTable.getModel();
         model.setRowCount(0);
         System.out.println("Before for loop");
         for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
             Object[] row = new Object[4];
             row[0] = request.getMessage();
             row[1] = request.getReceiver();
             row[2] = request.getStatus();
             String actionTaken = ((DFSRequest) request).getTestResult();
             row[3] = actionTaken == null ? "Waiting" : actionTaken;
             model.addRow(row);
         }
     }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        dfsTable = new javax.swing.JTable();
        btnTrafficMap = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Vehicle Emission Managment Work Area ");

        btnBack.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 0, 51));
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

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

        dfsTable.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        dfsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alert", "Receiver", "Status", "Action Taken"
            }
        ));
        dfsTable.setRowHeight(40);
        dfsTable.setRowMargin(5);
        jScrollPane4.setViewportView(dfsTable);

        btnTrafficMap.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnTrafficMap.setForeground(new java.awt.Color(204, 0, 0));
        btnTrafficMap.setText("View Traffic Map >>");
        btnTrafficMap.setBorder(new javax.swing.border.MatteBorder(null));
        btnTrafficMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrafficMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(362, 362, 362)
                            .addComponent(btnTrafficMap, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1551, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(478, 478, 478))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(110, 110, 110)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnTrafficMap, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("DFSWorkRequestJPanel", new DFSWorkRequestJPanel(userProcessContainer, userAccount, enterprise, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnTrafficMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrafficMapActionPerformed
        // TODO add your handling code here:
         final Browser browser = new Browser();
       BrowserView browserView = new BrowserView(browser);

       JFrame frame = new JFrame("transitlayer.html");
       frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);

       browser.loadURL("http://localhost:63342/TRANSITAPI/transitlayer.html?_ijt=66f6n0m2jee4femumgcrul6al6");
    }//GEN-LAST:event_btnTrafficMapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnTrafficMap;
    private javax.swing.JTable dfsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
