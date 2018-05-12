/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.AutomobileDriverOrganization;
import System.Organization.Organization;
import System.Organization.VehicleEmissionManagementOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.DFSRequest;
import UserInterface.AutomobileDriverRole.DriverWorkAreaJPanel;
import UserInterface.VehicalEmissionManagementRole.VEMWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nilan
 */
public class AutomobileDriverRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
         return new DriverWorkAreaJPanel(userProcessContainer, account, (AutomobileDriverOrganization)organization, enterprise, system); 
    }
    
}
