/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anish
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        AirPollutionMonitoring("Air Pollution Monitoring"),
        SocialWorker("Social Worker"),
        SystemAdmin ("System Admin"),
        People("People"),
        AutomobileDriver("Automobile Driver"),
        EarthJustice("EarthJusticeRole"),
        SocialOrganization("Social Organization"),
        LegalRole("Legal Role"),
        IndustrialEmissionManagementRole("Industrial Emission Management Role"),
        ForecastAdmin ("Forecast Admin"),
        WeCareAdmin ("WeCare Admin"),
        FinanceAdmin("Finance Admin"),
        BankAdmin("Bank Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, Ecosystem system);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
