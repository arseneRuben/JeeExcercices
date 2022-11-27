/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.formulairedevise;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isi
 */
@WebServlet(name = "Converter", urlPatterns = {"/convert"})
public class Converter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String entry = (String) request.getParameter("val"), fr = (String) request.getParameter("fr"), us = (String) request.getParameter("us");
        double output = 0;
        System.out.println(entry+ fr + us);
        if (us != null && us.equals("us")) {
            output = (Float.valueOf(entry)) * 0.94;
        }
        if (fr != null && fr.equals("fr")) {
            output = (Float.valueOf(entry)) * 0.7;
        }
        String result = entry + " equivaut a " + output;
        if (us != null && us.equals("on")) {
            result += " dollars americains";
        }
        if (fr != null && fr.equals("on")) {
            result += " dollars canadiens";
        }
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Compteur</title>");
            out.println("</head>");
            out.println("<body  style=\"text-align: center\">");
            out.println("<a href = \"/formulaireDevise/deviseForm.html\" class=\"link-success\"> Redirection vers le formulaire</a>\n"
                    + "");
            out.println("<h2> " + result + " .</h2>");
            out.println("</body>");
            out.println("</html>");
        }

        //  request.getRequestDispatcher("WEB-INF/resultat.html").forward(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String entry = (String) request.getAttribute("val"), fr = (String) request.getAttribute("fr"), us = (String) request.getAttribute("en");

        double output = 0;
        if (us != null && us.equals("on")) {
            output = (Float.valueOf(entry)) * 0.94;
        }
        if (fr != null && fr.equals("on")) {
            output = (Float.valueOf(entry)) * 0.7;
        }
        String result = entry + " equivaut a " + output;
        if (us != null && us.equals("on")) {
            result += " dollars americains";
        }
        if (fr != null && fr.equals("on")) {
            result += " dollars canadiens";
        }
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Compteur</title>");
            out.println("</head>");
            out.println("<body  style=\"text-align: center\">");
            out.println("<a href = \"/formulaireDevise/deviseForm.html\" class=\"link-success\"> Redirection vers le formulaire</a>\n"
                    + "");
            out.println("<h2> " + result + " .</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
