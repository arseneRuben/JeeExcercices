/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.isi.formulairejob.controller;

import com.isi.formulairejob.model.JobManager;
import com.isi.formulairejob.model.Job;
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
@WebServlet(name = "FormTreatment", urlPatterns = {"/treatement"})
public class FormTreatment extends HttpServlet {

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
            out.println("<title>Servlet FormTreatment</title>");
            out.println("</head>");
            out.println("<body style=\" width:50%; margin:auto \">");
            out.println("<h1>Quete d'emploi</h1>");
            out.println(" <div style=\"display: flex\">");
            out.println("<div>");
            out.println("<form action=\"treatement\" method=\"get\">");
            out.println("<div>");
            out.println(" <label>nom</label> <input type=\"text\" name=\"name\" />");
            out.println(" </div>");
            out.println("<label>Type contrat</label>");
            out.println(" <div>");
            out.println("<div> <label>Plein</label> <input type=\"radio\" name=\"type\" value=\"plein\"/></div>");
            out.println("<div><label>Partiel</label> <input type=\"radio\"  name=\"type\"  value=\"partiel\"/></div>");
            out.println(" </div>");
            out.println(" <div>");
            out.println(" <button>Valider</button>");
            out.println(" </div>");
            out.println("</form>");
            out.println(" </div>");

            String name = request.getParameter("name");
            String type = request.getParameter("type");
           
            if ((type != null) && (name != null)) {
                out.println(" <div>");
                
                out.println("  Bonjour <span> "+name+" </span>");
                out.println(" <div>");
                 
                for(Job job : JobManager.findBy(type)){
                    out.println(" <p>"+ job.getDescription()+"</p>");
                }
                
                
                out.println("  </div>");
                out.println("  </div>");
            }

            out.println("  </div>");
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

}
