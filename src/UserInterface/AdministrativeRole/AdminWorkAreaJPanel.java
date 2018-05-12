/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import System.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Anish
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        valueLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        valueLabel.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setText("Adminstrative Work Area");

        userJButton.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        userJButton.setForeground(new java.awt.Color(204, 0, 51));
        userJButton.setText("Manage User");
        userJButton.setBorder(new javax.swing.border.MatteBorder(null));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });

        manageEmployeeJButton.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(204, 0, 51));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(new javax.swing.border.MatteBorder(null));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(204, 0, 51));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setBorder(new javax.swing.border.MatteBorder(null));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(747, 747, 747)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(705, 705, 705)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(269, 706, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(618, 618, 618))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(140, 140, 140)
                .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(userJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizaionDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizaionDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
