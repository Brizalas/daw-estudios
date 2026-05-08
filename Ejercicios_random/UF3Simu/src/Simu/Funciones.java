package Simu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Funciones {

    public static void crearCarpeta(Scanner sc) throws IOException {
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;

        File carpeta = new File(ruta + sep + "carpeta");
        if (!carpeta.exists()) {
            carpeta.mkdir();
            System.out.println("carpeta creada en " + carpeta.getAbsolutePath());

        } else {
            System.out.println("Ruta de la carpeta: " + carpeta.getAbsolutePath());
        }
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("¿Quieres crear un fichero? 1. si 2. no");
                int crear = Integer.parseInt(sc.nextLine());
                if (crear == 1) {
                    System.out.println("Introduce el nombre del fichero: ");
                    String nombre = sc.nextLine();
                    File fichero = new File(carpeta, nombre);
                    if (!fichero.exists()) {
                        fichero.createNewFile();
                    } else {
                        System.out.println("Este fichero ya existe en : " + fichero.getAbsolutePath());
                    }
                } else {
                    System.out.println("Esta carpeta tiene estos ficheros: ");
                    File[] recorrer = carpeta.listFiles();
                    for (File r : recorrer) {
                        System.out.println(r.getName());
                    }
                    return;
                }

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void borrarElUltimoFichero(File carpeta) {
        File[] ficheros = carpeta.listFiles();
        if (ficheros != null && ficheros.length > 0) {
            for (int i = ficheros.length - 1; i >= 0; i--) {
                if (ficheros[i].isFile()) {
                    System.out.println("Borrando " + ficheros[i].getName());
                    ficheros[i].delete();
                    break;
                }
            }
        }
    }

    public static void decirAdios() {
        System.out.println("Adios!");
    }
}
