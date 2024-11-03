<%-- 
    Document   : GuardarUsuarios
    Created on : Aug 1, 2024, 9:07:02 PM
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
        <h1>Guardar Usuarios</h1>
        
        <a href="index.jsp">Regresar al Menu</a>
        
        <form action="ServletUsuario"method="POST">
            <p> <label>Hombres:</label><input type="text" name="Nombres"> </p>
            <p> <label>ApPaterno:</label><input type="text" name="ApPaterno"> </p>
            <p> <label>ApMaterno:</label><input type="text" name="ApMaterno"> </p>
            <p> <label>Edad:</label><input type="number" name="Edad"> </p>
            
            <button type="submit" name="action" value="guardar">Guardar </button>         
        </form>
        
        <h3>Lista de Usuarios</h3>
          
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
