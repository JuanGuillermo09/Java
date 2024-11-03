<%-- 
    Document   : MostrarUsuarios
    Created on : Aug 1, 2024, 9:01:52 PM
    Author     : yohn
--%>

<%@page import="com.mycompany.crudmysql.EntidadUsuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla de Usuarios</h1>
        
        <a href="index.jsp">Regresar al Menu</a>
        
        <table border="1">
                <tr>
                    <th>Id</th>
                    <th>Nombres</th>
                    <th>ApPaterno</th>
                    <th>ApMaterno</th>
                    <th>Edad</th>
                </tr>
           
                <% 
                  List<EntidadUsuario> usuarios = (List<EntidadUsuario>) request.getAttribute("ListaUsuarios");
                   

                  for (EntidadUsuario usuario:usuarios) {
                                                                                       
                      

                %>
                
                <tr>
                    <td> <%= usuario.getId()%> </td>
                    <td> <%= usuario.getNombres()%> </td> 
                    <td> <%= usuario.getAppaterno()%> </td> 
                    <td> <%= usuario.getApmaterno()%> </td> 
                    <td> <%= usuario.getEdad()%> </td> 
                </tr>
                
           <% 
                 }

                %>
        </table>

    </body>
</html>
