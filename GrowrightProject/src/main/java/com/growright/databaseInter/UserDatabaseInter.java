/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.databaseInter;
import com.growright.pojo.Clients;

/**
 *
 * @author Test
 */
public interface UserDatabaseInter {
 boolean CheckPerson(Clients user);
//   boolean registerPerson(Clients user);
 Clients getUser(String email,String password);
//   boolean contactUSForm(Clients user);
//   Clients selectUSer(int clientid);
//   boolean updateUser(Clients user);
//   
   
   
    
}
