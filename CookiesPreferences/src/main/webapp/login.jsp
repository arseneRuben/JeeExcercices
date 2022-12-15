<%-- 
    Document   : login
    Created on : Dec 4, 2022, 9:47:38 AM
    Author     : isi
--%>

<%@page import="com.isi.cookiespreferences.CookyManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%     
    Cookie userCookie = CookyManager.getCookie(request, "username");
     Cookie rememberMe = CookyManager.getCookie(request, "username");
 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row d-flex justify-content-center">
                <div class="col-md-6">
                    <div class="card px-5 py-5" id="form1">
                        <div class="form-data" v-if="!submitted">
                            <form action="login">
                            <div class="forms-inputs mb-4"> <span>Nom d'usager</span> <input autocomplete="off" type="text" value='<%= userCookie!=null ? userCookie.getValue(): "" %>' name="username" v-bind:class="{'form-control':true, 'is-invalid' : !validEmail(email) && emailBlured}" v-on:blur="emailBlured = true">
                            </div>
                            <div class="forms-inputs mb-4"> <span>Se rappeler de mon nom d'usager</span> <input <%= userCookie!=null ? "checked":"" %>  type="checkbox" name="rememberMe" >
                            </div>
                            <div class="mb-3"> <button v-on:click.stop.prevent="submit" class="btn btn-dark w-100">Login</button> </div>
                            </form>
                        </div>
                      
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
