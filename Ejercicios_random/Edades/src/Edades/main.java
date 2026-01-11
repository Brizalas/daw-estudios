package Edades;

import java.util.Scanner;

/*

📋 ENUNCIADO

Crea un programa en Java.

Declara un array de 5 edades (int).

Usa un bucle for para pedir las edades al usuario.

Una edad es válida solo si está entre 0 y 120 (inclusive).

Si el usuario introduce:

letras → error y repetir

números fuera de rango → mensaje y repetir

No se avanza a la siguiente edad hasta que la actual sea válida.

Al final, muestra todas las edades introducidas, una por línea.

*/

public class main {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int[]edades=new int[5];
        boolean seguir=false;
        int edad = 0;
        
        for(int i=0; i<edades.length;i++){
            seguir = false; //reset del booleano, asi me aseguro que siempre empieza siendo false.
            do{
                try{
                    System.out.println("Introduce la edad " + (i+1));
                    edad = Integer.parseInt(sc.nextLine());
                    if(edad >0 && edad < 120){
                        seguir=true;
                        System.out.println("Edad introducida correctamente.");
                    }else{
                        System.out.println("Introduce una edad comprendida entre 0 y 120 años.");
                    }
                }catch(Exception e){
                    System.out.println("Error introduce números, no letras. De 0 a 120 años.");
                }
            }while(!seguir);
            edades[i]=edad;
        }
        
        for(int i=0; i<edades.length;i++){
            int n = edades[i];
            System.out.println("Edad " + (i+1) +" tiene "+ + n + "años" );
        }
        System.out.println("Edades introducidas correctamente.");
        
    }
}
