/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.WorkQueue;

import System.UserAccount.UserAccount;
import java.io.File;
import java.util.Date;

/**
 *
 * @author Anish
 */
public class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;

    
    
    private String past;
    private String present;
    private String future;
    
    private File file;

    public String getPast() {
        return past;
    }

    public void setPast(String past) {
        this.past = past;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }
    
    

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString(){
        return message;
    }
    
}
