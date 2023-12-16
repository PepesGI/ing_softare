/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ing_soft;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

/**
 *
 * @author bob_p
 */
public class Alumno {
    
    
       public boolean Registrar_Alum(String nombreIngresado, String boletaIngresada, String nom_grupo) {    
        
        try {
            // Establecer la conexión
            conecction cone = new conecction();
            // Consulta SQL para la inserción
            try (Connection  con =  cone.ConectarBD()) {
                // Consulta SQL para la inserción
                String consulta = "INSERT INTO alumno (id_grupo, nom_alum, boleta_alum) VALUES (?, ?, ?)";
                // Preparar la declaración SQL
                try (PreparedStatement declaracion = con.prepareStatement(consulta)) {
                    // Establecer los valores de los nuevos datos en la declaración
                    declaracion.setInt(1, grupos.obtenerIdGrupo(nom_grupo));
                    declaracion.setString(2, nombreIngresado);
                    declaracion.setString(3, boletaIngresada);
                    
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

    
    
    
    
    
    
    
    
    
    
}
