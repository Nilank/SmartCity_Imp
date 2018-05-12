/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import UserInterface.AirPollutionForecast.ForecastWorkAreaJPanel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srikantswamy
 */
public class FileWrite {

    public FileWrite() {
    }
    
    public static File Writer(String locn, String data) throws IOException{
    
            File file=null;
        
            BufferedWriter writer = null;
            writer = new BufferedWriter(new FileWriter(locn));
            writer.write(data);
            writer.close();
        
            file=new File(locn);
            
            return file;
    }
    
}
