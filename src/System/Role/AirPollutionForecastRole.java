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
import UserInterface.AirPollutionForecast.ForecastWorkAreaJPanel;
import javax.swing.JPanel;
import System.Organization.AirPollutionForecastOrganization;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srikantswamy
 */
public class AirPollutionForecastRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        try {
            return new ForecastWorkAreaJPanel(userProcessContainer, account, (AirPollutionForecastOrganization)organization, enterprise,system);
        } catch (IOException ex) {
            Logger.getLogger(AirPollutionForecastRole.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}
    
}
    
