<%-- 
    Document   : portal
    Created on : Dec 9, 2022, 8:08:07 AM
    Author     : isi
--%>

<%@page import="com.isi.exo4.entity.Actor"%>
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

        <title>Exo4b film's actors</title>
    </head>
    <%
        List<Actor> actors = (ArrayList<Actor>) request.getAttribute("actors");;
    %>
    <body>
        <div class="container mt-5">
            <h1> Liste des acteurs du film </h1>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                    <a class="btn btn-primary" href="exo4a"> retour a la liste des films</a>
                </div>
                <div class="col-md-6">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">id</th>
                                <th scope="col">Nom</th>
                               
                            </tr>
                        </thead>
                        <tbody>
                            <%                          for (Actor actor : actors) {
                            %>
                            <tr>

                                <td> <%= actor.getId() %></td>
                                <td> <%= actor.getName() %></td>

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
