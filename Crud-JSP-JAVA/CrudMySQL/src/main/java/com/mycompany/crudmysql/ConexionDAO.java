/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudmysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author yohn
 */
public class ConexionDAO {
    
    private static final String url ="jdbc:mysql://localhost:3306/dbus";
    
    private static final String username ="root";
            
    private static final String pass="juan";
    
    
    public static Connection obtenerConexion() {
        
        Connection conn = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,pass);
            
        } catch (Exception e) {
            
            System.out.println("Error al conectarnos:"+ e.toString());
        }
        
        return conn;
        
    }
    
    
    public static void CerrarConexion(Connection conn) {
         
        try {
            if (conn != null) {
                
                conn.close();
                
            }
        } catch (Exception e) {
            
            System.out.println("Error al conectarnos:"+ e.toString());
        }
    }
            
    
}
