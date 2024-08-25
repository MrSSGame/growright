///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.growright.databaseservice;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import com.growright.databaseImpl.UserDatabaseImpl;
//import com.growright.databaseInter.UserDatabaseInter;
//import com.growright.databasepost.DataBasePlant;
//import com.growright.pojo.Clients;
//import com.growright.controlsites.UserControl;
//
//
//
//
//
//
///**
// *
// * @author Test
// */
//public class UserServiceImpl implements UserDatabaseInter {
//    UserDatabaseInter userDAO;
//    
//    public UserServiceImpl(DataBasePlant dbManager){
//        this.userDAO = new UserDatabaseImpl(dbManager);
//    
//    }
//    //*********************************************************************************
//    //@Override
//    public boolean isVaild(Clients user){
//        boolean check = false;
//        if(user.getEmail().isEmpty()){
//            return check;
//        }
//        String regex = "^(.+)@(.+)$";
//        Matcher match = Pattern.compile(regex).matcher(user.getEmail());
//        if(match.matches()){
//            return UserDatabaseInter.CheckPerson(user);
//        }
//        return check;
//    }
//    
//    public Clients getUser(String email,String password){
//        return UserDatabaseInter.getUser(email,password);
//    
//    }
//}
