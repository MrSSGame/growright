/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.pojo;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Test
 */
public class Plant implements Serializable {
  private int plantID;  
  private String plantName;
  private String description;
  private String picture ;
  private String steps;

  public Plant(String plantName, String description, String picture,String steps){
    this.plantName = plantName;
    this.description = description;
    this.picture = picture;
    this.steps = steps;
  }
  public Plant(){}
  public Plant(int plantID,String plantName,String description,String steps,String picture){
      this.plantID = plantID;
      this.plantName = plantName;
      this.description = description;
      this.steps = steps;
      this.picture = picture;
  
  
  }
  
  public Plant(int plantID,String plantName,String description,String steps){
      this.plantID = plantID;
      this.plantName = plantName;
      this.description = description;
      this.steps = steps;
   }
  
  public int getPlantID(){
      return plantID;
  }
  public void setPlantID(int plantID){
      this.plantID = plantID;
  }
          
  public String getplantName(){
    return plantName;
  }

  public String getDescription(){
    return description;
  }

  public String getPicture (){
    return picture;
  }
  
  public String getsteps(){
      return steps;
  }

  public void setName(String name){
    this.plantName = plantName;
  }

  public void setPicture(String picture){
    this.picture = picture;
  }

  public void setSteps(String steps){
    this.steps = steps;
  }

  public String toString(){
    return "plantid:" +plantID+ "Name: " + plantName + ", Description: " + description + ", Picture: " + picture + ", Steps: " + steps;
  }
     @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.plantName);
        hash = 79 * hash + this.plantID;
        return hash;
    }
      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plant other = (Plant) obj;
        return Objects.equals(this.plantName, other.plantName);
    }
  //object

  
}
  
