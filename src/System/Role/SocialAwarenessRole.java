/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.AirPollutionMonitoringOrganization;
import System.Organization.Organization;
import System.Organization.SocialAwarenessOrganization;
import System.UserAccount.UserAccount;
import System.Role.Role;
import UserInterface.SocialAwarenessRole.ReceiveAirIndexJPanel;
import UserInterface.SocialAwarenessRole.SocialAwarnessJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Anish
 */
public class SocialAwarenessRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, Ecosystem system) {
        return new SocialAwarnessJPanel(userProcessContainer, account, (SocialAwarenessOrganization)organization, system);
    }
    
}
