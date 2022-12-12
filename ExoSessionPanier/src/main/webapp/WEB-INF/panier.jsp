<%-- 
    Document   : portal
    Created on : Dec 9, 2022, 8:08:07 AM
    Author     : isi
--%>

<%@page import="com.isi.exosessionpanier.ProductManager"%>
<%@page import="java.util.Map"%>
<%@page import="com.isi.exosessionpanier.Product"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <%
        // Collecte a la position id les quantites de produit pd.id
         HashMap<Integer, Integer> panier=null;
        ArrayList<Product> products = ProductManager.products;
        if (session != null) {
            panier = ( HashMap<Integer, Integer>)session.getAttribute("cart");
        }
    %>
    <body style="width: 100%; margin: auto">
        <div class="container mt-5">
            <div class="row d-flex justify-content-center">
                <div class="col-md-6">
                    <h2>Panier client </h2>
                    <table class="table table-bordered">
                        <thead>
                        <tr><td>Designation</td><td>Stock</td><td>Format</td><td>Prix</td><td>Panier</td></tr>
                        </thead>
                        <tbody>
                            <%
                                for(Product product: products){
                            %>
                                <tr><td><%= product.getDescription() %></td>
                                    <td><%= product.getStock()%></td>
                                    <td><%= product.getDescription() %></td>
                                    <td><%= product.getPrice() %></td>
                                    <td><a class="btn link-success" href="cart?id=<%=product.getId()%>action=add">+</a><input type="number" value = "<%=panier.get(product.getId())%>" id="<%=product.getId()%>" /><a class="btn link-danger" href="cart?id=<%=product.getId()%>action=minus">-</a> </td>
                                </tr>
                            <%
                                }
                            %>
                            <tr></tr>
                        </tbody>
                    </table>
                </div>


            </div><!-- comment -->
        </div>
    </body>
</html>
