/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.IndustrialEmissionManagementRole;
import System.Role.PeopleRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nilan
 */
public class IndustrialEmissionManagementOrganization extends Organization {

    public IndustrialEmissionManagementOrganization() {
        super(Organization.Type.IndustrialEmissionManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new IndustrialEmissionManagementRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
