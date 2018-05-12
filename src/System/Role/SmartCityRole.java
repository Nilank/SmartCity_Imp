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
import System.Organization.SmartCityOrganization;
import System.UserAccount.UserAccount;
import UserInterface.AirPollutionMonitoringRole.MonitoringWorkAreaJPanel;
import UserInterface.SmartTrafficRole.SmartTrafficWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nilan
 */
public class SmartCityRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, Ecosystem system) {
        return new SmartTrafficWorkAreaJPanel(userProcessContainer, account, (SmartCityOrganization)organization, enterprise, system);
    }
}
