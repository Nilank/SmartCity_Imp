/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import System.DB4OUtil.DB4OUtil;
import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Network.Network;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import Utilities.Validation;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anish
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    private Validation valid; 
    
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        ImageIcon image = new ImageIcon("image/smartcity.jpg");
        JLabel label = new JLabel("", image, JLabel.CENTER);
        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        userprocesscontainer.add(label);
        this.valid=new Validation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        userprocesscontainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setText("Username : ");

        txtUsername.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel2.setText("Password :");

        txtPassword.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(204, 0, 51));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(204, 0, 51));
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(467, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userprocesscontainer.setBackground(new java.awt.Color(204, 255, 255));
        userprocesscontainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userprocesscontainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        // Get user name
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        
         boolean rtnFnVal=true;
         
         rtnFnVal=valid.validOnlyUserName(userName);   //Add
       if (rtnFnVal == false) {
            JOptionPane.showMessageDialog(null, "Only aplhanum and _. allowed in username field");
        }
        
        if (rtnFnVal == true) {     //Add
        
            rtnFnVal=valid.validOnlyPassword(password);
         if (rtnFnVal == false) {
                JOptionPane.showMessageDialog(null, "Only aplhanum and !@#$%&*)(._- allowed in pwd field");

            }
        } 
        
        
        if (rtnFnVal == true) {   //Add

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization  = null;

        if (userAccount == null){

            for(Network network : system.getNetworkList()){

                for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){

                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                    if(userAccount == null){

                        for (Organization organization: enterprise.getOrganizaionDirectory().getOrganizationList()){

                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);

                            if(userAccount!=null){
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }

                    }else
                    {
                        inEnterprise = enterprise;
                        break;
                    }

                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        if(userAccount == null){
            JOptionPane.showMessageDialog(null, "Invalid credentals.");
            return;
        }else{
            CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
            userprocesscontainer.add("workarea",userAccount.getRole().createWorkArea(userprocesscontainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userprocesscontainer);
        }

        

        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        } 

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        btnLogout.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUsername.setText("");
        txtPassword.setText("");
        
        
        ImageIcon image = new ImageIcon("image/smartcity.jpg");
        JLabel label = new JLabel("", image, JLabel.CENTER);
        
        userprocesscontainer.removeAll();
        JPanel blankJP = new JPanel();
        userprocesscontainer.add("blank", blankJP);
        userprocesscontainer.add(label);
        CardLayout crdLyt = (CardLayout) userprocesscontainer.getLayout();
        crdLyt.next(userprocesscontainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel userprocesscontainer;
    // End of variables declaration//GEN-END:variables
}
