package Escuela_Musica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //---------------declaración de variables------------------
        //lectura
        Scanner sc = new Scanner(System.in);
        //Se crea una instancia de Escuela
        Escuela escuela = new Escuela();
        //Bandera booleana para controlar la salida del bucle 
        boolean valido = false;
        //mensajiko de apertura
        System.out.println("Bienvenidos a Gestor de Escuelikas de Música");
        //bloque do/while para todo lo demás
        do {
            try {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("--Escoge una opción--");
                System.out.println("1. Registrar alumno");
                System.out.println("2. Registrar profesor");
                System.out.println("3. Asignar profesor");
                System.out.println("4. Listado de alumnos");
                System.out.println("5. Listado de profesores");
                System.out.println("0. Salir");
                System.out.println("------------------------------------------------------------------");
                int opcion = Integer.parseInt(sc.nextLine());
                
                switch(opcion){
                    case 1:
                        registrarAlumno(sc, escuela);
                        break;
                    case 2:
                        registrarProfesor(sc, escuela);
                        break;
                    case 3:
                        asignarProfesorAlAlumno(sc, escuela);
                        break;
                    case 4:
                        escuela.mostrarAlumnos();
                        break;
                    case 5:
                        escuela.mostrarProfesores();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Escoge una opción correcta.");
                                
                }
                

            } catch (Exception e) {
                System.out.println("Error en el main");
            }

        } while (!valido);
    }
    
    //Métodos static para trabajar con el main
    
    public static void registrarAlumno(Scanner sc, Escuela escuela){
        System.out.println("Introduce el nombre: "); String nombre = sc.nextLine();
        System.out.println("Introduce el apellido: "); String apellido = sc.nextLine();
        System.out.println("Introduce el DNI: "); String dni = sc.nextLine();
        System.out.println("Introduce el e-mail: "); String email = sc.nextLine();
        System.out.println("Introduce la suscripción (1. activa/2.sin suscripción"); 
        int suscripcion = Integer.parseInt(sc.nextLine());
        
        // Crear el alumno sin el profesor
        Alumno alu = new Alumno(nombre, apellido, dni,email,suscripcion);
        //guardarlo en la escuela
        escuela.agregarAlumno(alu);
        //confirmación
        System.out.println("Alumno registrado");
    }
    
    public static void registrarProfesor(Scanner sc, Escuela escuela){
        System.out.println("Introduce el nombre: "); String nombre = sc.nextLine();
        System.out.println("Introduce el apellido: "); String apellido = sc.nextLine();
        System.out.println("Introduce el código del profesor: "); 
        int codigoProfesor = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el instrumento: ");
        String intrumento = sc.nextLine();
        System.out.println("Introduce la experiencia: ");
        int experiencia = Integer.parseInt(sc.nextLine());
        //Crear el profesor sin el alumno
        Profesor profe = new Profesor(nombre,apellido,codigoProfesor,intrumento,experiencia);
        
        Profesor profesor = new Profesor();
        escuela.agregarProfesor(profe);
        System.out.println("Profesor registrado");
    }
    
    public static void asignarProfesorAlAlumno(Scanner sc, Escuela escuela){
        System.out.println("Introduce el dni del alumno: "); String dni = sc.nextLine();
        System.out.println("Introduce el condigo del profesor"); int codigoProfesor = Integer.parseInt(sc.nextLine());
        
        escuela.asignarProfesor(dni, codigoProfesor);
        
        System.out.println("Asignacion realizada");
    }

}
