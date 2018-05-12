/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Staff.StaffDirectory;
import System.UserAccount.UserAccountDirectory;
import System.WorkQueue.WorkQueue;
import java.util.ArrayList;
import System.Role.Role;

/**
 *
 * @author Anish
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private StaffDirectory staffDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization") {
        }, 
        AirPollutionMonitoring("Air Pollution Monitoring"){
        },
        SocialAwareness("Campaign Organization"){
        },
        People("People"){
        },
        SmartTransport("Smart Transport"){
        },
        VehicleEmmissionManagement("Vehicle Emmission Management"){
        },
        AutomobileDriver("Automobile Driver"){
        },
        EarthJustice("EarthJustice"){
        },
        SocialOrganization("Social Organization"),
        
        LegalOrganization ("Legal Organization"),
        
        IndustrialEmissionManagement("Industrial Emission Management"),
        AirPollutionForecast("Air Pollution Forecast Organization"){},
        WeCare("WeCare Organization"),
        Finance("Finance Organization"),
        Bank("Citizen Bank");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        staffDirectory = new StaffDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public StaffDirectory getStaffDirectory() {
        return staffDirectory;
    }

    
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
