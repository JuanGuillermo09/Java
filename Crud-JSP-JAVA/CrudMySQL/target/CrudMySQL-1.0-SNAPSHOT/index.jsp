<%-- 
    Document   : index
    Created on : Aug 1, 2024, 8:29:10 PM
    Author     : yohn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .botones-container{
                text-align: center;
                
            }
            
            .botones-container button{
                margin: 5px;
            }
        </style>
    </head>
    <body>
        <h1>CRUD JSP + MYSQL</h1>
        <h2>Menu Principal</h2>
        
               
        <div class="botones-container">
            
            
            
           
                
                <a  href="ServletUsuario?action=mostrar"><button>Mostrar Usuarios</button></a>
                
                <a href="ServletUsuario?action=guardar"><button>Guardar Usuarios</button></a>
                            
                <a href="ServletUsuario?action=modificar"><button>Modificar Usuarios</button></a>
                            
                <a href="ServletUsuario?action=eliminar"><button>Eliminar Usuarios</button></a>           
            
            
                        
        </div>
            
    </body>
</html>
