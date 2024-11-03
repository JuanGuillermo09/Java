/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.crudmysql;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yohn
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if ("mostrar".equals(action)) {
            
            MostrarUsuarios(request, response);
            
        }else if ("guardar".equals(action)) {
            
            MostrarUsuariosGuardar(request, response);
            
        }else if ("modificar".equals(action)) {
            
            MostrarUsuariosModificar(request, response);
            
        }else if ("eliminar".equals(action)) {
            
            MostrarUsuariosEliminar(request, response);
            
        }
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        if ("guardar".equals(action)) {
            
            GuardarUsuarios(request, response);
            
        }else if ("modificar".equals(action)) {
            
            ModificarUsuarios(request, response);
            
        }else if ("eliminar".equals(action)) {
            
            EliminarUsuarios(request, response);
            
        }
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public void GuardarUsuarios(HttpServletRequest request, HttpServletResponse responde)
    throws  ServletException, IOException{
        
        String nombre = request.getParameter("Nombres");
        String appaterno = request.getParameter("ApPaterno");
        String apmaterno = request.getParameter("ApMaterno");
        int edad = Integer.parseInt(request.getParameter("Edad"));
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.InsertarUsuario(nombre, appaterno, apmaterno, edad);
        
        MostrarUsuariosGuardar(request, responde);
        
        
    }
    
    public  void MostrarUsuarios(HttpServletRequest request, HttpServletResponse responde)
    throws  ServletException, IOException{
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        List<EntidadUsuario> usuarios = usuarioDAO.obtenerUsuarios();
        
        request.setAttribute("ListaUsuarios", usuarios);
        
        request.getRequestDispatcher("MostrarUsuarios.jsp").forward(request, responde);
        
    }
    
    public  void MostrarUsuariosGuardar(HttpServletRequest request, HttpServletResponse responde)
    throws  ServletException, IOException{
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        List<EntidadUsuario> usuarios = usuarioDAO.obtenerUsuarios();
        
        request.setAttribute("ListaUsuarios", usuarios);
        
        request.getRequestDispatcher("GuardarUsuarios.jsp").forward(request, responde);
        
    }
    
    public void ModificarUsuarios(HttpServletRequest request, HttpServletResponse responde)
    throws  ServletException, IOException{
        
        int id = Integer.parseInt(request.getParameter("Id"));
        String nombre = request.getParameter("Nombres");
        String appaterno = request.getParameter("ApPaterno");
        String apmaterno = request.getParameter("ApMaterno");
        int edad = Integer.parseInt(request.getParameter("Edad"));
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.ModificarUsuario(id,nombre, appaterno, apmaterno, edad);
        
        MostrarUsuariosModificar(request, responde);
        
        
    }
    
    public  void MostrarUsuariosModificar(HttpServletRequest request, HttpServletResponse responde)
    throws  ServletException, IOException{
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        List<EntidadUsuario> usuarios = usuarioDAO.obtenerUsuarios();
        
        request.setAttribute("ListaUsuarios", usuarios);
        
        request.getRequestDispatcher("ModificarUsuarios.jsp").forward(request, responde);
        
    }
    
    
    public  void MostrarUsuariosEliminar(HttpServletRequest request, HttpServletResponse responde)
    throws  ServletException, IOException{
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        List<EntidadUsuario> usuarios = usuarioDAO.obtenerUsuarios();
        
        request.setAttribute("ListaUsuarios", usuarios);
        
        request.getRequestDispatcher("EliminarUsuarios.jsp").forward(request, responde);
        
    }
    
    public void EliminarUsuarios(HttpServletRequest request, HttpServletResponse responde)
    throws  ServletException, IOException{
        
        int id = Integer.parseInt(request.getParameter("Id"));
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.EliminarUsuario(id);
        
        MostrarUsuariosEliminar(request, responde);
        
        
    }
    
    
    

}
