package Simu;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class DelTiron {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        do{

            try {
                System.out.println("Introduce un número mayor");
                int numero = Integer.parseInt(sc.nextLine()); 
                valido = true;
                int t = (numero / 2) + 1;
                int[] pares = new int[t];
                System.out.println("Estos son tus pares desde el 0 hasta el número " + numero);
                System.out.println("================================================");
                for (int i = 0; i < pares.length; i++) {
                    pares[i] = i * 2;
                    System.out.println(pares[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Introduce solo números mayores");
                
            }
        }while(!valido);

        }
    }

