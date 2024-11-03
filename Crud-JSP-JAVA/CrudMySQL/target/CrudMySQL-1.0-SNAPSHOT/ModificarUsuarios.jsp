<%-- 
    Document   : ModificarUsuarios
    Created on : Aug 1, 2024, 9:17:45 PM
    Author     : yohn
--%>

<%@page import="java.util.List"%>
<%@page import="com.mycompany.crudmysql.EntidadUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h1>Modificar Usuarios</h1>
        
        <a href="index.jsp">Regresar al Menu</a>
        
        <form action="ServletUsuario" method="POST">
            <p> <label>Id:</label><input type="text" name="Id" id="idId" readonly> </p>
            <p> <label>Hombres:</label><input type="text" name="Nombres" id="idNombres"> </p>
            <p> <label>ApPaterno:</label><input type="text" name="ApPaterno" id="idAppaterno"> </p>
            <p> <label>ApMaterno:</label><input type="text" name="ApMaterno" id="idApmaterno"> </p>
            <p> <label>Edad:</label><input type="number" name="Edad" id="idEdad"> </p>
            
            <button type="submit" name="action" value="modificar">Modificar </button>   
        </form>
        
        <h3>Lista de Usuarios</h3>
          
        <table border="1" id="MyTabla">
                <tr>
                    <th>Id</th>
                    <th>Nombres</th>
                    <th>ApPaterno</th>
                    <th>ApMaterno</th>
                    <th>Edad</th>
                    <th>Accion</th>
                </tr>
           
                <% 
                  List<EntidadUsuario> usuarios = (List<EntidadUsuario>) request.getAttribute("ListaUsuarios");
                   

                  for (EntidadUsuario usuario:usuarios) {
                                                                                       
                      

                %>
                
                <tr onclick="Seleccionar(this)">
                    <td> <%= usuario.getId()%> </td>
                    <td> <%= usuario.getNombres()%> </td> 
                    <td> <%= usuario.getAppaterno()%> </td> 
                    <td> <%= usuario.getApmaterno()%> </td> 
                    <td> <%= usuario.getEdad()%> </td> 
                    <td>
                        <button type="submit" onClick="Seleccionar(this)">Seleccionar</button>
                    </td>
                </tr>
                
           <% 
                 }

                %>
        </table>
    </body>
</html>

<script>
    function Seleccionar(btn) {
            var row = btn.parentNode.parentNode;
            var cells = row.cells;
            document.getElementById("idId").value = cells[0].innerHTML.trim();
            document.getElementById("idNombres").value = cells[1].innerHTML.trim();
            document.getElementById("idAppaterno").value = cells[2].innerHTML.trim();
            document.getElementById("idApmaterno").value = cells[3].innerHTML.trim();
            document.getElementById("idEdad").value = cells[4].innerHTML.trim();
        }
</script>
