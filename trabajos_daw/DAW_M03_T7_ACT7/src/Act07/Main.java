package Act07;

import java.util.Scanner;



/**
 *
 * @author cristiancantero
 */
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("--Welcome to GymBros--");
        System.out.println();
        
        do{
            
            
       
        System.out.println("Selecciona una opción: ");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Agregar entrenador");
        System.out.println("3. Asignar entrenador a cliente");
        System.out.println("4. Mostrar clientes");
        System.out.println("5. Mostrar entrenadores");
        System.out.println("0. Salir");
        opcion = Integer.parseInt(sc.nextLine());
        
        switch(opcion){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            case 5:
                System.out.println("case 5");
                break;
            case 0:
                System.out.println("Programa cerrado correctamente.");
                return;
            default: 
                System.out.println("Introduce una opción válida.");
        }
            
        }while(opcion != 0);
        
    }
}
     
        
        

        
            