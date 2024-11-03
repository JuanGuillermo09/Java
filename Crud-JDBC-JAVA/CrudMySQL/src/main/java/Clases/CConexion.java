/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author yohn
 */
public class CConexion {
    
     //Aquí conecta con la Base de Datos, crear una función que devuelve la conexión, para usarla en los diferentes modelos
    
    Connection conectar = null;
    
    String usuario = "root";
    
    String contrasenia = "juan";
    
    String bd = "bdusuarios";
    
    String ip = "localhost";
    
    String puerto = "3306";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar= DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null,"Conexión Correcta a la Base de Datos");  
          
                    
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null," Problemas de Conexión a la Base de Datos, Error: "+ e.toString());
        }
        return conectar;
    }
    
    public void cerrarConnexion(){
    
        try{
        
            if (conectar!= null && !conectar.isClosed()){
        
            conectar.close();
           // JOptionPane.showMessageDialog(null,"Conexxion Cerrada");
        }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Mo se pudo cerrar la conexion");
        
        }
    
    }
    
    
}

