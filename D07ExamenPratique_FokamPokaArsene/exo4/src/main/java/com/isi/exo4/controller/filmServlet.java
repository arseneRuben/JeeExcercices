/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.isi.exo4.controller;

import com.isi.exo4.dao.ActorManager;
import com.isi.exo4.dao.MovieManager;
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
@WebServlet(name = "filmServlet", urlPatterns = {"/exo3a", "/exo3b", "/exo4a", "/exo4b"})
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
        request.setAttribute("movies", movies);
        request.setAttribute("years", years);
        switch (request.getServletPath()) {
            case "/exo3a":

                request.getRequestDispatcher("WEB-INF/exo3a.jsp").forward(request, response);

                break;
            case "/exo3b":
            case "/exo4a":
                String yearS = request.getParameter("selectedYear");
                if (yearS != null) {
                    movies = MovieManager.findByYear(yearS);
                    request.setAttribute("movies", movies);
                }
                request.getRequestDispatcher("WEB-INF/exo4a.jsp").forward(request, response);
                break;
            case "/exo4b":
                List<Actor> actors = ActorManager.findByFilm(Integer.parseInt(request.getParameter("movieId")));
                if (actors != null) {
                    request.setAttribute("actors", actors);
                    request.getRequestDispatcher("WEB-INF/exo4b.jsp").forward(request, response);
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
