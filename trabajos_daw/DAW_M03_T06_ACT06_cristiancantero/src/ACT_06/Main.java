package ACT_06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {

            System.out.println("Escoge una opción:");
            System.out.println("1. Crear un nuevo archivo");
            System.out.println("2. Ver todos los archivos");
            System.out.println("3. Buscar un archivo");
            System.out.println("4. Renombrar un archivo");
            System.out.println("5. Borrar un archivo");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Funciones.nuevoArchivo(sc);
                    break;
                case 2:
                    File []archivos= Funciones.listarArchivos();
                    for(int i = 0; i < archivos.length; i ++){
                        System.out.println((i+1) + "- " + archivos[i].getName());
                    }
                    break;
                case 3:
                    Funciones.buscarArchivo(sc);
                    break;
                case 4:
                    Funciones.renombrarTxt(sc);
                    break;
                case 5:
                    Funciones.borrarArchivo(sc);
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Escribe una opción correcta");

            }
        } while (opcion != 0);

    }
}
