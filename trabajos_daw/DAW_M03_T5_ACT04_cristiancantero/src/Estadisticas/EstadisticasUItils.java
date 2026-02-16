package Estadisticas;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class EstadisticasUItils {

    public static double[] pedirNumeros(Scanner sc) {
        double[] numeros = new double[10];
        boolean valido = false;
        while (!valido) {

            for (int i = 0; i < numeros.length; i++) {
                try {
                    System.out.println("Introduce el número de la posición " + (i + 1) + " :");
                    numeros[i] = Double.parseDouble(sc.nextLine());
                    valido = true;
                } catch (Exception e) {
                    System.out.println("introduce un número");
                    valido = false;
                }
            }

        }
        return numeros;

    }

    public static double calcularPromedio(double[] array) {

        double suma = 0;
        
//        double notas=0;
        for(int notas=0; notas < array.length; notas++){
        
        suma = suma + notas;
        }
        
//        for (double notas : array) {
//            suma += notas;
//        }
        double promedio = suma / array.length;

        return promedio;
    }
}
