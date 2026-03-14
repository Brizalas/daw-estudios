package ACT_06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author cristiancantero
 */
public class Main {
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner (System.in);
        Funciones.nuevoArchivo(sc);
        File [] resultado = Funciones.listarArchivos();
        Funciones.mostrarArchivo(sc);
        
        
        
        
    }
}
