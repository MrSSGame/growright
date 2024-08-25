/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.databasepost;
//import org.apache.commons.dhcp2.BasicDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Test
 */

//postgresql just url,username and password 
public class DataBasePlant {
  
    
    public Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/plantDatabase","postgres","123");
            if(con != null){
            
                System.out.println("Connection Succussful");
            
            }else{
            
                System.out.println("Unsuccessful Connection");
            
            }
            }catch(Exception ex){
    
            System.out.println(ex.getMessage());
        }
    
    
    return con;
    }
    public void closepool(){
        Connection con = getConnection();
        if(con != null){
            try{
            con.close();}
            catch(SQLException ex){
                System.out.println("Connection Closing Problem" + ex.getMessage());
            }
        }
    
    }
    

}
 //DataBasePlant.Connection con = null;
//try{
  //
   
  //
//}catch(Exception ex){


//}finally {
 //   System.exit(0);}


  
    
//   private BasicDataSource dataSource;
//    
//   //This information is needed to connect to the database.
//   public DataBasePlant(
//           String driver,
//           String url,
//           String username, //server username 
//           String password)//server password)
//           {//Try and catch statement to try the connection if it fails catch exception error 
//              try{
//                  Class.forName(driver); //this is the class that requires the catch
//                  dataSource = new BasicDataSource();
//                  dataSource.setUrl(url);
//                  dataSource.setUsername(username);
//                  dataSource.setMinIdle(5);
//                  dataSource.setMaxIdle(10);
//                  dataSource.setMaxOpenPreparedStatements(100);
//             
//              }catch(ClassNotFoundException ex){
//              
//                  System.out.println("Driver not Found " + ex.getMessage());
//              }
         //**********************************************************************
         
         //method for getting connection 

    /**
     *
     * @return
     * @throws SQLException
     */
//    public Connection getConnection()throws SQLException{
//             return dataSource.getConnection();
//        } 
   //*************************************************************************
//   public void closePool(){
//       if(this.dataSource != null){
//               this.dataSource.close();
//              }
//           catch(SQLException ex){
//              System.out.println("Error closing connection" + ex.getMessage());
//              
//              }
//       
//       
//       
//       
//            }
   
   
   
        
           
   
   
            
   

