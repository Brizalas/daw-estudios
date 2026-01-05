package ejerciciotema2;

import java.util.Scanner;

public class EjemploControlDeFlujo {

    /*
    Actividad 1
Crea un programa de nombre EjemploControlDeFlujo que muestre por consola un menú
pidiendo que se ejecute una de las siguientes opciones y excepto si se selecciona finalizar
el programa se vuelva a pedir la opción:
• 1- muestra los números del 20 al 40 con un while
• 2- muestra los número del 50 al 30 con un bucle for
• 0- Finaliza el programa
    
    En este caso he decidido utilizar dos funciones utilizando un switch/case
    para el control de flujo del programa.
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
    
                
        do {
            try {
                
                System.out.println("Escoge una opción");
                System.out.println("1. Muestra los números del 1 al 20 con un while");
                System.out.println("2. Muestra los números del 50 al 30 con un for");
                System.out.println("0. Salir");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        conWhile();
                        break;
                    case 2:
                        conFor();
                        break;
                    case 0:
                        System.out.println("Adios");
                        return;
                    default:
                        System.out.println("Introduce un número válido");

                }
            } catch (Exception e) {
                System.out.println("introduce un caracter válido");
            }
            System.out.println("Continuar? 1.Si 2.No");
            int continuar = sc.nextInt();
            
            if(continuar == 1){
                seguir = true;
            }else if(continuar ==2){
                seguir = false;
            }else{
                System.out.println("Introduce 1 o 2");
            }

        } while (seguir);

    }
    
    public static void conWhile(){
        int numero = 1;
        while(numero <20){
            numero ++;
            System.out.println(numero);
        }
        
    }
    
    public static void conFor(){
        
        for(int i=50 ; i >= 30 ; i--){
            
            System.out.println(i);
        }
    }
}
