/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.Role;
import System.Role.SmartCityRole;
import java.util.ArrayList;

/**
 *
 * @author nilan
 */
public class SmartCityOrganization extends Organization{

    public SmartCityOrganization() {
        super(Organization.Type.SmartTransport.getValue());
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SmartCityRole());
        return roles;
    }
    
}
