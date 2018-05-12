/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.UserAccount;

import System.Staff.Staff;
import java.util.ArrayList;
import System.Role.Role;

/**
 *
 * @author Anish
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Staff staff, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setStaff(staff);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
}
