
package PracticaArrayList;

import java.util.ArrayList;

/**
 *
 * @author cristiancantero
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList <>();
        nombres.add(0,"Anna");
        nombres.add(1,"Luis");
        nombres.add(2,"Marta");
        nombres.add(3,"Pedro");
        
        System.out.println("Tamaño " + nombres.size());
        
        for(int i = 0; i < nombres.size(); i++){
            System.out.println((i+1) +" "+ nombres.get(i));
        }
        
        String nombreBuscar = "Marta";
        int posicion = nombres.indexOf(nombreBuscar);
        if(nombres.contains("Marta")){
            System.out.println("El nombre " + nombreBuscar+ " está en la lista. ");
            System.out.println("Se encuentra en la osicion" + 3);
        }else{
            System.out.println("El nombre no está en la lista");
        }
        
        nombres.remove("Luis");
        
        for(int i = 0; i < nombres.size(); i++){
            System.out.println((i+1) +" "+ nombres.get(i));
        }
    }
}
