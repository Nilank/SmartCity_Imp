/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Enterprise.EnterpriseDirectory;
import System.Network.Network;
import System.Organization.Organization;
import System.Role.SystemAdminRole;
import java.util.ArrayList;
import System.Role.Role;

/**
 *
 * @author Anish
 */
public class Ecosystem extends Organization {
    
    private static Ecosystem system;
    private ArrayList <Network> networkList;

//    public EnterpriseDirectory getEnterpriseDirectory() {
//        return enterpriseDirectory;
//    }
//
//    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
//        this.enterpriseDirectory = enterpriseDirectory;
//    }
//    private EnterpriseDirectory enterpriseDirectory;
   
    public static Ecosystem getInstance(){
        if(system == null){
            System.out.println("sbc");
            system = new Ecosystem();
        }
        System.out.println("cv");
        return system;
    }
    
    private Ecosystem(){
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
}
