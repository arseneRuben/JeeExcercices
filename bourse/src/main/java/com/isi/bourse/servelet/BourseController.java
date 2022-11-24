/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.isi.bourse.servelet;

import com.isi.bourse.entity.Bourse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isi
 */
@WebServlet(name = "BourseController", urlPatterns = {"/bourse"})
public class BourseController extends HttpServlet {

    private int step = 0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BourseController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BourseController </h1>");
            out.println(this.listFormat());
            out.println("</body>");
            out.println("</html>");
        }
    }

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
          response.addHeader("Refresh", "2");
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.addHeader("Refresh", "2");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public List<Bourse> list() {
        List<Bourse> bourses = new ArrayList<Bourse>();
        Bourse brs = new Bourse("Sun MicroSystemes", (float) Math.random() * 48);
        bourses.add(brs);
        brs = new Bourse("MicroSoft", (float) Math.random() * 489);
        bourses.add(brs);
        brs = new Bourse("Apple", (float) Math.random() * 89);
        bourses.add(brs);
        brs = new Bourse("Google", (float) Math.random() * 119);
        bourses.add(brs);
        brs = new Bourse("Canpar", (float) Math.random() * 9);
        bourses.add(brs);
        brs = new Bourse("Meta", (float) Math.random() * 179);
        bourses.add(brs);
        return bourses;
    }

    public String listFormat() {
        String output = "";

        for (int i = 0; i < step; i++) {
            output += "<p>"+this.list().get(i)+"</p>";
        }
        if(step < this.list().size()){
            step++;
        }else {
            step = 0;
        }
        return output;
    }
}
