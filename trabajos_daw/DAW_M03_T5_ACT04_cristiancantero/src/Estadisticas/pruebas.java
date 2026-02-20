
package Estadisticas;

/**
 *
 * @author cristiancantero
 */
public class pruebas {
    public static void main (String[]args){
        double [] array = {5, 7.3, 4, 9.4};
        double suma = 0;
        
        for(int i = 0 ; i < array.length; i++){
           suma = suma+array[i];
        }
        System.out.println(suma);
        
        suma = 0;
        for(double notas: array){
            suma += notas;
        }
        System.out.println(suma);
    }
}
