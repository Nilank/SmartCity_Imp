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
import System.UserAccount.UserAccount;
import System.Role.Role;
import UserInterface.AirPollutionMonitoringRole.MonitoringWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Anish
 */
public class AirPollutionMonitoringRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, Ecosystem system) {
        return new MonitoringWorkAreaJPanel(userProcessContainer, account, (AirPollutionMonitoringOrganization)organization, enterprise);
    }
    
}
