/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.PeopleRole;
import System.Role.Role;
import System.Role.SocialAwarenessRole;
import java.util.ArrayList;

/**
 *
 * @author Anish
 */
public class PeopleOrganization extends Organization {
    
    public PeopleOrganization() {
        super(Organization.Type.People.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PeopleRole());
        return roles;
    }
    
}
