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
public class EarthJusticeNGO extends Enterprise {

    public EarthJusticeNGO(String name) {
        super(name,Enterprise.EnterpriseType.EarthJusticeNGO);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;  //To change body of generated methods, choose Tools | Templates.
    }
    
}
