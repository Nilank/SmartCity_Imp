/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.VehicalEmissionManagementRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nilan
 */
public class VehicleEmissionManagementOrganization extends Organization {
    
    public VehicleEmissionManagementOrganization() {
        super(Organization.Type.VehicleEmmissionManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VehicalEmissionManagementRole());
        return roles;
    }
    
}
