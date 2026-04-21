package ACT14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.ResultSet;

/**
 *
 * @author cristiancantero
 */
public class GestionBDD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String password = "12345678";

            Connection con = DriverManager.getConnection(url, user, password);
            crearBDD(con); //crear la BDD

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", user, password);
            crearTablaAlumnos(con); //crear la tabla

//            con.createStatement().executeQuery("SELECT 1");
//            System.out.println("Conexión . "); ==> esto es una prueba técnica


            // -----------MENÚ DEL EJERCICIO ------------------- 
            boolean salir = false;
            do {
                try {

                    System.out.println("===Menú principal===");
                    System.out.println("1. Ingresar alumno"); 
                    System.out.println("2. Actualizar alumno");
                    System.out.println("3. Borrar alumno");
                    System.out.println("4. Listar alumnos");
                    System.out.println("0. Salir");
                    int pocion = Integer.parseInt(sc.nextLine());

                    switch (pocion) {
                        case 1:
                            insertarAlumno(con);
                            break;
                        case 2:
                            actualizarAlumno(con, sc);
                            break;
                        case 3:
                            borrarAlumno(con, sc);
                            break;
                        case 4:
                            listarAlumnos(con);

                            break;

                        case 0:
                            System.out.println("Adios.");
                            salir = true;
                            break;
                        default:
                            System.out.println("Introduce una opoción válida");
                    }
                } catch (Exception e) {
                    System.out.println("Introduce un número para el menú");
                }
            } while (!salir);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void crearBDD(Connection con) {
        try {
            String sql = "CREATE DATABASE IF NOT EXISTS escuela;";
            con.createStatement().executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearTablaAlumnos(Connection con) {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS alumnos ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nombre VARCHAR(50), "
                    + "edad INT, "
                    + "curso VARCHAR(50), "
                    + "media DOUBLE)";
            con.createStatement().executeUpdate(sql);
            System.out.println("tabla creada");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Alumno ingresarAlumno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("curso: ");
        String curso = sc.nextLine();
        System.out.println("media: ");
        Double media = sc.nextDouble();

        return new Alumno(0, nombre, edad, curso, media);

    }

    public static void insertarAlumno(Connection con) {
        try {
            Alumno a = ingresarAlumno();
            String sql = "INSERT INTO alumnos (nombre, edad, curso, media) VALUES ("
                    + "'" + a.getNombre() + "', "
                    + a.getEdad() + ", '"
                    + a.getCurso() + "', "
                    + a.getMedia() + ")";
            con.createStatement().executeUpdate(sql);
            System.out.println("Alumno insertado con éxito");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void actualizarAlumno(Connection con, Scanner sc) {
        try {
            System.out.println("Introduce el ID del alumno a modificar: ");
            int idModificar = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce de nuevo el nombre: ");
            String nombreNuevo = sc.nextLine();
            System.out.println("Introduce la edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce el curso: ");
            String curso = sc.nextLine();
            System.out.println("Introduce la media");
            double media = Double.parseDouble(sc.nextLine());

            String sql = "UPDATE alumnos SET "
                    + "nombre = '" + nombreNuevo + "', "
                    + "edad = " + edad + ", "
                    + "curso = '" + curso + "', "
                    + "media = " + media
                    + " WHERE id = " + idModificar;

            int filas = con.createStatement().executeUpdate(sql);

            if (filas > 0) {
                System.out.println("Alumno actualizado correctamente.");
            } else {
                System.out.println("No existe un alumno con ese ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void borrarAlumno(Connection con, Scanner sc) {
        try {
            System.out.println("Introduce el ID del alumno a borrar");
            int idBorrar = Integer.parseInt(sc.nextLine());

            String sql = "DELETE FROM alumnos WHERE id = " + idBorrar;
            int filas = con.createStatement().executeUpdate(sql);

            if (filas > 0) {
                System.out.println("Alumno borrado correctamente");
            } else {
                System.out.println("No existe un alumno con este ID");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void listarAlumnos(Connection con) {
        try {
            String sql = "SELECT * FROM alumnos";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - "
                        + rs.getString("nombre") + " - "
                        + rs.getInt("edad") + " - "
                        + rs.getString("curso") + " - "
                        + rs.getDouble("media")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
