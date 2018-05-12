/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.AirPollutionForecastOrganization;
import System.Organization.Organization;
import System.Organization.WeCareOrganization;
import System.UserAccount.UserAccount;
import UserInterface.AirPollutionForecast.ForecastWorkAreaJPanel;
import UserInterface.WeCare.WeCareWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srikantswamy
 */
public class WeCareRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
            return new WeCareWorkAreaJPanel(userProcessContainer, account, (WeCareOrganization)organization, enterprise);
    }
    
}
