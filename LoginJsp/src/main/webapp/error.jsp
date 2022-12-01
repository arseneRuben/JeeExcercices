<%-- 
    Document   : error
    Created on : Dec 4, 2022, 10:19:01 AM
    Author     : isi
--%>

<%@page import="com.isi.loginjsp.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    User user = (User) request.getAttribute("user");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">

        <title>Error Page</title>
    </head>
    <body>
        <h1>Erreur</h1>
         <div class="container mt-5">
            <div class="row d-flex justify-content-center">
                <div class="col-md-6">
                    <!-- <%= user.getLogin()%> --> n’êtes pas un utilisateur valide
                </div>
            </div>
         </div>
    </body>
</html>
