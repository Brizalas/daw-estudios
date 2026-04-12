
package PracticaHashMap;

import java.util.HashMap;


public class Main1 {
    public static void main(String[] args) {
        HashMap <String,String> capitales = new HashMap <String,String>();
        capitales.put("España","Madrid");
        capitales.put("Francia","París");
        capitales.put("Italia","Roma");
//        capitales.put("Holanda","Amsterdamm");
        System.out.println();
        System.out.println("Recorrer con un for/each");
        
        for(String clave: capitales.keySet()){
            System.out.println(clave + " => "+ capitales.get(clave));
        }
        
        System.out.println();
        System.out.println("Buscar un pais:");
        String pais = "España";
        if(capitales.containsKey(pais)){
            System.out.println("La capitald de España es: "+capitales.get(pais));
        }
        System.out.println();
        String holanda = "Holanda";
        System.out.println("Comprobar si este pais: " + holanda + "Esta en el HashMap");
        
        if(capitales.containsKey(holanda)){
             System.out.println("Este país ya existe");
        }else{
            System.out.println("Incorporando " + holanda );
           capitales.put("Holanda","Amsterdamm");
        }
        System.out.println("Lista actualizada");
        for(String clave : capitales.keySet()){
            System.out.println(clave +" =>" + capitales.get(clave));
        }
        
        
    }
}

        
        