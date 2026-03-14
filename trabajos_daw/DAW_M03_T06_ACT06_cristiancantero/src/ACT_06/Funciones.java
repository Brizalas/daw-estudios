package ACT_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Funciones {

    /**
     * Función crear archivo Objetos File, creación de ruta, separador y archivo
     * El usuario escoje el nombre del .txt que va a crear
     *
     * @param scanner sc
     *
     */
    public static void nuevoArchivo(Scanner sc) throws IOException {
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta + sep + "archivos");
        if (!archivo.exists()) {
            System.out.println("Este archivo no existe");
            System.out.println("Creando archivo...");
            archivo.mkdir();
            System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
        } else {
            System.out.println("Esta carpeta existe en: " + archivo.getAbsolutePath());
        }
        System.out.println("Introduce el nombre del archivo.txt que quieres crear: ");
        String nombre = sc.nextLine();

        File texto = new File(archivo, nombre);
        if (!texto.exists()) {
            texto.createNewFile();
            System.out.println("Creando hoja de registro en: " + texto.getAbsolutePath());
        }
        //escritura del .txt
        System.out.println("Escribe lo que quieras en tu archivo " + texto);
        String escribir = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(texto, true))) {
            bw.write(escribir);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        }
        System.out.println("Esto es lo que has escrito en tu archivo " + nombre);
        System.out.println(escribir);

    }

    public static File[] listarArchivos() {
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta + sep + "archivos");
        if (!archivo.exists()) {
            System.out.println("Esta carpeta no existe");
            archivo.mkdir();
        }
        File[] contenido = archivo.listFiles();

        if (contenido == null) {
            return new File[0];

        }
        int contador = 0; //este primer contador es para saber cuantos .txt válidos hay
        for (File f : contenido) {
            if (f.isFile() && f.getName().endsWith(".txt")) {
                contador++;
            }
        }
        File[] resultado = new File[contador];
        int indice = 0; // este índice sirve para saber en qué posición (hueco) del array []resultado estoy guardando.
        for (File f : contenido) {
            if (f.isFile() && f.getName().endsWith(".txt")) {
                resultado[indice] = f;
                indice++;
            }
        }

        for (int i = 0; i < resultado.length; i++) { //recorre los .txt mostrando el nombre y numerándolos
            System.out.println((i + 1) + " - " + resultado[i].getName());
        }
        return resultado;

    }

    public static void buscarArchivo(Scanner sc) throws IOException {
        boolean encontrado = false;
        File[] archivos = listarArchivos();
        if (archivos.length == 0) {
            System.out.println("No hay archivos disponibles");
            return;
        }

        System.out.println("Introduce el nombre del archivo que quieres ver.");
        String nombreArchivo = sc.nextLine();
        for(File f : archivos){
            
            if(nombreArchivo.equalsIgnoreCase(f.getName())){
                encontrado = true;
                try(BufferedReader br = new BufferedReader(new FileReader(f))){
                    String linea;
                    while((linea=br.readLine())!=null){
                        System.out.println(linea);
                    }
                    
                }catch(IOException e){
                    System.out.println("Error en la lectura motrar ARchivo" + e.getMessage());
                }
                break;
            }
            
        }
        if(!encontrado){
                System.out.println("No existe un documento con este nombre.");
            }

    }

}
