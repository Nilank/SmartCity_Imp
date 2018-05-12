/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.AirPollutionMonitoringRole;
import java.util.ArrayList;
import System.Role.Role;

/**
 *
 * @author Anish
 */
public class AirPollutionMonitoringOrganization extends Organization {
    
    
    public AirPollutionMonitoringOrganization() {
        super(Organization.Type.AirPollutionMonitoring.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AirPollutionMonitoringRole());
        return roles;
    }
    
}
