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
public class Steps {
    private String soil;
  private String storage;
  private String pest;
  private String links;
  private boolean greenhouse;
  private String[] season;
  private String store;
  private String benefits;

  public Steps(String soil,String storage,String pest,String links,boolean greenhouse,String[] season,String store,String benefits){
    this.soil = soil;
    this.storage = storage;
    this.pest = pest;
    this.links = links;
    this.greenhouse = greenhouse;
    this.season = season;
    this.store = store;
    this.benefits = benefits;}
  public Steps(){
  }

  public String getSoil(){
    return soil;}

  public void  setSoil(String soil){
    this.soil = soil;}
  
  public String getStorage(){
    return storage;}

  public void setStorage(String storage){
    this.storage = storage;}


  public String getPest(){
    return pest;}
  public void setPest(String pest){
    this.pest = pest;}
  
  public String getLinks(){
    return links;}
  public void setLinks(String links){
    this.links = links;}

  public boolean getGreenhouse(){
    return greenhouse;}
  public void setGreenhouse(boolean greenhouse){
    this.greenhouse = greenhouse;}

  public String[] getSeason(){
    return season;}
  public void setSeason(String[] season){
    this.season = season;}

  public String getStore(){
    return store;}
  public void setStore(String store){
    this.store = store;}

  public String getBenefits(){
    return benefits;}
  public void setBenifits(String benefits){
    this.benefits = benefits;
  
  }

  public String toString(){
    return "";
  }

  //Hash Code
  // public int hashCode()  

  // public boolean equals(Object obj)
    
}
