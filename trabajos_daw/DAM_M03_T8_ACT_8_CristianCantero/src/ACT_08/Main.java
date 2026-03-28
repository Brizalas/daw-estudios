package ACT_08;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda();
        

        int opcion = 0;

        do {
            try {
                System.out.println("-----MENÚ------");
                System.out.println();
                System.out.println("1. Ingresar comida");
                System.out.println("2. Ingresar bebida");
                System.out.println("3. Mostrar stock");
                System.out.println("0. Salir");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        tienda.agregarComida(sc);
                        break;

                    case 2:
                        tienda.agregarBebida(sc);
                        break;
                    case 3:
                        tienda.mostrarStock();
                        break;
                    case 0:
                        System.out.println("Adiós");
                        break;
                    default:
                        System.out.println("Introduce un número válido");
                }
            } catch (Exception e) {
                System.out.println("entrada inválida");
                sc.nextLine();
            }
        } while (opcion != 0);
    }
}
