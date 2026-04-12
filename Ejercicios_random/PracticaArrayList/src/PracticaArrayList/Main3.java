package PracticaArrayList;

import java.util.ArrayList;

/**
 *
 * @author cristiancantero
 */
public class Main3 {
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Marta");
        nombres.add("Pedro");
        nombres.add("Marta");
        
        for (int i = 0; i < nombres.size();i++){
            System.out.println((i+1)+" " + nombres.get(i));
        }
        
        System.out.println("Sustituir el segundo nombre Marta por María");
        
        int posicion = nombres.indexOf("Marta");
        if(posicion != -1){
            nombres.set(posicion, "Maria");
        }
        
        for(int i = 0 ; i < nombres.size(); i ++){
            System.out.println((i+1) + " " + nombres.get(i)); 
        }
    }
    
    
    
}
