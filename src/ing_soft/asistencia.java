
package ing_soft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class asistencia {
    
    //depndemos de la feccha, inicar clases, finalizar clases, que significa que inicia la clase
    //verificar si el laumno esta en la bd, si esta se le agrega a la asitencia y si no esta en la bd, se le agrega a ese gruipo
    //en el que esta ka clase, y se le agrega la asitencia de se dia
    //la asitencia depende dela clase y del alumno , pero la clase depende de la fecha
    //otenert id clase, de alumno, de insidencia de asitencia
    
    
    //crear una calse y guardar su id en una varuiable para poder meter a todos los datos en la tabla asistenica
    
        public boolean Registrar_Clase(String fecha, String hora) {    
        
 
            // Establecer la conexión
            conecction cone = new conecction();
            // Consulta SQL para la inserción
            try (Connection  con =  cone.ConectarBD()) {
                // Consulta SQL para la inserción
                String consulta = "INSERT INTO clase (fecha_clas, hora_clase) VALUES (?,?)";
                // Preparar la declaración SQL
                try (PreparedStatement declaracion = con.prepareStatement(consulta)) {
                    // Establecer los valores de los nuevos datos en la declaración
                    declaracion.setString(1,  fecha);
                    declaracion.setString(2, hora);

                    // Ejecutar la consulta
                    declaracion.executeUpdate();
                }
                // Cerrar la conexión

            System.out.println("Datos insertados correctamente.");
             return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        }
        
        
        public static int obtenerIdClase(String fecha, String hora) {
        int idClase = -1;
        conecction cone = new conecction();

        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_clase FROM clase WHERE fecha_clase = ? AND hora_clase = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, fecha);
                statement.setString(2, hora);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        idClase = resultSet.getInt("id_clase");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return idClase;
    }
 
      public boolean Registrar_Asistencia(String nom_grupo, String nom_alum, String boleta_alum,  String fecha, String hora_inicio, String hora_entrada) {
          
          Alumnos.verificarYAgregarAlumno(nom_alum, boleta_alum, nom_grupo);
         
        
 
            // Establecer la conexión
            conecction cone = new conecction();
            // Consulta SQL para la inserción
            try (Connection  con =  cone.ConectarBD()) {
                // Consulta SQL para la inserción
                String consulta = "INSERT INTO asistencia (id_clas, id_alum, entrada) VALUES (?,?,?)";
                // Preparar la declaración SQL
                try (PreparedStatement declaracion = con.prepareStatement(consulta)) {
                    // Establecer los valores de los nuevos datos en la declaración
                    declaracion.setInt(1,  obtenerIdClase(fecha, hora_inicio));
                    declaracion.setInt(2,  Alumnos.obtenerIdAlumno(boleta_alum));
                    declaracion.setString(3,  hora_entrada);


                    // Ejecutar la consulta
                    declaracion.executeUpdate();
                }
                // Cerrar la conexión

            System.out.println("Datos insertados correctamente.");
             return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        }
        
        
        
        
        
        

}
