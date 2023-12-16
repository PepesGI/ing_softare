/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ing_soft;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author naomi
 */
public class Alumnos {
    
    
    public boolean Registrar_Alumno(String nom_alum, String boleta_alum, String nom_grupo) {    
        
        try {
            // Establecer la conexión
            conecction cone = new conecction();
            // Consulta SQL para la inserción
            try (Connection  con =  cone.ConectarBD()) {
                // Consulta SQL para la inserción
                String consulta = "INSERT INTO alumno (id_grupo ,nom_alum, boleta_alum) VALUES (?, ?, ?)";
                // Preparar la declaración SQL
                try (PreparedStatement declaracion = con.prepareStatement(consulta)) {
                    // Establecer los valores de los nuevos datos en la declaración
                    declaracion.setInt(1, obtenerIdGrupo(nom_grupo));
                    declaracion.setString(2, nom_alum);
                    declaracion.setString(3, boleta_alum);
                    
                    
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
    
    
    
    
    
    
    private static int obtenerIdGrupo(String nom_grupo) {
        conecction cone = new conecction();
        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_grupo FROM grupo WHERE nom_grupo = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_grupo);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getInt("id_grupo");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1; // Valor por defecto si el usuario no existe o hay un error
    }
    
    }