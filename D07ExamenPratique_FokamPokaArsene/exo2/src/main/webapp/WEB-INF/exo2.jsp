<%-- 
    Document   : portal
    Created on : Dec 9, 2022, 8:08:07 AM
    Author     : isi
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.isi.exo1.entity.Movie"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="bootstrap.min.css">

        <title>Exo2 film list Page</title>
    </head>
    <%
        List<Movie> movies = (ArrayList<Movie>) request.getAttribute("movies");;
    %>
    <body>
        <div class="container mt-5">
            <h1> Liste des films </h1>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                </div>
                <div class="col-md-6">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Titres</th>
                                <th scope="col">Annees</th>

                            </tr>
                        </thead>
                        <tbody>
                            <%                          for (Movie movie : movies) {
                            %>
                            <tr>

                                <td> <%= movie.getTitle()%></td>
                                <td> <%= movie.getYr()%></td>

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
