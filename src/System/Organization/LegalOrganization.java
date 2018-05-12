/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.LegalRole;
import System.Role.PeopleRole;
import System.Role.Role;
import static System.Role.Role.RoleType.LegalRole;
import java.util.ArrayList;

/**
 *
 * @author nilan
 */
public class LegalOrganization extends Organization{

    public LegalOrganization() {
        super(Organization.Type.LegalOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LegalRole());
        return roles; 
    }
    
}
