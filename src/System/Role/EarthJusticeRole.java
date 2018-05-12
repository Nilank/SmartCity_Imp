/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.AutomobileDriverOrganization;
import System.Organization.EarthJusticeOrganization;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import UserInterface.AutomobileDriverRole.DriverWorkAreaJPanel;
import UserInterface.EarthJusticeRole.EJWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nilan
 */
public class EarthJusticeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new EJWorkAreaJPanel(userProcessContainer, account, (EarthJusticeOrganization)organization, enterprise, system);//To change body of generated methods, choose Tools | Templates.
    }
    
}
