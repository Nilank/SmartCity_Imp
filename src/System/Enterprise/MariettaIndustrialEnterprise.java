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
 * @author nilan
 */
public class MariettaIndustrialEnterprise extends Enterprise {

    public MariettaIndustrialEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.MariettaIndustrialEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
