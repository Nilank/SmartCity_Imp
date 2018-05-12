/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Staff;

import java.util.ArrayList;

/**
 *
 * @author Anish
 */
public class StaffDirectory {
    
    private ArrayList<Staff> staffList;

    public StaffDirectory() {
        staffList = new ArrayList<>();
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }
    
    public Staff createstaff(String name){
        Staff staff = new Staff();
        staff.setName(name);
        staffList.add(staff);
        return staff;
    }
    
}
