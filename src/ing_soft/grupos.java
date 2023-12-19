
package ing_soft;

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
                System.out.println("Estamos agregfandp datps.");
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
                            System.out.println("El profesor ya esta registrado.");
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
            String consulta = "SELECT COUNT(*) AS count FROM materia WHERE nom_mat = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_mat);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int count = resultSet.getInt("count");
                        if (count > 0) {
                            System.out.println("La materia ya se registro antes.");
                            return false; // El usuario ya existe
                        } else {
                            // El usuario no existe, agregarlo
                            String insercion = "INSERT INTO materia (nom_mat) VALUES (?)";
                            try (PreparedStatement insertStatement = con.prepareStatement(insercion)) {
                                insertStatement.setString(1, nom_mat);
                                insertStatement.executeUpdate();
                                System.out.println("Materiaagregado correctamente.");
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
                            System.out.println("El ciclo ya está registrado.");
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
      
      public static int obtenerIdGrupo(String nom_grupo) {
          
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
      
      
      
          public boolean Verificar_duplicado(String nombreGrupo) {
        
   
            // Establecer la conexión
            conecction cone = new conecction();
            // Consulta SQL para la inserción
            try (Connection  con =  cone.ConectarBD()) {
                // Consulta SQL para la inserción
                String consulta = "SELECT COUNT(*) AS contador FROM grupo WHERE nom_grupo = ? ";

                // Preparar la declaración SQL
                 try (PreparedStatement declaracion = con.prepareStatement(consulta)) {
                // Establecer los valores de los datos en la declaración
                declaracion.setString(1, nombreGrupo);

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
     
     
     
      public static String obtenerNombreProfesor(String nom_grupo) {
        conecction cone = new conecction();
        int id_prof = 0;
        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_prof FROM grupo WHERE nom_grupo = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_grupo);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        id_prof = resultSet.getInt("id_prof");
                    }
                }
            }
            
            String consulta2 = "SELECT nom_prof FROM profesor WHERE id_prof = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta2)) {
                statement.setInt(1, id_prof);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                      return  resultSet.getString("nom_prof");
                    }
                }
            }catch (SQLException e) {
            System.out.println(e);
        }
            
            
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null; // Valor por defecto si el usuario no existe o hay un error
    }
      
      
            public static String obtenerNombreCiclo(String nom_grupo) {
        conecction cone = new conecction();
        int id_ciclo = 0;
        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_ciclo FROM grupo WHERE nom_grupo = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_grupo);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        id_ciclo = resultSet.getInt("id_ciclo");
                    }
                }
            }
            
            String consulta2 = "SELECT ciclo FROM ciclo WHERE id_ciclo = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta2)) {
                statement.setInt(1, id_ciclo);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                      return  resultSet.getString("ciclo");
                    }
                }
            }catch (SQLException e) {
            System.out.println(e);
        }
            
            
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null; // Valor por defecto si el usuario no existe o hay un error
    }
 
                  public static String obtenerNombreMateria(String nom_grupo) {
        conecction cone = new conecction();
        int id_mat = 0;
        try (Connection  con =  cone.ConectarBD()) {
            String consulta = "SELECT id_mat FROM grupo WHERE nom_grupo = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta)) {
                statement.setString(1, nom_grupo);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                         id_mat = resultSet.getInt("id_mat");
                    }
                }
            }
            
            String consulta2 = "SELECT nom_mat FROM materia WHERE id_mat = ?";
            try (PreparedStatement statement = con.prepareStatement(consulta2)) {
                statement.setInt(1, id_mat);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                      return  resultSet.getString("nom_mat");
                    }
                }
            }catch (SQLException e) {
            System.out.println(e);
        }
            
            
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null; // Valor por defecto si el usuario no existe o hay un error
    }
            
            
            
}
