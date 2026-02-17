package Estadisticas;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class CalculadoraEstadisticas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
do{
    try{
        
            System.out.println("Introduce la opción");
            System.out.println("1. Calculadora de promedio");
            System.out.println("2. Calcular desviación estandar"); 
            System.out.println("3. Calcular mediana");
            System.out.println("0. Salir");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: {
                    double[] estadisticas = EstadisticasUItils.pedirNumeros(sc);
                    double calculadoraPromedio = EstadisticasUItils.calcularPromedio(estadisticas);
                    System.out.println("Promedio de los números que has introducido: " + calculadoraPromedio);

                }
                break;
                case 2: {

                    double[] estadisticas = EstadisticasUItils.pedirNumeros(sc);
                    double desviacion = EstadisticasUItils.calcularDesviacion(estadisticas);
                    
                    System.out.println("La desviación estandar es: " + desviacion);

                }
                break;
                case 3: {
                    double[] estadisticas = EstadisticasUItils.pedirNumeros(sc);
                    double media = EstadisticasUItils.calcularMediana(estadisticas);
                    
                    System.out.println("La mediana es: " + media);

                }
                break;
                case 0:
                    System.out.println("Adios.");
                    return;

                default:
                    System.out.println("Introduce una opción válida.");
            }
    }catch(Exception e){
        System.out.println("Error");
    }
}while(true);
        

       
        

    }
}
