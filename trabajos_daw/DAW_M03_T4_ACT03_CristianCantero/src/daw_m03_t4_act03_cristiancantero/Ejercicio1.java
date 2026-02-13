package daw_m03_t4_act03_cristiancantero;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    * @author cristiancantero
    
    EJERCICIO 1: Crea un proyecto con métodos estáticos para realizar 
    operaciones matemáticas básicas. Los métodos deben tener los siguientes 
    nombres y funcionalidades:
sumar: recibe dos números enteros y devuelve la suma de ambos.
restar: recibe dos números enteros y devuelve la resta de ambos.
multiplicar: recibe dos números enteros y devuelve el producto de ambos.
dividir: recibe dos números enteros y devuelve el resultado de la división 
    del primer número entre el segundo.
potencia: recibe dos números enteros y devuelve el primer número elevado a 
    la potencia del segundo.
Crea un menú para que el usuario pueda elegir que operación quiere realizar. 
    Una de las opciones permitirá salir y cerrar el programa.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Bienvenidos a calculadora");
        do {
            try {
                System.out.println("-------------------");
                System.out.println("Escoje una opción: ");
                System.out.println("1. sumar");
                System.out.println("2. restar");
                System.out.println("3. multiplicar");
                System.out.println("4. dividir");
                System.out.println("5. potencias");
                System.out.println("0. Salir");
                System.out.println("--------------------");
                int opcion = Integer.parseInt(sc.nextLine());
                
                switch (opcion) {
                    case 1: {
                        int[] numeros = pedirDosNumeros(sc);
                        int a = numeros[0];
                        int b = numeros[1];
                        
                        int resultado = sumar(a,b);
                        
                        System.out.println("El resultado de sumar " + a 
                        + " + " + b + " es igual a: " + resultado);
                       
                        break;
                    }
                    case 2: {
                        int[] numeros = pedirDosNumeros(sc);
                        int a = numeros[0];
                        int b = numeros[1];
                        
                        int resultado = restar(a,b);
                        
                        System.out.println("El resultado de restar " + a 
                        + " - " + b + " es igual a: " + resultado);
                        break;
                    }
                    case 3: {
                        int[] numeros = pedirDosNumeros(sc);
                        int a = numeros[0];
                        int b = numeros[1];
                        
                        int resultado = multiplicar(a,b);
                        
                        System.out.println("El resultado de multiplicar " + a 
                        + " * " + b + " es igual a: " + resultado);
                        break;
                    }
                        
                        
                    case 4: {
                        double[] numeros = pedirDosNumerosDouble(sc);
                        double a = numeros[0];
                        double b = numeros[1];
                        
                        double resultado = dividir(a,b);
                        
                        System.out.println("El resultado de dividir " + a 
                        + " / " + b + " es igual a: " + resultado);
                        break;
                    }
                    
                    case 5:
                        int[]numeros = pedirDosNumeros(sc);
                        
                        int a = numeros[0];
                        int b = numeros[1];
                        
                        int resultado = potencia(a,b);
                        
                        System.out.println("El resultado de elevar " + a
                        + " a la " + b + " es: " + resultado);
                        
                        break;
                    case 0:
                        System.out.println("Adios.");
                        return;
                    default:
                        System.out.println("Introduce una opción válida.");

                }
            } catch (Exception e) {
                System.out.println("Error, introduce datos correctos.");
            }
        } while (true);
    }

    //funciones
   public static int[] pedirDosNumeros(Scanner sc){
       int[]numeros = new int [2];
       
       for(int i = 0; i < numeros.length; i ++ ){
           System.out.println("Introduce el número " + (i+1));
           numeros[i]=Integer.parseInt(sc.nextLine());
       }
       return numeros;
   }
   
   public static double[] pedirDosNumerosDouble(Scanner sc){
       double[]numeros = new double [2];
       
       for(int i = 0; i < numeros.length; i ++ ){
           System.out.println("Introduce el número " + (i+1));
           numeros[i]=Double.parseDouble(sc.nextLine());
       }
       return numeros;
   }
    
   public static int sumar(int a, int b){
       return a + b;
   }
   
   public static int restar(int a, int b){
       return a - b;
   }
   
   public static int multiplicar (int a, int b){
       return a * b;
   }
   public static double dividir (double a, double b){
       return a / b;
   }
   public static int potencia(int a, int b){
       int resultado= 1;
       
       for(int i=0;i<b;i++){
           resultado = resultado * a;
       }
       
       return resultado;
   }

}
