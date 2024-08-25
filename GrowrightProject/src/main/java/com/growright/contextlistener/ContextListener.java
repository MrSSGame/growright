/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.growright.contextlistener;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.growright.databasepost.DataBasePlant;

/**
 *
 * @author Test
 */
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce){
        ServletContext sc = sce.getServletContext();
        String driver = sc.getInitParameter("driver");
        String url = sc.getInitParameter("url");
        String user_name = sc.getInitParameter("user_name");
        String password = sc.getInitParameter("password");
        String database = sc.getInitParameter("database");
        String sqlsecurity = sc.getInitParameter("sslsec");
        DataBasePlant db = new DataBasePlant();
        sc.setAttribute("dbconn", db.getConnection());
        
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce){
        ServletContext sc = sce.getServletContext();
        DataBasePlant db = (DataBasePlant) sc.getAttribute("dbconn");
        if(db != null){
            db.closepool();
        
        }   
    }
}
