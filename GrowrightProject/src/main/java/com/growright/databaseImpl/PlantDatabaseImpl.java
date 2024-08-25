/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.databaseImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.growright.databasepost.DataBasePlant;
import com.growright.pojo.Plant;
        /**
 *
 * @author Test
 */
import com.growright.databaseInter.PlantDatabaseInter;
public class PlantDatabaseImpl implements PlantDatabaseInter {
    private PreparedStatement ps;
    private Connection connect;
    private ResultSet rs;
    final private DataBasePlant dbManager;
    
    public PlantDatabaseImpl(DataBasePlant dbManager){
        this.dbManager = dbManager;
    
    }
    //Getting products from Database
    //@Override
    public Plant getPlant(int plantid){
        Plant plant = null;
        try{
            connect = dbManager.getConnection();
            ps = connect.prepareStatement("");//get plant SQL statement
            ps.setInt(1, plantid);
            rs = ps.executeQuery();
            if(rs.next()){
                plant = new Plant(rs.getInt("plant_id"),rs.getString("plant_name"),rs.getString("plant_description"),rs.getString("steps"));
                plant.setPicture(rs.getString("picture"));
            }
                
        
        }catch(SQLException ex){
            System.out.println("Error returning product" + ex.getMessage());
        
        }finally{
            closeStreams();
        
        }
    return plant;
    
    }
    //
    private void closeStreams(){
        if(rs != null){
            try{
                rs.close();
            }catch(SQLException ex){
                System.out.println("Error closing Resultset" + ex.getMessage());
            }
        
        
        }
        if(ps!=null){
            try{
                ps.close();
            }catch(SQLException ex){
            
                System.out.println("Error closing prepared statement" + ex.getMessage());
            }
        
        }
        if(connect != null){
            try{
            
                connect.close();
            
            }catch(SQLException ex){
            
                System.out.println("Error closing the connection" + ex.getMessage());
            
            }
        rs = null;
        ps = null;
        connect = null;
        
        
        }
    
    }
}
