<%-- 
    Document   : portal
    Created on : Dec 9, 2022, 8:08:07 AM
    Author     : isi
--%>

<%@page import="com.isi.exo1.entity.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <title>Exo1 Good Page</title>
    </head>
    <%
        Member user = null;
        if (session != null) {
            user = (Member) session.getAttribute("user");
        }
    %>
    <body>
        <div class="container mt-5">
            <div class="row d-flex justify-content-center">
                <div class="col-md-6">
                    <h1>Bienvenu(e) <i><%= user.getNom()%></i> au portail </h1>
                </div>
                
                <p> 
                    <a href="logout"> se deconnecter</a>
                </p> 
            </div><!-- comment -->
        </div>
    </body>
</html>
