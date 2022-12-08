
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username = (String)request.getAttribute("username");
   
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Welcome Page</title>
    </head>
    <body style="width: 60%; margin: auto">
        <h1> Bienvenu . Vous pouvez changer l'affichage en cliquant sur <a href="login.jsp" target="target">ce lien</a> </h1>
    </body>
</html>
