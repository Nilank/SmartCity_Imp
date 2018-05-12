/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.Organization.SocialOrganization;
import System.UserAccount.UserAccount;
import UserInterface.SocialRole.SocialOrgWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nilan
 */
public class SocialRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new SocialOrgWorkAreaJPanel(userProcessContainer, account, (SocialOrganization) organization, enterprise, system);
    }
    
}
