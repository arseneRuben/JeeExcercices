
<%@page import="com.isi.exo5.entity.Member"%>
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

        <title>Exo5a list of prefered actor of user 1</title>
    </head>
    <%
        List<Actor> actors = (ArrayList<Actor>) request.getAttribute("actors");
        List<Movie> movies = (ArrayList<Movie>) request.getAttribute("movies");
        List<String> years = (ArrayList<String>) request.getAttribute("years");
        Member user = (Member)session.getAttribute("user");
    %>
    <body>
        <div class="container mt-5">
            <h1> Liste des acteurs du preferes de l'utilisateur <%= user.getNom() %> </h1>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                    <a class="btn btn-primary" href="exo4a"> retour a la liste des acteurs</a>
                </div>
                <div class="col-md-6">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Nom</th>
                                <th scope="col">Suppression</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                if(actors != null){
                                for (Actor actor : actors) {
                            %>
                            <tr>
                                <td> <%= actor.getName()%></td>
                                <td> <a href="#">Supprimer</a></td>
                            </tr>
                            <%
                                }
                               }
                            %>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-3">
                </div>

            </div><!-- comment -->

        </div>
        
                        
                        
        <div class="container mt-5">
            <h1> Liste des films avec filtre sur l'annee </h1>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                    <form action="exo4a">
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
