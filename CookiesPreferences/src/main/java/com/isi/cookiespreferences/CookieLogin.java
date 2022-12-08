package com.isi.cookiespreferences;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author isi
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class CookieLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        Cookie userCookie;
        request.setAttribute("username", username);
        if ((request.getParameter("rememberMe") != null) && request.getParameter("rememberMe").equals("on")) {
            userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60 * 60);
           
        } else {
            userCookie = new Cookie("username", username);
            userCookie.setMaxAge(0);
          
        }
        
        response.addCookie(userCookie);
        request.getRequestDispatcher("welcome.jsp").forward(request, response);

        // this.print(request, response);
    }
}
