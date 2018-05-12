/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.LegalOrganization;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import UserInterface.LegalRole.LegalWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nilan
 */
public class LegalRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new LegalWorkAreaJPanel(userProcessContainer, account, (LegalOrganization) organization, enterprise, system); //To change body of generated methods, choose Tools | Templates.
    }
    
}
