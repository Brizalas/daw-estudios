package PracticaArrayList;

import java.util.ArrayList;

/**
 *
 * @author cristiancantero
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> miArrayList = new ArrayList<>();
        miArrayList.add("Juan");
        miArrayList.add("Jonas");
        miArrayList.add("Peter");

        System.out.println("Tamaño: " + miArrayList.size());
        for (int i = 0; i < miArrayList.size(); i++) {
            System.out.println(miArrayList.get(i));
        }
//        String nombreBuscado = "Peter";
//        if(miArrayList.contains("Peter")){
//            System.out.println("El nombre buscado está en la lista");
//        }else{
//            System.out.println("El nomber NO está en la lista");
//        }

        String nombreBuscado = "Jonas";
        int posicion = miArrayList.indexOf(nombreBuscado);
        if (miArrayList.contains(nombreBuscado)) {
            String elemento = miArrayList.get(posicion);
            System.out.println("Elemento encontrado: " + elemento);
            System.out.println("El nombre que buscas: " + nombreBuscado + ", está en la posición " + posicion);
        } else {
            System.out.println("No está en la lista");
        }
        miArrayList.set(1,"Pietro");
        String nombreNuevo = miArrayList.get(1);
        System.out.println("Ahora en la posción " + posicion +" la persona se llamará: " + nombreNuevo);
        
        System.out.println("Ahora el array queda asi:");
        System.out.println();
        
        System.out.println("Tamaño: " + miArrayList.size());
        for (int i = 0; i < miArrayList.size(); i++) {
            System.out.println(miArrayList.get(i));
        }

    }
}
