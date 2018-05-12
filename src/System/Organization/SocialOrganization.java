/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.AirPollutionMonitoringRole;
import System.Role.Role;
import System.Role.SocialRole;
import java.util.ArrayList;

/**
 *
 * @author nilan
 */
public class SocialOrganization extends Organization{

    public SocialOrganization() {
        super(Organization.Type.SocialOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SocialRole());
        return roles;
    }
    
}
