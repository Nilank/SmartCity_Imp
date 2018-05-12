/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.AirPollutionForecastRole;
import System.Role.FinanceRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author srikantswamy
 */
public class FinanceOrganization extends Organization{

    public FinanceOrganization() {
        super(Organization.Type.Finance.getValue());
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinanceRole());
        return roles;
        
    }
    
}
