/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AirPollutionForecast;

import System.Ecosystem;
import System.Enterprise.Enterprise;
import System.Organization.AirPollutionForecastOrganization;
import System.UserAccount.UserAccount;
import System.WorkQueue.PollutionForecastRequest;
import System.WorkQueue.WorkRequest;
import Utilities.ConnectionDB;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;



/**
 *
 * @author srikantswamy
 */
public class ForecastWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ForecastWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private AirPollutionForecastOrganization airPollutionForecastOrganization;
    private Enterprise enterprise;
    
    private File file;
    private Ecosystem system;
    
    private String past;      //Add
    private String future;      //Add
    private String present;
    
    private ArrayList<String> aqi;
    private ArrayList<String> city;
    
    public ForecastWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AirPollutionForecastOrganization airPollutionForecastOrganization, Enterprise enterprise,Ecosystem system) throws IOException {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.airPollutionForecastOrganization=airPollutionForecastOrganization;
        this.enterprise=enterprise;
        this.system=system;
        
        this.aqi = new ArrayList<>();
        this.city = new ArrayList<>();
        
        tblRequstAQI.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 36));
        getJson();
        
        populateReportAQITable();
        
    }

    
    public void getJson() throws MalformedURLException, IOException {
        URL url = new URL("https://api.waqi.info/search/?token=ee98560dc4b599f0d9705ebf12716c3fb073452d&keyword=boston");
 try (InputStream is = url.openStream();
         
          
         
       JsonReader rdr = Json.createReader(is)) {
 
      JsonObject obj = rdr.readObject();
      JsonArray results = obj.getJsonArray("data");
      for (JsonObject result : results.getValuesAs(JsonObject.class)) {
          if (!result.getString("aqi").equals("-")) {
            aqi.add(result.getString("aqi"));
          }
          System.out.print(aqi);
          //System.out.print(": ");
          city.add(result.getJsonObject("station").getString("name"));
         System.out.println(city);;
         //System.out.println("-----------");
     }
 }
    }
    
    public void populateReportAQITable(){
    
         DefaultTableModel model = (DefaultTableModel) tblRequstAQI.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[8];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((PollutionForecastRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            
            File fileobj=request.getFile();
            
            if(fileobj==null)
            {
                row[4]="No File Attached";
            }else if(fileobj!=null) 
            {
                row[4]=fileobj.getName();
            }
            row[5]=request.getPast();
            row[6]=request.getPresent();
            row[7]=request.getFuture();
            model.addRow(row);
        }
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        btnView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnReportAQI = new javax.swing.JButton();
        Tomorrow_AQI = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFldTommAQI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequstAQI = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnViewpresetn = new javax.swing.JButton();
        txtPresent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setText("Air Pollution Forecast");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel2.setText("City:");

        comboCity.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        comboCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boston" }));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnView.setForeground(new java.awt.Color(204, 0, 51));
        btnView.setText("View Past AQI Trend");
        btnView.setBorder(new javax.swing.border.MatteBorder(null));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel3.setText("Past Air Pollution Trends");

        btnReportAQI.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnReportAQI.setForeground(new java.awt.Color(204, 0, 51));
        btnReportAQI.setText("Request");
        btnReportAQI.setBorder(new javax.swing.border.MatteBorder(null));
        btnReportAQI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportAQIActionPerformed(evt);
            }
        });

        Tomorrow_AQI.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        Tomorrow_AQI.setText("Tomorrow's AQI:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel8.setText("Future Air Pollution Trends");

        txtFldTommAQI.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        txtFldTommAQI.setEnabled(false);
        txtFldTommAQI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldTommAQIActionPerformed(evt);
            }
        });

        tblRequstAQI.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        tblRequstAQI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Reciever", "Status", "Result", "File Name", "Past AQI", "Present AQI", "Future AQI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequstAQI.setRowHeight(40);
        tblRequstAQI.setRowMargin(5);
        jScrollPane1.setViewportView(tblRequstAQI);
        if (tblRequstAQI.getColumnModel().getColumnCount() > 0) {
            tblRequstAQI.getColumnModel().getColumn(0).setResizable(false);
            tblRequstAQI.getColumnModel().getColumn(1).setResizable(false);
            tblRequstAQI.getColumnModel().getColumn(2).setResizable(false);
            tblRequstAQI.getColumnModel().getColumn(3).setResizable(false);
            tblRequstAQI.getColumnModel().getColumn(4).setResizable(false);
            tblRequstAQI.getColumnModel().getColumn(5).setResizable(false);
            tblRequstAQI.getColumnModel().getColumn(6).setResizable(false);
            tblRequstAQI.getColumnModel().getColumn(7).setResizable(false);
        }

        btnRefresh.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(204, 0, 51));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.MatteBorder(null));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel4.setText("Present Air Pollution Trends");

        btnViewpresetn.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        btnViewpresetn.setForeground(new java.awt.Color(204, 0, 51));
        btnViewpresetn.setText("View Present AQI Trend");
        btnViewpresetn.setBorder(new javax.swing.border.MatteBorder(null));
        btnViewpresetn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewpresetnActionPerformed(evt);
            }
        });

        txtPresent.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        txtPresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresentActionPerformed(evt);
            }
        });
        txtPresent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPresentKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel5.setText("Input Present AQI :");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("Set");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnViewpresetn, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(223, 223, 223)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(109, 109, 109)
                                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tomorrow_AQI)
                                .addGap(43, 43, 43)
                                .addComponent(txtFldTommAQI, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(0, 466, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReportAQI, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(733, 733, 733)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tomorrow_AQI)
                            .addComponent(txtFldTommAQI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewpresetn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnReportAQI, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCityActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        String citynm=(String) comboCity.getSelectedItem();
        
        double ln_2018;
        double ln_2019;
        double ln_2020;
        double ln_2021;
        double ln_2022;
        
            
        double[] year_AQI=new double[12];
        int i=0;
        
        try{
            
            Connection connect=ConnectionDB.ConnectDB();
            
            String query="select year(str_to_date(date,'%d/%m/%Y')) as Year,AVG(AQI) as AQI from ds_pollution_new"+" WHERE cbsa="+'"'+citynm+'"'+"group by year(str_to_date(date,'%d/%m/%Y')) order by year(str_to_date(date,'%d/%m/%Y')) ASC";
            
           
            String avg_query="select year(str_to_date(date,'%d/%m/%Y')) as Year,AVG(AQI) as AQI from ds_pollution_new"+" WHERE cbsa="+'"'+citynm+'"'+"group by year(str_to_date(date,'%d/%m/%Y')) order by year(str_to_date(date,'%d/%m/%Y')) ASC";
            Statement stmt=connect.createStatement();  
            ResultSet rs=stmt.executeQuery(avg_query);  
            while(rs.next()) 
            {
                // System.out.println(rs.getString("AQI"));
                
                year_AQI[i] = Double.parseDouble(rs.getString("AQI"));
                
               // System.out.println(year_AQI[i]);
                i=i+1;
            }
            
            
           
            
            ln_2018=Double.parseDouble(txtPresent.getText()) +(0.4*(Double.parseDouble(txtPresent.getText())-year_AQI[9]));
            
            double[] forecast_AQI=new double[6];
            double value=0;
            
            forecast_AQI[0]=year_AQI[9];
            System.out.println(forecast_AQI[0]);
            forecast_AQI[1]=ln_2018;
            
            
          //  System.out.println("-----------");
            
               //System.out.println(forecast_AQI[0]);
                //System.out.println(forecast_AQI[1]);
            
                for(int q=2;q<6;q++){
            
                forecast_AQI[q]=forecast_AQI[q-1]+(0.4*(forecast_AQI[q-1]-forecast_AQI[q-2]));
                
              //  System.out.println(forecast_AQI[q]);
            
            }
            
            txtFldTommAQI.setText(String.valueOf(forecast_AQI[1]));
  
            past=String.valueOf(forecast_AQI[0]);
            future=String.valueOf(forecast_AQI[1]);
            
            JDBCCategoryDataset dataset=new JDBCCategoryDataset(ConnectionDB.ConnectDB(),query);
            
            JFreeChart chart=ChartFactory.createLineChart("Query Chart", "Year", "AQI", dataset, PlotOrientation.VERTICAL, false, true, true);
            
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer= new BarRenderer();
            ChartFrame frame=new ChartFrame("Query Chart",chart);
            frame.setVisible(true);
            frame.setSize(400, 600);
            
            connect.close();
        }
        
        catch(Exception e){System.out.println(e);}
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnReportAQIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportAQIActionPerformed
        // TODO add your handling code here:
       /* 
        String filedata=Today_AQI.getText()+": "+txtFldTodayAQI+"\r\n "+
                        Tomorrow_AQI.getText()+": "+txtFldTommAQI+"\r\n "+
                        After_5_Year_AQI.getText()+": "+txtFldFutureAQI;
                        
        String locn="/Users/srikantswamy/Downloads/File_AQI.txt";
        
        
        try {
            
         File file=FileWrite.Writer(locn,filedata);
        
        } catch (IOException ex) {
            Logger.getLogger(ForecastWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        
        userProcessContainer.add("ReportAQIJPanel", new ReportAQIJPanel(userProcessContainer, account, enterprise,file,system,past,future,present));
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnReportAQIActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        populateReportAQITable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtFldTommAQIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldTommAQIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldTommAQIActionPerformed

    private void btnViewpresetnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewpresetnActionPerformed
        // TODO add your handling code here:
        
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        for (int i=0; i < aqi.size(); i++) {
            dcd.setValue(Double.parseDouble(aqi.get(i)), "AQI", city.get(i));
        }
        
        JFreeChart jchart = ChartFactory.createBarChart("AQI", "AQI", "City", dcd, PlotOrientation.VERTICAL, true, true, false);
        
//        CategoryPlot plot = jchart.getCategoryPlot();
//        plot.setRangeGridlinePaint(Color.black);
        
        ChartFrame chartFrame = new ChartFrame("AQI", jchart, true);
        chartFrame.setVisible(true);
        chartFrame.setSize(500,400);
    }//GEN-LAST:event_btnViewpresetnActionPerformed

    private void txtPresentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresentKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPresentKeyTyped

    private void txtPresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        present = txtPresent.getText();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tomorrow_AQI;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReportAQI;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewpresetn;
    private javax.swing.JComboBox comboCity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequstAQI;
    private javax.swing.JTextField txtFldTommAQI;
    private javax.swing.JTextField txtPresent;
    // End of variables declaration//GEN-END:variables
}