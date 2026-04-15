package ACT11;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author cristiancantero
 */
public class Main {

    public static void main(String[] arg)  {
        Scanner sc = new Scanner(System.in);
        Funciones funciones = new Funciones();

        int pocion; // xD

        do {
            System.out.println("1. Agregar libro");
            System.out.println("2. Vender libro");
            System.out.println("3. Bujcar libro"); //xD
            System.out.println("0. Salir dew"); //xD

            pocion = sc.nextInt();
            sc.nextLine();
            try {
                switch (pocion) {
                    case 1: 
                        
                        System.out.println("Introduce el nombre del libro");
                        String nombreLibro = sc.nextLine();
                        int stock = 0;
                        try {
                            System.out.println("Introduce el stock: ");
                            stock = sc.nextInt();

                            sc.nextLine();

                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                        funciones.agregarLibro(nombreLibro, stock);
                    
                    break;
                    case 2: 
                        System.out.println("Introduce el nombre del libro");
                        String nombreLibro1 = sc.nextLine();
                        funciones.venderLibro(nombreLibro1);
                    
                    break;
                    case 3: 
                        System.out.println("Introduce el nombre del libro");
                        String nombreLibro2 = sc.nextLine();
                        Libro libro = funciones.buscarLibro(nombreLibro2);
                        System.out.println(libro);

                    

                    break;
                    case 0:
                        System.out.println("Programa cerrado correctamente");
                        return;
                    default:
                        System.out.println("Introduce un caracter válido");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pocion != 0);

    }
}
