/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.WorkQueue;

/**
 *
 * @author Anish
 */
public class DFSRequest extends WorkRequest {
    
    private String testResult;
    
    private Boolean green;
    private Boolean yellow;
    private Boolean red;
   
    
    private String routeFrom;
    private String routeTo;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    

    public String getRouteFrom() {
        return routeFrom;
    }

    public void setRouteFrom(String routeFrom) {
        this.routeFrom = routeFrom;
    }

    public String getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(String routeTo) {
        this.routeTo = routeTo;
    }
    
    private String actionTaken;
    
    

    public DFSRequest(Boolean red) {
        this.red = true;
    }

    public DFSRequest() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public Boolean getGreen() {
        return green;
    }

    public void setGreen(Boolean green) {
        this.green = green;
    }

    public Boolean getYellow() {
        return yellow;
    }

    public void setYellow(Boolean yellow) {
        this.yellow = yellow;
    }

    public Boolean getRed() {
        return red;
    }

    public void setRed(Boolean red) {
        this.red = red;
    }

    

 

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }
    
}
