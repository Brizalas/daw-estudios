package Estadisticas;

import java.util.Scanner;
import java.util.Arrays;

/**
 * He declarado la clase como pública para permitur su uso desde la clase principal.
 * Los metodos son public static porque son operaciones matemáticas independientes y asi 
 * puedo llamar a las funciones sin necesidad de instanciarlas. 
 * Como las funciones no tienen estado interno que gestionar y quiero llamarlas desde la clase principal, 
 * no requieren encapsulación (protected o private)
 * 
 * @author cristiancantero
 */
public class EstadisticasUItils {
/**
 * pide diez números enteros al usuario
 * @param sc objeto Scanner para introducir los datos
 * @return Devuelve un array fijo de 10 números guardados
 */
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
/**
 * recibe un array y calcula el promedio
 * @param array
 * @return el resultado del promedio
 */
    public static double calcularPromedio(double[] array) {

        double suma = 0;

        for(int i = 0; i < array.length; i ++){
            suma = suma+array[i];
        }
        double promedio = suma / array.length;

        return promedio;
    }
    /**
     * recibe un array y calcula la desviacion estandar
     * @param array
     * @return el resultado de la desviación estandar
     */
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
    /**
     * recibe un array de 10 posiciones y calcula la mediana
     * @param array fijo de 10 posiciones
     * @return la varianza q es el resultado del cálculo
     */
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
