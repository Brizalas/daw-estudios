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
                        //registrarCliente(sc, Gimnasio);
                        break;
                    case 2:
                        //registrarEntrenador(sc, Gimnasio);
                        break;
                    case 3:
                        //asignarEntrenador(sc, Gimnasio);
                        break;
                    case 4:
                        //mostrarClientes(Gimnasio);
                        break;
                    case 5:
                        //mostrarEntrenadores(Gimnasio);
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
}
