/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.serviceImpl;
import com.growright.databaseInter.PlantDatabaseInter;
import com.growright.databaseImpl.PlantDatabaseImpl;
import com.growright.databasepost.DataBasePlant;
import com.growright.pojo.Plant;
import com.growright.service.PlantService;
/**
 *
 * @author Test
 */
public class PlantServiceImpl implements PlantService  {
    
    PlantDatabaseInter plantDao;
    
    
    public PlantServiceImpl(DataBasePlant dbp){
    
        plantDao = new PlantDatabaseImpl(dbp);
    
    }
    

    @Override
    public Plant getPlant (int plantid) {
        return plantDao.getPlant(plantid);
         }
    
}
