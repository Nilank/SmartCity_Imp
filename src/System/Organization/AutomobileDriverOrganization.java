/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.AutomobileDriverRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nilan
 */
public class AutomobileDriverOrganization extends Organization {

    public AutomobileDriverOrganization() {
        super(Organization.Type.AutomobileDriver.getValue());
    }

   

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AutomobileDriverRole());
        return roles; 
    }
    
}
