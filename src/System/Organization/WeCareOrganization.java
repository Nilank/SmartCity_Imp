/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.AirPollutionForecastRole;
import System.Role.Role;
import System.Role.WeCareRole;
import java.util.ArrayList;

/**
 *
 * @author srikantswamy
 */
public class WeCareOrganization extends Organization{

    public WeCareOrganization() {
        super(Organization.Type.WeCare.getValue());
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {

        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WeCareRole());
        return roles;
    }
    
}
