/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.cookiespreferencecouleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isi
 */
@WebServlet(name = "PreferenceServlet", urlPatterns = {"/preference"})
public class PreferenceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String username = request.getParameter("username");
        String color = request.getParameter("color");
        request.setAttribute("username", username);
        request.setAttribute("color", color);

        if (cookies == null) {
            response.sendRedirect("login.jsp");

        } else {
            request.getRequestDispatcher("welcome.jsp").forward(request, response);

            response.sendRedirect("welcome.jsp");
        }

        // this.print(request, response);
    }
}
