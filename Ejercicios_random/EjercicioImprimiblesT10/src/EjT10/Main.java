package EjT10;

/*
Crea una aplicación que use un ArrayList para almacenar números enteros y añade varios
valores.
A continuación, muestra el número total de elementos del ArrayList, y recórrelo.
Luego, pide al usuario que introduzca un valor para buscarlo en el ArrayList. Si lo
encuentra, el programa preguntará si se quiere cambiar el valor. Si el usuario contesta
afirmativamente, se le pedirá el nuevo valor y se introducirá en el ArrayList modificando el
anterior.
Al final, se debe volver a mostrar el número total de elementos del ArrayList, y cuáles son.



*/

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(24);
        numeros.add(145);
        numeros.add(98);
        numeros.add(1);
        
        System.out.println("---Lista numeros---");
        System.out.println();
        
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        
        do{
            try{
                 System.out.println("Introduce un número para buscarlo.");
        int num = sc.nextInt();//numero a buscar
        sc.nextLine();
        int posicion = numeros.indexOf(num);
        
        if(numeros.contains(num)){
            System.out.println("El número " + num + " está en la lista.");
            System.out.println("Posición: " + (1+posicion));
            System.out.println();
            System.out.println("¿Quieres cambiar el número o conservarlo? 1- Cambiar"
                    + " 2- Conservar");
            int cambiar = sc.nextInt(); sc.nextLine();
            if(cambiar == 1){
                System.out.println("Introduce el numero nuevo: ");
                int numeroCambiar = sc.nextInt();sc.nextLine();
                numeros.remove(posicion);
                numeros.add(posicion,numeroCambiar);
            }
            
        }else{
            System.out.println("El número no está en la lista");
        }
            }catch(Exception e){
                System.out.println("Error de validacion");
            }
            
            
            
            System.out.println("Asi ha quedado tu lista");
            System.out.println();
            System.out.println("---Lista numeros---");
        System.out.println();
        
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        
            System.out.println("¿Quieres cambiar otro número? 1.Si / 2.No");
            opcion = sc.nextInt(); sc.nextLine();
            
        }while(opcion != 2);
        System.out.println("Adios.");
        
       
        

    }
    
}

