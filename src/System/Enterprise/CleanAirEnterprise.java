/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;

import java.util.ArrayList;
import System.Role.Role;

/**
 *
 * @author Anish
 */
public class CleanAirEnterprise extends Enterprise {
    
    public CleanAirEnterprise(String name){
        super(name,Enterprise.EnterpriseType.CleanAirEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
