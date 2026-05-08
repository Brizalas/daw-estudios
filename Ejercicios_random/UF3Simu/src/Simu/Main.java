package Simu;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        boolean valido = false;
        
        do{
            try{
                System.out.println("Introduce una opcion");
                System.out.println("1. crear Fichero");
                System.out.println("2. borrar el último fichero del directorio");
                System.out.println("3. salir");
                
                int opcion = Integer.parseInt(sc.nextLine());
                switch(opcion){
                    case 1:
                        Funciones.crearCarpeta(sc);
                        break;
                    case 2:
                    {
                        String ruta = System.getProperty("user.dir");
                        String sep = File.separator;
                        File carpeta = new File(ruta+sep+"carpeta");
                        Funciones.borrarElUltimoFichero(carpeta);
                        break;
                    }
                       
                    case 3:
                        Funciones.decirAdios();
                        valido = true;
                }
            }catch(Exception e){
                System.out.println("Fuck"); 
            }
        }while(!valido);
    }
}
