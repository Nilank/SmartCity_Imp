/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import java.util.List;
import javax.management.ObjectName;
import System.Role.Role;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Anish
 */
public class AdminRole extends Role {

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, Ecosystem system) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
}
