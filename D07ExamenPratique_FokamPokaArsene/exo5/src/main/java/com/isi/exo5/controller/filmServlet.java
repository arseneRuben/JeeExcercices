/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.isi.exo5.controller;

import com.isi.exo5.dao.ActorManager;
import com.isi.exo5.dao.MemberManager;
import com.isi.exo5.dao.MovieManager;
import com.isi.exo5.entity.Actor;
import com.isi.exo5.entity.Movie;
import com.isi.exo5.entity.Member;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author isi
 */
@WebServlet(name = "filmServlet", urlPatterns = {  "/home", "/login","/exo4a","/exo4b", "/exo5a",  "/exo5b"})
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
          
             case "/login":
                String username = request.getParameter("username");
                String password = request.getParameter("password");

                Member user = MemberManager.findOneBy(username, password);

                if (user != null) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("user", user);
                    actors = ActorManager.findByUser(user.getId());
                    request.setAttribute("actors", actors);
                    request.getRequestDispatcher("WEB-INF/films.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("WEB-INF/exo1error.jsp").forward(request, response);
                }
                break;
             case "/exo4a":
                String yearS = request.getParameter("selectedYear");
                if (yearS != null) {
                    movies = MovieManager.findByYear(yearS);
                    request.setAttribute("movies", movies);
                }
                request.getRequestDispatcher("WEB-INF/exo4a.jsp").forward(request, response);
                break;
            case "/exo4b":
                actors = ActorManager.findByFilm(Integer.parseInt(request.getParameter("movieId")));
                if (actors != null) {
                    request.setAttribute("actors", actors);
                    request.getRequestDispatcher("WEB-INF/acteur.jsp").forward(request, response);
                }

                break;

            case "/exo5a":
                actors = ActorManager.findByFilm(1);
                if (actors != null) {
                    request.setAttribute("actors", actors);
                    request.getRequestDispatcher("WEB-INF/acteur.jsp").forward(request, response);
                }

                break;
            case "/exo5b":
                actors = ActorManager.findByUser(1);
                if (actors != null) {
                    request.setAttribute("actors", actors);
                    request.getRequestDispatcher("WEB-INF/exo5b.jsp").forward(request, response);
                }

                break;
              default:
                request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
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
