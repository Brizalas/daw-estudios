package daw_m03_t4_act03_cristiancantero;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 *
 *
 * Crea un proyecto que solicite al usuario que ingrese dos números enteros
 * positivos: inicio y fin. El programa debe encontrar todos los números primos
 * dentro de ese rango y mostrarlos al usuario.
 *
 * Para resolver esta actividad, puedes implementar las siguientes funciones:
 *
 * esPrimo(n): Esta función recibe un número entero positivo n como parámetro y
 * devuelve true si es un número primo, y false en caso contrario. Para
 * determinar si un número es primo, debes comprobar si es divisible únicamente
 * por 1 y por sí mismo.
 *
 * calcularRaizCuadrada(n): Esta función recibe un número entero positivo n como
 * parámetro y devuelve su raíz cuadrada.
 *
 * imprimirPrimosEnRango(inicio, fin): Esta función recibe dos números enteros
 * positivos (inicio y fin) como parámetros y muestra por pantalla todos los
 * números primos que se encuentran en ese rango. Puedes utilizar un bucle for
 * para iterar desde inicio hasta fin, y dentro del bucle, llamar a la función
 * esPrimo() para verificar si cada número es primo.
 *
 * El programa principal debe solicitar al usuario que ingrese los valores de
 * inicio y fin, y luego llamar a la función imprimirPrimosEnRango() para
 * mostrar los números primos en ese rango.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = pedirNumeros(sc);
        int inicio = numeros[0];
        int fin = numeros[1];
        
        recorrerNumeros(inicio, fin);
    }

    public static int[] pedirNumeros(Scanner sc) {
        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + " : ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }

    public static void recorrerNumeros(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
              if (esPrimo(i)){
                  System.out.println(i);
              }
        }

    }

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
