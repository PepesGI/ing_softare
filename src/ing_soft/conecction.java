/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ing_soft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author bob_p
 */
public class conecction {
    
    // Información de la base de datos
    private static final String host = "jdbc:mysql://bd-control-asistencia.cizxfjuhhtmw.us-east-2.rds.amazonaws.com:3306/";///ip del la base de datos
    private static final String user = "ing_soft_user";///usuario
    private static final String pass = "mypassword";//contrsena
    private static final String bd = "bd_control_asistencia";
    
    
    public Connection ConectarBD(){
        try {
            // Establecer la conexión
            System.out.println("Conexion correcta");
            return DriverManager.getConnection(host+bd, user, pass);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null; // Manejo básico de errores, en un entorno de producción, maneja las excepciones de manera más adecuada.
        
        }
        
  
    } 
    
    public void Desconectar(Connection cb){
        try {
            cb.close();
            System.out.println("Desconectado");

        } catch (SQLException e) {
            System.out.println("Desconectado");
            throw new RuntimeException(e);

        }
        
        
    
    }

    
    
    
}
