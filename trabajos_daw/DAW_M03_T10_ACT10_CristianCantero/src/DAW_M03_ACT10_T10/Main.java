package DAW_M03_ACT10_T10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funciones f = new Funciones();
        Producto p = new Producto();
        HashMap<String, Producto> listaProductos = new HashMap<>();
        ArrayList<String> materiales = new ArrayList<>();
        boolean valido = false;
        
       
        do {
            try {
                System.out.println("====Menú====");
                System.out.println("1. Agregar producto");
                System.out.println("2. Actualizar producto");
                System.out.println("3. Eliminar producto"); 
                System.out.println("0. Salir");
                System.out.println("=============");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        f.agregarProducto(sc);
                        break;
                    case 2:
                        f.actualizarProducto(sc);
                        break;
                        
                    case 3:
                        f.eliminarProducto(sc); 
                        break;
                    case 0:
                        System.out.println("Adios");
                        valido = true;
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (Exception e) {
                System.out.println("Error al validar");
            }
        } while (!valido);

    }
}
