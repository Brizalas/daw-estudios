package Gimnasio;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {

    public static void main(String[] args) {

        Gimnasio gimnasio = new Gimnasio();  //se crea una instancia de Gimnasio
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            try {
                mostrarMenu();
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                         registrarCliente(sc,gimnasio);
                    
                        break;
                    case 2:
                        registrarEntrenador(sc, gimnasio);
                        break;
                    case 3:
                        asignarEntrenadorACliente(sc, gimnasio);
                        break;
                    case 4:
                        gimnasio.mostrarClientes();
                        break;
                    case 5:
                        gimnasio.mostrarEntrenadores();
                        break;
                    case 0:
                        System.out.println("Adios");
                        salir = true;
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (Exception e) {
                System.out.println("Error en el main");
            }
        } while (!salir);

    }
    
    //METODOS!!

    public static void mostrarMenu() {
        System.out.println("--GymProPlus--");
        System.out.println("");
        System.out.println("Introduce una opcion");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Registrar entrenador");
        System.out.println("3. Asignar entrenador a cliente");
        System.out.println("4. Mostrar todos los clientes");
        System.out.println("5. Mostrar todos los entrenadores");
        System.out.println("0. Salir");
    }
    
    public static void registrarCliente(Scanner sc, Gimnasio gimnasio){
        
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el dni: ");
        String dni = sc.nextLine();
        System.out.println("Introduce la edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el telefono");
        String telefono = sc.nextLine();
        System.out.println("Introduce el email: ");
        String email = sc.nextLine();
        System.out.println("Introduce membresía. 1-premium / 2-básica");
        int tipoMembresia = Integer.parseInt(sc.nextLine());
        
        //Crear el clinete sin el entrenador
        Cliente cliente = new Cliente(
        nombre, dni, edad, telefono, email, tipoMembresia
        
        );
        
        //guardarlo en el gimnasio
        gimnasio.agregarCliente(cliente);
        //confirmacion
        System.out.println("Cliente registrado");
                
        
        
    }
    
    public static void registrarEntrenador(Scanner sc,Gimnasio gimnasio){
        System.out.println("Introduce el nombre:");String nombre=sc.nextLine();
        System.out.println("Introduce el código de entrenador: ");int codigoEntrenador = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce la edad :");int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el telefono:");String telefono = sc.nextLine();
        System.out.println("Introduce el correo electrónico:");String email = sc.nextLine();
        System.out.println("Introduce la especialidad deportiva :");String especialidad = sc.nextLine();
        System.out.println("Introduce la experiencia :");int experiencia = Integer.parseInt(sc.nextLine());
        
        Entrenador entrenador = new Entrenador(nombre,codigoEntrenador,edad,telefono,email,especialidad,experiencia);
        gimnasio.agregarEntrenador(entrenador);
        System.out.println("Entrenador registrado");
    }
    
    public static void asignarEntrenadorACliente(Scanner sc, Gimnasio gimnasio){
        System.out.println("Introduce el dni del cliente: ");String dni = sc.nextLine();
        System.out.println("Introduce el código de entrenador: ");int codigoEntrenador = Integer.parseInt(sc.nextLine());
        
        gimnasio.asignarEntrenador(dni, codigoEntrenador);
        
        System.out.println("Asignación realizada");
        
        
    }
}
