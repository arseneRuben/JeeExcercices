<%-- 
    Document   : exo1
    Created on : Dec 15, 2022, 9:42:21 AM
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">

        <title>Exo1 Page</title>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row d-flex justify-content-center">
                <div class="col-md-6">
                    <div class="card px-5 py-5" id="form1">
                        <div class="form-data">
                            <form action="login">
                                <div class="forms-inputs mb-4"> <span>Username</span> <input autocomplete="off" type="text"  name="username"/>
                                </div>
                                <div class="forms-inputs mb-4"> <span>Password</span> <input  type="password" name="password"/>
                                </div>
                                <div class="mb-3"> <button  class="btn btn-dark w-100">Login</button> </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
