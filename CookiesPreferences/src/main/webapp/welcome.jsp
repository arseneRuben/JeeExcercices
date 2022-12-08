
<%@page import="com.isi.cookiespreferences.CookyManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username = (String)request.getAttribute("username");
    String message = "";
    Cookie userCookie = CookyManager.getCookie(request, "username");
    if ((request.getParameter("rememberMe") != null) && request.getParameter("rememberMe").equals("on")) {
        message = "Un cookie contenant votre nom d'usager a ete place sur votre ordinateur " ;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Welcome Page</title>
    </head>
    <body style="width: 60%; margin: auto">
        <h1> Bienvenu, <%= username %></h1>
        <h2> <%= message  %></h2>
    </body>
</html>
