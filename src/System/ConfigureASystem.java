/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Role.SystemAdminRole;
import System.Staff.Staff;
import System.Role.Role;
import System.UserAccount.UserAccount;
import System.Role.AdminRole;

/**
 *
 * @author Anish
 */
public class ConfigureASystem {
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        Staff staff = system.getStaffDirectory().createstaff("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", staff, new SystemAdminRole());
        
        
        return system;
    }
}
