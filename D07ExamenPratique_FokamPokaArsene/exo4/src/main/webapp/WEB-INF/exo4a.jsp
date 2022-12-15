<%-- 
    Document   : portal
    Created on : Dec 9, 2022, 8:08:07 AM
    Author     : isi
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.isi.exo4.entity.Movie"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="bootstrap.min.css">

        <title>Exo4a</title>
    </head>
    <%
        List<Movie> movies = (ArrayList<Movie>) request.getAttribute("movies");
        List<String> years = (ArrayList<String>) request.getAttribute("years");

    %>
    <body>
        <div class="container mt-5">
            <h1> Liste des annees de films </h1>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                    <form action="exo3b">
                        <select class="form-select" aria-label="Default select example" name="selectedYear">
                            <option selected>Annees</option>
                            <% for(String year : years) { %>
                        <option value="<%= year %>"> <%= year %></option>
                        <%}%>

                        </select>
                        <button class="btn btn-default" >search</button>
                    </form>
                </div>

                <div class="col-md-6">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Titres</th>
                                <th scope="col">Annees</th>
                                <th scope="col">Voir acteur</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%                          for (Movie movie : movies) {
                            %>
                            <tr>

                                <td> <%= movie.getTitle()%></td>
                                <td> <%= movie.getYr()%></td>
                                <td> <a><a href="exo4b?movieId=<%= movie.getId() %>">Voir</a></td>

                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-3">
                    <a><a href="exo3b" class="btn btn-primary">retour a la liste</a>
                </div>

            </div><!-- comment -->
        </div>
    </body>
</html>
