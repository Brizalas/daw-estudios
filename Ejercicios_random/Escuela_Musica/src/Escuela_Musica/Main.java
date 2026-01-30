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
                System.out.println("5. Listado de clientes");
                System.out.println("0. Salir");
                System.out.println("------------------------------------------------------------------");
                int opcion = Integer.parseInt(sc.nextLine());
                
                switch(opcion){
                    case 1:
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
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
        
    }

}
