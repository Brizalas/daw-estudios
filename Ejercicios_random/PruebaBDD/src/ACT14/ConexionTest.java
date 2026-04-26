package ACT14;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author cristiancantero
 */


public class ConexionTest {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String password = "12345678"; 

            Connection con = DriverManager.getConnection(url, user, password);
            crearBDD(con);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", user, password);
            crearTabla(con);
//            insertarAlumno(con);
            borrarAlumno(con);
            listarAlumnos(con);
            actualizarAlumno(con);

            System.out.println("Conexion OK 😎");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void crearBDD(Connection con) {
    try {
        String sql = "CREATE DATABASE IF NOT EXISTS escuela;";
        con.createStatement().executeUpdate(sql);
        System.out.println("Base de datos creada o ya existente 😎");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public static void crearTabla(Connection con){
        try{
            String sql = "CREATE TABLE IF NOT EXISTS alumnos ("+
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(50), " +
                    "edad INT, " +
                    "curso VARCHAR(50), " +
                    "media DOUBLE)";
            con.createStatement().executeUpdate(sql);
            System.out.println("Tabla creada ✌🏽");
                    
                    
                    }catch (Exception e){
                        e.printStackTrace();
                    }
    }
    
    public static void insertarAlumno(Connection con){
        try{
            String sql = "INSERT INTO alumnos VALUES (1, 'Cristian', 25, 'DAW', 9.5)";
            con.createStatement().executeUpdate(sql);
            System.out.println("Alumno insertado ✌🏽");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void listarAlumnos (Connection con) {
        try{
            String sql = "SELECT * FROM alumnos";
            ResultSet rs = con.createStatement().executeQuery(sql);
            
            while (rs.next()){
                System.out.println(
                rs.getInt("id") + " - " +
                rs.getString("nombre") + " - " +
                        rs.getInt("edad") + " - " +
                        rs.getString("curso") + " - " +
                        rs.getDouble("media")
                        );
             }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void actualizarAlumno(Connection con){
        try{
            String sql = "UPDATE alumnos SET media = 10 WHERE id = 1";
            con.createStatement().executeUpdate(sql);
            System.out.println("Alumno actualizado 😎");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void borrarAlumno (Connection con){
        try{
            String sql = "DELETE FROM alumnos WHERE id = 1";
            con.createStatement().executeUpdate(sql);
            System.out.println("Alumno borrado 💀");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
