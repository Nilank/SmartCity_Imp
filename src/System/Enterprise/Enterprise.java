/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;

import System.Organization.Organization;
import System.Organization.OrganizationDirectory;

/**
 *
 * @author Anish
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizaionDirectory;

    public OrganizationDirectory getOrganizaionDirectory() {
        return organizaionDirectory;
    }
    
    public enum EnterpriseType{
        CleanAirEnterprise("Air Pollution Control"),
        Transportation("Transportation Enterprise"),
        EarthJusticeNGO("NGO"),
        MariettaIndustrialEnterprise("Industrial"),
        Government("Government");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return value;
        }
        
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
    
    public Enterprise (String name, EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizaionDirectory = new OrganizationDirectory();
    }
    
}
