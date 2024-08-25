/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.databaseImpl;
import java.sql.ResultSet;
import com.growright.databaseInter.UserDatabaseInter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.growright.databasepost.DataBasePlant;
import com.growright.pojo.Clients;



/**
 *
 * @author Test
 */
public class UserDatabaseImpl implements UserDatabaseInter {
        private PreparedStatement ps;
        private PreparedStatement psl;
        private Connection connect;
        private ResultSet rs;
        
        Clients client = new Clients(); //Getting the variables from Constructor Client  
        final private DataBasePlant dbManager;
        
        public UserDatabaseImpl(DataBasePlant dbManager){
            this.dbManager = dbManager;
        }
        //8***********************************************************************************
         //@Override
            public boolean CheckPerson(Clients user){
                boolean status = true;
                try{
                    connect = dbManager.getConnection();
                    ps = connect.prepareStatement("");//Add PostgreSQL get syntax to get the information
                    ps.setString(1, user.getEmail()); //getting the user that was set at Clients on login 
                    ps.setString(2, user.getPassword());
                    rs = ps.executeQuery();
                        status = rs.next();
                        
                        if(status){
                            psl = connect.prepareStatement("update person set logintimestamp = now()  where email = ? and password = ?"); //CHheck
                            psl.setString(1, user.getEmail());
                            psl.setString(2, user.getPassword());
                            psl.executeUpdate();
                                    }
                        
                   
                }catch(SQLException ex){
                
                    System.out.println("Cant login:" + ex.getMessage());
                } finally{
                    closeStreams();
                }
                return status;
            }
            
         public boolean registerPerson(Clients user){
             boolean result= false;
             try{
                 connect = dbManager.getConnection();
                 ps = connect.prepareStatement("");// SQL to insert the user on the clients table
                 ps.setString(1, user.getClientName());
                 ps.setString(2, user.getEmail());
                 ps.setString(3, user.getPassword());
                 int i = ps.executeUpdate();
                 result = i> 0;
             
             }catch(SQLException ex){
             
                 System.out.println("Sorry Cant Connect" + ex.getMessage());
             }finally{
                 closeStreams();
             }
             return result;
         }
         
         //******************Return the object of the person************
         //@Override
         public Clients getUser(String email,String password ){
             Clients user = null;
              
             try{
                 connect = dbManager.getConnection();
                 ps = connect.prepareStatement(""); //SQL statement to get the users SELECT STATEMENT
                 ps.setString(1, email);
                 ps.setString(2, password);
                 rs = ps.executeQuery();
                    if(rs.next()){
                        user = new Clients();
                        user.setUserID(rs.getInt("clientID"));//get the right field name
                        user.setEmail(rs.getString("email"));// check field name for email!!!!!
                        user.setClientName(rs.getString("name"));//Check field name for name 
                        user.setPassword("password");//CHECK field name 
                    
                    }
                 
                 
             }catch(SQLException ex){
             
             
             }
         return user;
         }
         
         //***********Contact us Form*******************************
         public boolean contactUsForm(Clients user){
             boolean resultcheck = false;
             try{
                 connect = dbManager.getConnection();
                 ps = connect.prepareStatement("");//INSERT INTO CONTACT US TABLE //CREATE A TABLE 
                 ps.setString(1, user.getClientName());
                 ps.setString(2, user.getClientSurname());
                 ps.setString(3, user.getEmail());
                 ps.setString(4,user.getMessage());
                 
                 resultcheck = ps.executeUpdate() >0;
             
             
             }catch(SQLException ex){
             
                 System.out.println("Unable to connect " + ex.getMessage());
             
             }
         
         return resultcheck;
         }
    //********************************************SELECT USER********************
       //@Override
         public Clients selectUser(int clientid){
             Clients user = null;
             try{
                 connect = dbManager.getConnection();
                 ps = connect.prepareStatement(""); //Select the user where it equals 
                 ps.setInt(1, clientid);//ClientID from DBS 
                 rs = ps.executeQuery();
                 while(rs.next()){
                     String clientName = rs.getString("clientName");//Field name 
                     String email = rs.getString("email");
                     String password = rs.getString("password");
                     user = new Clients(clientName,email,password);
                     
                 }
             
             
             
             }catch(SQLException ex){
                 
                 System.out.println("Error when getting user " + ex.getMessage());
             }
         return user;
        
         }
    //*******************Update User*************************8
       //Override 
         public boolean updateUser(Clients user){
             boolean updateclient = false;
             try{
                 connect = dbManager.getConnection();
                 ps = connect.prepareStatement(""); //Update user SQL
                 rs = ps.executeQuery();
                 ps.setString(1, user.getClientName());
                 ps.setString(2, user.getClientSurname());
                 ps.setString(3, user.getEmail());
                 ps.setString(4, user.getPassword());
                 ps.setInt(5, user.getUserID());
                 updateclient = ps.executeUpdate() > 0;
                 
             }catch(SQLException ex){
                 System.out.println("Couldn't update users " + ex.getMessage());
             
             }
              return updateclient;
         }
         
  //**********CloseStream       
 public void closeStreams(){
     if(rs != null){
         try{
             
             rs.close();
         
         }catch(SQLException ex){System.out.println("Error closing " + ex.getMessage());}
     
     
     }
     if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error closing prepared statement: " + ex.getMessage());
            }
        }
        if (psl != null) {
            try {
                psl.close();
            } catch (SQLException ex) {
                System.out.println("Error closing prepared statement 1: " + ex.getMessage());
            }
        }
        if (connect != null) {
            try {
                connect.close();
            } catch (SQLException ex) {
                System.out.println("Error closing connection: " + ex.getMessage());
            }
        }
        rs = null;
        ps = null;
        psl = null;
        connect = null;
    }
 
 
 }       

