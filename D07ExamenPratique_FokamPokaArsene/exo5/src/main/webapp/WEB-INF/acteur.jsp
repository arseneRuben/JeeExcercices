<%-- 
    Document   : portal
    Created on : Dec 9, 2022, 8:08:07 AM
    Author     : isi
--%>

<%@page import="com.isi.exo5.entity.Actor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.isi.exo5.entity.Movie"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="bootstrap.min.css">

        <title>Exo5a list  actor  movie 1</title>
    </head>
    <%
        List<Actor> actors = (ArrayList<Actor>) request.getAttribute("actors");;
    %>
    <body>
        <div class="container mt-5">
            <h1> Liste des acteurs du film  </h1>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                    <a class="btn btn-primary" href="home"> se deconnecter</a>
                </div>
                <div class="col-md-6">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Nom</th>
                                <th scope="col">Ajouter</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%                         
                                 for (Actor actor : actors) {
                            %>
                            <tr>
                                <td> <%= actor.getName()%></td>
                                <td> <a href="exo5b?actorid=<%= actor.getId() %>">Ajouter</a></td>
                            </tr>
                            <%
                              }
                            %>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-3">
                </div>

            </div><!-- comment -->
        </div>
                        
        
    </body>
</html>
