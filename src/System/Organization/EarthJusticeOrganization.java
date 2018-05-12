/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.AirPollutionMonitoringRole;
import System.Role.EarthJusticeRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nilan
 */
public class EarthJusticeOrganization extends Organization{

    public EarthJusticeOrganization() {
        super(Organization.Type.EarthJustice.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EarthJusticeRole());
        return roles;
    }
    
}
