/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.FinanceOrganization;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import UserInterface.Finance.FinanceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srikantswamy
 */
public class FinanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new FinanceWorkAreaJPanel(userProcessContainer, account, (FinanceOrganization)organization, enterprise,system);}
    
    
    
}
