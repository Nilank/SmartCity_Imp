/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;



import java.util.ArrayList;

/**
 *
 * @author Anish
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    //create Enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.CleanAirEnterprise){
            enterprise = new CleanAirEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type == Enterprise.EnterpriseType.Transportation){
            enterprise = new TransportationEnterprise(name);
            enterpriseList.add(enterprise);
        } 
        
        
        else if(type == Enterprise.EnterpriseType.EarthJusticeNGO){
            enterprise = new EarthJusticeNGO(name);
            enterpriseList.add(enterprise);
        } 
        
        else if(type == Enterprise.EnterpriseType.MariettaIndustrialEnterprise){
            enterprise = new MariettaIndustrialEnterprise(name);
            enterpriseList.add(enterprise);
        } 
        
        else if(type == Enterprise.EnterpriseType.Government){
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        } 
        
        
        return enterprise;
    }
    
}
