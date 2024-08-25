///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.growright.controlsites;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpSession;
//import com.growright.databasepost.DataBasePlant;
//import com.growright.pojo.Clients;
//import com.growright.databaseInter.UserDatabaseInter;
////za.co.teamsuccess.service.impl.UserServiceImpl;
////import com.growright.databaseservice.UserServiceImpl;
//
///**
// *
// * @author Test
// */
//@WebServlet(name = "UserControl", urlPatterns = {"/UserControl"})
//public class UserControl extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        UserDatabaseInter us;
//        String process = request.getParameter("pro");
//        RequestDispatcher view = null;
//        HttpSession session;
//        Clients user;
//        if(process != null){
//            session = request.getSession();
//            ServletContext sc = request.getServletContext();
//            //
//            us = new UserServiceImpl((DataBasePlant) sc.getAttribute("dbconn"));
//            //This is the jsp/html
//            if(process.equals("login")){
//                user = us.getUser(request.getParameter("email"),request.getParameter("password"));
//                    if(us.CheckPerson(user)){
//                        Clients person = (Clients) session.getAttribute("person");
//                            if(person == null){
//                                session.setAttribute("person", user);
//                                request.setAttribute("loggedin", true);
//                            }else{
//                                System.out.println("User Logged In");
//                                request.setAttribute("loggedin",false);
//                                request.setAttribute("msg", "user loged in");
//                            }
//                            view = request.getRequestDispatcher("index.jsp");//Home Page
//                    }else if(!us.CheckPerson(user)){
//                        System.out.print("User didn't login");
//                        view = request.getRequestDispatcher("login.jsp");//Login page 
//                        
//                    }else{
//                        System.out.print("User couldnt log in");
//                        view = request.getRequestDispatcher("login.jsp");//login page 
//                    
//                    }
//            
//            }
//        }
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet UserControl</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet UserControl at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "User Control";
//    }// </editor-fold>
//
//}
