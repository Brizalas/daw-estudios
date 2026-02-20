package daw_m03_t4_act03_cristiancantero;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = pedirNumeros(sc);
        int inicio = numeros[0];
        int fin = numeros[1];

        recorrerNumeros(inicio, fin);

        sc.close();
    }

    /**
     * Solicita al usuario dos números enteros y los guarda en un array de
     * tamaño fijo de dos posiciones
     *
     * @param sc objeto Scanner para introducir los datos
     * @return el array con los dos números guardados
     */
    public static int[] pedirNumeros(Scanner sc) {
        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + " : ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }

    /**
     *
     * recorre los numeros comprendidos entre inicio y fin. En cada iteración
     * llama a la funcion esPrimo() y si se cumple lo pinta
     *
     * @param inicio como número de salida
     * @param fin como número final
     */

    public static void recorrerNumeros(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

    }

    /**
     * Determina si un número entero positivo es primo.
     *
     * Un número primo es aquel que solo es divisible entre 1 y él mismo.
     *
     * - Si n es menor o igual que 1, devuelve false. - Se calcula la raíz
     * cuadrada de n para optimizar la búsqueda de divisores. - Se recorren los
     * números desde 2 hasta la raíz cuadrada de n. - Si alguno divide
     * exactamente a n (resto 0), significa que n no es primo. - Si no se
     * encuentra ningún divisor en ese rango, el número es primo.
     *
     * @param n número entero a comprobar.
     * @return true si n es primo, false en caso contrario.
     */
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        int limite = (int) Math.sqrt(n);

        for (int i = 2; i <= limite; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
