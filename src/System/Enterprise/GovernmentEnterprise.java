/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;

import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author srikantswamy
 */
public class GovernmentEnterprise extends Enterprise{

    public GovernmentEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.Government);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
