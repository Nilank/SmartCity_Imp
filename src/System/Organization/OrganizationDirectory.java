/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;


import static System.Organization.Organization.Type.IndustrialEmissionManagement;
import java.util.ArrayList;

/**
 *
 * @author Anish
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.AirPollutionMonitoring.getValue())){
            organization = new AirPollutionMonitoringOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.SocialAwareness.getValue())){
            organization = new SocialAwarenessOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.People.getValue())){
            organization = new PeopleOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.SmartTransport.getValue())){
            organization = new SmartCityOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.VehicleEmmissionManagement.getValue())){
            organization = new VehicleEmissionManagementOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.VehicleEmmissionManagement.getValue())){
            organization = new AutomobileDriverOrganization() ;
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.EarthJustice.getValue())){
            organization = new EarthJusticeOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.SocialOrganization.getValue())){
            organization = new SocialOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.IndustrialEmissionManagement.getValue())){
            organization = new IndustrialEmissionManagementOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.LegalOrganization.getValue())){
            organization = new LegalOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.AirPollutionForecast.getValue())){
            organization = new AirPollutionForecastOrganization();
            organizationList.add(organization);
        }  
        
        else if (type.getValue().equals(Organization.Type.WeCare.getValue())){
            organization = new WeCareOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.Bank.getValue())){
            organization = new BankOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.AutomobileDriver.getValue())){
            organization = new AutomobileDriverOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }

    
}
