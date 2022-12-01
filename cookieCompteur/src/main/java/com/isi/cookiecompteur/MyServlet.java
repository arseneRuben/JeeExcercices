/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.isi.cookiecompteur;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "MyServlet", urlPatterns = {"/cookie"})
public class MyServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            Cookie cookie = CookyManager.getCookie(request, "numberOfTimes");
            if (cookie != null) {
                Integer val = Integer.parseInt(cookie.getValue());
                val++;
                cookie.setValue(val.toString());
            } else {
                 cookie = new Cookie("numberOfTimes", 1 + "");
            }

        } else {
            Cookie cookie = new Cookie("numberOfTimes", 1 + "");
            cookie.setMaxAge(30);
            response.addCookie(cookie);
        }
        this.print(request, response);
    }

    public void print(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {
            try ( PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                Cookie cookie = CookyManager.getCookie(request, "numberOfTimes");
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet BourseController</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h3>" +cookie.getValue()+ " fois</h3>" );
                out.println("</body>");
                out.println("</html>");
            }
        }
    }

}
