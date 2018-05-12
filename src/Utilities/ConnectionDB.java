/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author srikantswamy
 */
public class ConnectionDB {
    
    public static Connection ConnectDB() throws ClassNotFoundException, SQLException{
        
    try{  
        
        Class.forName("com.mysql.jdbc.Driver");  
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/AED","root","anish1992");  
        return conn;
    
       }catch(Exception e){}
        
       return null;
    
    }
    
}
