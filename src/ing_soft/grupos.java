
package ing_soft;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class grupos {
    
    
    public boolean Crear_grupo(String nom_prof, String nom_mat, String nom_grupo, String ciclo){
        
        boolean bnd=true;
        
        while(bnd){
            
            if (!(verificarYAgregarPofesor(nom_prof) || verificarYAgregarMateria(nom_mat) || verificarYAgregarCiclo(ciclo))) {
                
            System.out.println("Todas las variables son falsas al mismo tiempo.");
            bnd=false;
            
        } else {
                
            bnd=true;
        }
            
        }
        
        conecction cone = new conecction();
        
        
        try (Connection  con =  cone.ConectarBD() ) {
            String insercion = "INSERT INTO grupo (id_prof, id_mat, id_ciclo, nom_grupo) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = con.prepareStatement(insercion)) {
                statement.setInt(1, obtenerIdProfesor(nom_prof) );
                statement.setInt(2, obtenerIdMat(nom_mat));
                statement.setInt(3, obtenerIdCiclo(ciclo));
                statement.setString(4, nom_grupo);

                int filasAfectadas = statement.executeUpdate();
                return filasAfectadas > 0;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
      
        
        
        
        
        
        
}
    
    
    private static boolean verificarYAgregarPofesor(String nom_prof) {
        
        conecction cone = new conecction();
        try ( Connection  con =  cone.ConectarBD() ) {
            String consulta = "SELECT COUNT(*) AS count FROM profesor WHERE nom_prof = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_prof);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int count = resultSet.getInt("count");
                        if (count > 0) {
                            System.out.println("El usuario ya está registrado.");
                            return false; // El usuario ya existe
                        } else {
                            // El usuario no existe, agregarlo
                            String insercion = "INSERT INTO profesor (nom_prof) VALUES (?)";
                            try (PreparedStatement insertStatement = con.prepareStatement(insercion)) {
                                insertStatement.setString(1, nom_prof);
                                insertStatement.executeUpdate();
                                System.out.println("Usuario agregado correctamente.");
                                return true; // Operación completada correctamente
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false; // Error en la operación
        
    }
    private static boolean verificarYAgregarMateria(String nom_mat) {
        
        conecction cone = new conecction();
        try ( Connection  con =  cone.ConectarBD() ) {
            String consulta = "SELECT COUNT(*) AS count FROM profesor WHERE nom_mat = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_mat);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int count = resultSet.getInt("count");
                        if (count > 0) {
                            System.out.println("El usuario ya está registrado.");
                            return false; // El usuario ya existe
                        } else {
                            // El usuario no existe, agregarlo
                            String insercion = "INSERT INTO profesor (nom_mat) VALUES (?)";
                            try (PreparedStatement insertStatement = con.prepareStatement(insercion)) {
                                insertStatement.setString(1, nom_mat);
                                insertStatement.executeUpdate();
                                System.out.println("Usuario agregado correctamente.");
                                return true; // Operación completada correctamente
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false; // Error en la operación
    }
    
    private static boolean verificarYAgregarCiclo(String ciclo) {
        
        conecction cone = new conecction();
        try ( Connection  con =  cone.ConectarBD() ) {
            String consulta = "SELECT COUNT(*) AS count FROM ciclo WHERE ciclo = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, ciclo);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int count = resultSet.getInt("count");
                        if (count > 0) {
                            System.out.println("El usuario ya está registrado.");
                            return false; // El usuario ya existe
                        } else {
                            // El usuario no existe, agregarlo
                            String insercion = "INSERT INTO ciclo (ciclo) VALUES (?)";
                            try (PreparedStatement insertStatement = con.prepareStatement(insercion)) {
                                insertStatement.setString(1, ciclo);
                                insertStatement.executeUpdate();
                                System.out.println("Usuario agregado correctamente.");
                                return true; // Operación completada correctamente
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false; // Error en la operación
    }
    
    
      private static int obtenerIdProfesor(String nom_prof) {
        conecction cone = new conecction();
        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_prof FROM profesor WHERE nom_prof = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_prof);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getInt("id_prof");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1; // Valor por defecto si el usuario no existe o hay un error
    }
      private static int obtenerIdMat(String nom_mat) {
        conecction cone = new conecction();
        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_mat FROM materia WHERE nom_mat = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_mat);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getInt("id_mat");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1; // Valor por defecto si el usuario no existe o hay un error
    }
 
      private static int obtenerIdCiclo(String ciclo) {
        conecction cone = new conecction();
        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_ciclo FROM ciclo WHERE ciclo = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, ciclo);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getInt("id_ciclo");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1; // Valor por defecto si el usuario no existe o hay un error
    }
    
      
      
       public static void modificarProfesor(String nom_prof, String nom_grupo) {
           
            boolean bnd=true;
        
        while(bnd){
            
            if (!(verificarYAgregarPofesor(nom_prof))) {
                
            System.out.println("Todas las variables son falsas al mismo tiempo.");
            bnd=false;
            
        } else {
                
            bnd=true;
        }
            
        }
           

        conecction cone = new conecction();
        
        
        try (Connection  con =  cone.ConectarBD()) {
            
            String consultaSQL = "UPDATE grupo SET id_prof = ? WHERE nom_grupo = ?" ;
            PreparedStatement preparedStatement = con.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, obtenerIdProfesor(nom_prof));
            preparedStatement.setString(2, nom_grupo);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Campo actualizado exitosamente.");
            } else {
                System.out.println("No se pudo actualizar el campo.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
      
       
       
       
       
       
       
        public static void modificarCiclo(String ciclo, String nom_grupo) {
           
            boolean bnd=true;
        
        while(bnd){
            
            if (!(verificarYAgregarCiclo(ciclo))) {
                
            System.out.println("Todas las variables son falsas al mismo tiempo.");
            bnd=false;
            
        } else {
                
            bnd=true;
        }
            
        }
           

        conecction cone = new conecction();
        
        
        try (Connection  con =  cone.ConectarBD()) {
            
            String consultaSQL = "UPDATE grupo SET id_ciclo = ? WHERE nom_grupo = ?" ;
            PreparedStatement preparedStatement = con.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, obtenerIdCiclo(ciclo));
            preparedStatement.setString(2, nom_grupo);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Campo actualizado exitosamente.");
            } else {
                System.out.println("No se pudo actualizar el campo.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }

      
      
        
        
        
        
        
     public static void modificarMateria(String nom_mat, String nom_grupo) {
           
            boolean bnd=true;
        
        while(bnd){
            
            if (!(verificarYAgregarMateria(nom_mat))) {
                
            System.out.println("Todas las variables son falsas al mismo tiempo.");
            bnd=false;
            
        } else {
                
            bnd=true;
        }
            
        }
           

        conecction cone = new conecction();
        
        
        try (Connection  con =  cone.ConectarBD()) {
            
            String consultaSQL = "UPDATE grupo SET id_mat = ? WHERE nom_grupo = ?" ;
            PreparedStatement preparedStatement = con.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, obtenerIdMat(nom_mat));
            preparedStatement.setString(2, nom_grupo);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Campo actualizado exitosamente.");
            } else {
                System.out.println("No se pudo actualizar el campo.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }

     
     
     
     
     
     
     public static void eliminarTabla(String nombreTabla) {
        
        conecction cone = new conecction();
        Statement statement = null;

        try  (Connection  con =  cone.ConectarBD()) { 
            statement = (Statement) (con.createStatement());

            // Sentencia SQL para eliminar la tabla
            String sql = "DROP TABLE " + nombreTabla;

            // Ejecutar la sentencia
            statement.executeUpdate(sql);

            System.out.println("Tabla eliminada exitosamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
}
