/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.BankRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author srikantswamy
 */
public class BankOrganization extends Organization{

    public BankOrganization() {
        super(Organization.Type.Bank.getValue());
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BankRole());
        return roles;
    }
    
}
