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
    
    public static Connection ConectarBD(){
        Connection conexion;
        String host = "jdbc:mysql://localhost/";///ip del la base de datos
        String user = "root";///usuario
        String pass = "";//contrse;a
        String bd = "bd_control_asistencia";
        
        System.out.println("Conectando...");
        
        try {
            conexion = DriverManager.getConnection(host+bd,user,pass);
             System.out.println("Conexion exitosa");
            
        } catch (SQLException e) {
              System.out.println(e.getMessage());
              throw new RuntimeException(e);
        }
        
    return conexion;
    
    } 
    
    public static void Desconectar(Connection cb){
        try {
            cb.close();
            System.out.println("Desconectado");

        } catch (SQLException e) {
            System.out.println("Desconectado");
            throw new RuntimeException(e);

        }
        
        
    
    }

    
    
    
}
