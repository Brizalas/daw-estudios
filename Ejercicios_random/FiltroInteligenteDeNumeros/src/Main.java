import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
                Scanner sc = new Scanner(System.in);
                
                int[] numeros = pedirNumeros(sc);
                System.out.println(contarPositivos(numeros) + " positivos");
                System.out.println(contarNegativos(numeros) + " negativos");
                System.out.println(contarCeros(numeros) + " ceros");
//                System.out.println("Te has equivocado "+pedirNumeros(sumaErrores)+ " veces-");

            } 
       

    
public static int contadorErrores(int contador){
    contador = 0;
    contador ++;
    return contador;
    
}
    public static int[] pedirNumeros(Scanner sc) {

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            boolean valido = false;
            int sumaErrores = 0;
            while (!valido) {
                try {
                    System.out.println("Introduce el número " + (i + 1) + " :");
                    numeros[i] = Integer.parseInt(sc.nextLine());
                    valido=true;
                } catch (Exception e) {
                    System.out.println(" Introduce un número");
                    valido = false;
                    sumaErrores = contadorErrores(i);
                    
                }
            }

        }
        return numeros ;
    }

    public static int contarPositivos(int[] array) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contador++;
            }

        }
        return contador;
    }

    public static int contarNegativos(int[] array) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }

        }
        return contador;
    }

    public static int contarCeros(int[] array) {
        int ceros = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                ceros++;
            }

        }
        return ceros;
    }
}
