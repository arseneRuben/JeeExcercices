<%-- 
    Document   : portal
    Created on : Dec 9, 2022, 8:08:07 AM
    Author     : isi
--%>

<%@page import="com.isi.exosessiontodolist.Item"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="todo.css">
        <title>TODO</title>
    </head>

    <body>
        <main>
            <h1>TODO</h1>
            <%
                List<Item> items = null;
                if (session != null) {
                    items = (List<Item>) session.getAttribute("items");
                }
            %>
            <section class="section-form">
                <h3>Ajouter une tache</h3>
                <form action="todo" method="post">
                    <div>
                        <input type="text" name="taskInput" id="taskInput" size="85">
                        <button>add</button>
                    </div>
                </form>
            </section>

            <section class="section-list">
                <h3>List de tache <span id="taskTotal"></span></h3>
                <ol id="taskList">
                    <%
                        if (items != null) {
                            for (Item item : items) {
                    %>
                    <li><%=item.getName()%></li>
                    <%
                                }
                            }
                     %>
                </ol>

                <div>
                    <button disabled id="deleteButton">Supression</button>
                </div>
            </section>
        </main>
    </body>

</html>