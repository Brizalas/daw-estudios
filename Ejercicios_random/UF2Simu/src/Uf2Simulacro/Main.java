package Uf2Simulacro;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {
    public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int numero = pedirNumero(sc);
    int [] pares = tomaTusPares(numero);
        System.out.println("Estos son tus números pares");
    for (int p : pares){
        System.out.println(p);
    }
    
    int [] impares = tusImpares(numero);
        System.out.println("----------------------------");
        System.out.println("IMPARES");
        for(int imp: impares){
            System.out.println(imp);
        }
    
}
    
    public static int pedirNumero(Scanner sc){
        boolean valido = false;
        int numero = 0;
        while(!valido){
        try{
        System.out.println("Introduce un número mayor");
        numero = Integer.parseInt(sc.nextLine());
        valido = true;
        }catch(NumberFormatException e){
            System.out.println("Introduce solo números mayores");
            
        }
        }
        return numero;
        
        
        
    }
    
    public static int [] tomaTusPares(int n){
        int t = (n/2)+1;
        int [] tusPares = new int [t];
        for (int i =0; i < tusPares.length; i ++){
            tusPares[i]= i*2;
        }
        return tusPares;
    }
    
    public static int [] tusImpares(int n){
        int t = (n/2)+1;
        
        int []tusImpares = new int [t];
        for(int i = 0;  i < tusImpares.length; i ++ ){
            
            tusImpares[i]=(i*2)-1;
        }
        return tusImpares;
    }
}
            