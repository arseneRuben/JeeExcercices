/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.menuredirection;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isi
 */
@WebServlet(name = "MenuServelet", urlPatterns = {"/rooter"})
public class MenuServelet  extends HttpServlet{
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
          String page = request.getParameter("page") != null ? request.getParameter("page") : "index" ;        
        request.getRequestDispatcher("WEB-INF/page" + page + ".html").forward(request, response);
        }
        
}
