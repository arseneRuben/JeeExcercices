/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.isi.exo5.controller;

import com.isi.exo5.dao.ActorManager;
import com.isi.exo5.dao.MovieManager;
import com.isi.exo4.entity.Actor;
import com.isi.exo4.entity.Movie;
import java.io.IOException;
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
@WebServlet(name = "filmServlet", urlPatterns = { "/exo5a",  "/exo5b"})
public class filmServlet extends HttpServlet {

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
        List<Movie> movies = MovieManager.findAll();
        List<String> years = MovieManager.findAllYears();
        List<Actor> actors;
        request.setAttribute("movies", movies);
        request.setAttribute("years", years);

        switch (request.getServletPath()) {
          
            case "/exo5a":
                actors = ActorManager.findByFilm(1);
                if (actors != null) {
                    request.setAttribute("actors", actors);
                    request.getRequestDispatcher("WEB-INF/exo5a.jsp").forward(request, response);
                }

                break;
            case "/exo5b":
                actors = ActorManager.findByUser(1);
                if (actors != null) {
                    request.setAttribute("actors", actors);
                    request.getRequestDispatcher("WEB-INF/exo5b.jsp").forward(request, response);
                }

                break;

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
