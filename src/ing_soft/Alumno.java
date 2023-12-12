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
public class Alumno {
    
    
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
