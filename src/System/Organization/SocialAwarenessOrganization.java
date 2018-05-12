/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.Role;
import System.Role.SocialAwarenessRole;
import java.util.ArrayList;

/**
 *
 * @author Anish
 */
public class SocialAwarenessOrganization extends Organization {
    
    public SocialAwarenessOrganization() {
        super(Organization.Type.SocialAwareness.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SocialAwarenessRole());
        return roles;
    }
    
}
