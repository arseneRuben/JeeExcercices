<%-- 
    Document   : login
    Created on : Dec 4, 2022, 9:47:38 AM
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <form action="preference">
                                <div class="forms-inputs mb-4"> <span>Nom d'usager</span> <input autocomplete="off" type="text"  name="username"/>
                                </div>
                                <div class="forms-inputs mb-4"> <span>Couleur preferee</span> <input  type="text" name="color"/>
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
