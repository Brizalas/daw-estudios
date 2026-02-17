package Estadisticas;

import java.util.Scanner;
import java.util.Arrays;

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

        for(int i = 0; i < array.length; i ++){
            suma = suma+array[i];
        }
        double promedio = suma / array.length;

        return promedio;
    }
    
    public static double calcularDesviacion(double[]array){
        double media = calcularPromedio(array);
        double suma = 0;
        double diferencia = 0;
        for(int i =0; i<array.length;i++){
            diferencia = array[i] - media;
            suma+=diferencia * diferencia;
        }
        double variacion = suma/array.length;
        return Math.sqrt(variacion);
    }
    
    public static double calcularMediana(double[] array){
        Arrays.sort(array);
        System.out.println("Array ordenado: ");
        for(int i =0; i < array.length; i++){
            System.out.println(i);
        }
        double mediana = (array[4] + array [5])/2;
        return mediana;
    }
}
