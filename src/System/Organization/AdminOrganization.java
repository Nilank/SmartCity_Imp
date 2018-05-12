/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.AdminRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anish
 */
public class AdminOrganization extends Organization {
    
    public AdminOrganization() {
        super(Organization.Type.Admin.getValue());
    }

   
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
