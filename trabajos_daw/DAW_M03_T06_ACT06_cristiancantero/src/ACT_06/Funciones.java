package ACT_06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Funciones {
    /**
     * Función crear archivo
     * Objetos File, creación de ruta, separador y archivo
     * El usuario escoje el nombre del .txt que va a crear
     * @param scanner sc
     * 
     */
    
    public static void nuevoArchivo(Scanner sc)throws IOException{
         String ruta = System.getProperty("user.dir");
         String sep = File.separator;
         File archivo = new File(ruta+sep+"archivos");
         if(!archivo.exists()){
             System.out.println("Este archivo no existe");
             System.out.println("Creando archivo...");
             archivo.mkdir();
             System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
         }else{
             System.out.println("Esta carpeta existe en: " + archivo.getAbsolutePath());
         }
         System.out.println("Introduce el nombre del archivo.txt que quieres crear: ");
         String nombre = sc.nextLine();
         
         File texto = new File(archivo,nombre);
         if(!texto.exists()){
             texto.createNewFile();
             System.out.println("Creando hoja de registro en: " + texto.getAbsolutePath());
         }
         //escritura del .txt
         System.out.println("Escribe lo que quieras en tu archivo " + texto);
         String escribir = sc.nextLine();
         try(BufferedWriter bw = new BufferedWriter(new FileWriter(texto, true))){
             bw.write(escribir);
             bw.newLine();
         }catch(IOException e){
             System.out.println("Error en la escritura");
         }
         System.out.println("Esto es lo que has escrito en tu archivo " + nombre);
         System.out.println(escribir);
         
    }
    
    public static File [] listarArchivos(){
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta+sep+"archivos");
        
    }
   
}
