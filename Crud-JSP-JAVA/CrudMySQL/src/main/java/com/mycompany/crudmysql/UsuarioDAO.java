/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudmysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yohn
 */
public class UsuarioDAO {
    
    public  void InsertarUsuario(String nombre, String appaterno, String apmaterno, int edad) {
        
        Connection conn = null;
        
        PreparedStatement stmt = null;
        
        
        try {
            conn = ConexionDAO.obtenerConexion();
            
            String sql = "insert into usuarios(nombres,appaterno,apmaternos,edad)values (?,?,?,?);";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nombre);
            stmt.setString(2, appaterno);
            stmt.setString(3, apmaterno);
            stmt.setInt(4, edad);
            
            stmt.executeUpdate();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        finally{
        
            ConexionDAO.CerrarConexion(conn);
            
            try {
                if (stmt != null) {
                    
                    stmt.close();
                    
                }
            } catch (SQLException ex) {
                
                ex.printStackTrace();
                
            }
        
        }
    }
    
    public  List<EntidadUsuario> obtenerUsuarios(){
        
        List<EntidadUsuario> usuarios = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = ConexionDAO.obtenerConexion();
            String sql = "select * from usuarios;";
            stmt = conn.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                 EntidadUsuario usuario = new EntidadUsuario();
                 usuario.setId(rs.getInt("id"));
                 usuario.setNombres(rs.getString("nombres"));
                 usuario.setAppaterno(rs.getString("appaterno"));
                 usuario.setApmaterno(rs.getString("apmaternos"));
                 usuario.setEdad(rs.getInt("edad"));
                 usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        finally{
        
            ConexionDAO.CerrarConexion(conn);
            
            try {
                if (stmt != null) {
                    
                    stmt.close();
                    
                }
            } catch ( SQLException ex) {
                
                ex.printStackTrace();
            }
        }
        
        return usuarios;
        
    }
    
    public  void ModificarUsuario(int id, String nombre, String appaterno, String apmaterno, int edad) {
        
        Connection conn = null;
        
        PreparedStatement stmt = null;
        
        
        try {
            conn = ConexionDAO.obtenerConexion();
            
            String sql = "update usuarios set nombres=?,appaterno=?,apmaternos=?,edad=? where id =?;";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nombre);
            stmt.setString(2, appaterno);
            stmt.setString(3, apmaterno);
            stmt.setInt(4, edad);
            stmt.setInt(5, id);
            
            stmt.executeUpdate();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        finally{
        
            ConexionDAO.CerrarConexion(conn);
            
            try {
                if (stmt != null) {
                    
                    stmt.close();
                    
                }
            } catch (SQLException ex) {
                
                ex.printStackTrace();
                
            }
        
        }
    }
    
    public  void EliminarUsuario(int id) {
        
        Connection conn = null;
        
        PreparedStatement stmt = null;
        
        
        try {
            conn = ConexionDAO.obtenerConexion();
            
            String sql = "delete from usuarios where id = ?;";
            stmt = conn.prepareStatement(sql);
            
            
            stmt.setInt(1, id);
            
            stmt.executeUpdate();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        finally{
        
            ConexionDAO.CerrarConexion(conn);
            
            try {
                if (stmt != null) {
                    
                    stmt.close();
                    
                }
            } catch (SQLException ex) {
                
                ex.printStackTrace();
                
            }
        
        }
    }
    
}
