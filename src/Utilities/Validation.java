/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author srikantswamy
 */
public class Validation {
    
    
    private Pattern patternOnlyStr;
    private Pattern patterAlphaNum;
    
     
    private Pattern patternYearOnly;
            
    private Pattern patternNbrOnly;
    
    private Pattern patternAlphaNumSpace;
    
    private Pattern patternOnlyPassword;
    
    private Pattern patternOnlyUserName;

    public Validation (){
        
    this.patternOnlyStr=Pattern.compile("[a-zA-Z ]*$");
    this.patterAlphaNum=Pattern.compile("[a-zA-Z0-9]*$");
    this.patternYearOnly=Pattern.compile("^(19|20)[0-9][0-9]");
    this.patternNbrOnly=Pattern.compile("[0-9]*$");
    this.patternAlphaNumSpace=Pattern.compile("[a-zA-Z0-9 ]*$");
    this.patternOnlyPassword=Pattern.compile("[a-zA-Z0-9!@#\\$%\\&*\\)\\(._-]*$");
    this.patternOnlyUserName=Pattern.compile("[a-zA-Z0-9_.]*$");
    }
    
    public boolean validOnlyAlphaNumSpace(String userName){
         
        Matcher abc = patternAlphaNumSpace.matcher(userName);
        if(abc.matches()){
            return true;  // Return true if it matches
        }
        return false;     // Return false if does not match
    }
    
    public boolean validOnlyUserName(String userName){
         
        Matcher abc = patternOnlyUserName.matcher(userName);
        if(abc.matches()){
            return true;  // Return true if it matches
        }
        return false;     // Return false if does not match
    }
    
    
    public boolean validOnlyPassword(String userName){
         
        Matcher abc = patternOnlyPassword.matcher(userName);
        if(abc.matches()){
            return true;  // Return true if it matches
        }
        return false;     // Return false if does not match
    }
    
    
    public boolean validOnlyStr(String userName){
         
        Matcher abc = patternOnlyStr.matcher(userName);
        if(abc.matches()){
            return true;  // Return true if it matches
        }
        return false;     // Return false if does not match
    }
    
    public boolean validOnlyNbr(String userName){
         
        Matcher abc = patternNbrOnly.matcher(userName);
        if(abc.matches()){
            return true;  // Return true if it matches
        }
        return false;     // Return false if does not match
    }
    
    public boolean validAlphaNum(String userName){
         
        Matcher abc = patterAlphaNum.matcher(userName);
        if(abc.matches()){
            return true;  // Return true if it matches
        }
        return false;     // Return false if does not match
    }

    public Pattern getPatternOnlyStr() {
        return patternOnlyStr;
    }

    public void setPatternOnlyStr(Pattern patternOnlyStr) {
        this.patternOnlyStr = patternOnlyStr;
    }

    public Pattern getPatterAlphaNum() {
        return patterAlphaNum;
    }

    public void setPatterAlphaNum(Pattern patterAlphaNum) {
        this.patterAlphaNum = patterAlphaNum;
    }

    public Pattern getPatternYearOnly() {
        return patternYearOnly;
    }

    public void setPatternYearOnly(Pattern patternYearOnly) {
        this.patternYearOnly = patternYearOnly;
    }

    public Pattern getPatternNbrOnly() {
        return patternNbrOnly;
    }

    public void setPatternNbrOnly(Pattern patternNbrOnly) {
        this.patternNbrOnly = patternNbrOnly;
    }

    public Pattern getPatternAlphaNumSpace() {
        return patternAlphaNumSpace;
    }

    public void setPatternAlphaNumSpace(Pattern patternAlphaNumSpace) {
        this.patternAlphaNumSpace = patternAlphaNumSpace;
    }

    public Pattern getPatternOnlyPassword() {
        return patternOnlyPassword;
    }

    public void setPatternOnlyPassword(Pattern patternOnlyPassword) {
        this.patternOnlyPassword = patternOnlyPassword;
    }

    public Pattern getPatternOnlyUserName() {
        return patternOnlyUserName;
    }

    public void setPatternOnlyUserName(Pattern patternOnlyUserName) {
        this.patternOnlyUserName = patternOnlyUserName;
    }
    
    
    
}
