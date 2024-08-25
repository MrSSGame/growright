/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.pojo;

/**
 *
 * @author Test
 */
public class Links {
    private String  healthBenifits;
  private String recepies;
  private String tutorial;

  public Links(String healthBenifits, String recepies, String tutorial){
    this.healthBenifits = healthBenifits;
    this.recepies = recepies;
    this.tutorial = tutorial;
    
  }

  public String getHealthBenifits(){
    return healthBenifits;
  }
  public void setHealthBenifits(String healthBenifits){
    this.healthBenifits = healthBenifits;
  }

  public String getRecepies(){
    return recepies;
  }
  public void setRecepies(String recepies){
    this.recepies = recepies;
  }
  public String getTutorial(){
    return tutorial;
  }
  public void setTutorial(String tutorial){
    this.tutorial = tutorial;
  }
  //hashcode
  //Object
    
}
