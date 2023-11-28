/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ing_soft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bob_p
 */
public class Usuario {
        // Método para registrar usuario
    public boolean Registrar_User(String nombreIngresado, String contraIngresada) {    
        
        try {
            // Establecer la conexión
            conecction cone = new conecction();
            // Consulta SQL para la inserción
            try (Connection  con =  cone.ConectarBD()) {
                // Consulta SQL para la inserción
                String consulta = "INSERT INTO usuario (nom_user, contra_user) VALUES (?, ?)";
                // Preparar la declaración SQL
                try (PreparedStatement declaracion = con.prepareStatement(consulta)) {
                    // Establecer los valores de los nuevos datos en la declaración
                    declaracion.setString(1, nombreIngresado);
                    declaracion.setString(2, contraIngresada);
                    
                    // Ejecutar la consulta
                    declaracion.executeUpdate();
                    
                }
                // Cerrar la conexión
            }

            System.out.println("Datos insertados correctamente.");
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        
    }

    // Método para verificar la contraseña
    public boolean verificar_user(String nombreIngresado, String contraIngresada) {
        
   
            // Establecer la conexión
            conecction cone = new conecction();
            // Consulta SQL para la inserción
            try (Connection  con =  cone.ConectarBD()) {
                // Consulta SQL para la inserción
                String consulta = "SELECT COUNT(*) AS contador FROM usuario WHERE nom_user = ? AND contra_user = ?";

                // Preparar la declaración SQL
                 try (PreparedStatement declaracion = con.prepareStatement(consulta)) {
                // Establecer los valores de los datos en la declaración
                declaracion.setString(1, nombreIngresado);
                declaracion.setString(2, contraIngresada);

                // Ejecutar la consulta
                ResultSet resultado = declaracion.executeQuery();

                // Verificar el resultado
                if (resultado.next()) {
                    int contador = resultado.getInt("contador");
                    return contador > 0; // Devuelve true si existe al menos una coincidencia
                }
            }

            // Cerrar la conexión
            con.close();
        } catch (SQLException e) {
                System.out.println(e);
        }

        return false; // Si ocurre un error o no hay coincidencias
                
        
        }
  
    }
        
     
    
    
    
    

