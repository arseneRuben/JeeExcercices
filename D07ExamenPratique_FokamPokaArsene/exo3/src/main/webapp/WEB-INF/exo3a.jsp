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

        <title>Exo3a film's years</title>
    </head>
    <%
        List<Movie> movies = (ArrayList<Movie>) request.getAttribute("movies");;
    %>
    <body>
        <div class="container mt-5">
            <h1> Liste des annees de films </h1>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                </div>
                <div class="col-md-6">
                    <select class="form-select" aria-label="Default select example">
                        <option selected> Annees</option>
                        <% for(Movie movie : movies) { %>
                        <option value="<%= movie.getYr() %>"> <%= movie.getYr() %></option>
                        <%}%>
                       
                    </select>
                </div>
                <div class="col-md-3">
                </div>

            </div><!-- comment -->
        </div>
    </body>
</html>
