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
public class Clients {
    private int userID;
    private String clientName;
    private String clientSurname;
  private String email;
  private String password;
  private String message;

  public Clients(String UserID,String clientName,String clientSurname, String email, String password){
    this.userID = userID;
    this.clientName = clientName;
    this.email = email;
    this.password = password;
    this.clientSurname = clientSurname;
  }
  
  public Clients(String clientName,String clientSurname, String email,String message){
      this.clientName = clientName;
      this.clientSurname = clientSurname;
      this.email = email;
      this.message = message;
  }
  
  public Clients(String clientName,String email,String password){
      this.clientName = clientName;
      this.email = email;
      this.password = password;
  
  }
  
  public Clients(){
      
  }

  public Clients(String email, String password){
    this.email = email;
    this.password = password;
  }
  
  public void setMessage(String Message ){
      this.message = message;
  }
  
  public String getMessage(){
  return message;
  }
  public void setClientSurname(String clientSurname){
      this.clientSurname = clientSurname;
      
  } 
  public  String getClientSurname()
  {   return clientSurname; }
  
  
  public void setUserID(int UserID){
   this.userID = userID;
  }
  public int getUserID(){
  return userID;
  }

  public String getClientName(){
    return clientName;
  }
  public void setClientName(String clientName){
    this.clientName = clientName;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.email=email;
  }
  public String getPassword(){
      
        return password;
  }
  public void setPassword(String password){
    this.password=password;
  }
  public String toString(String clientName, String email, char[] password){
    return "";//Add tostring 
  }
  //Hashcode
  //Add Equals Object 
    
}
