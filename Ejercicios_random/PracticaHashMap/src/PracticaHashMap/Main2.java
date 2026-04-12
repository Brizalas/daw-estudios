package PracticaHashMap;

import java.util.HashMap;

/**
 *
 * @author cristiancantero
 */
public class Main2 {
    public static void main(String[] args) {
        HashMap <Alumno,String> alumnos = new HashMap <Alumno,String>();
        
        Alumno a1 = new Alumno("Juan", "Perez", 20); //instanciar 
        Alumno a2 = new Alumno("Juan", "Perez", 20);
        Alumno a3 = new Alumno("Ana","Lopez",22);
        
//        alumnos.put(a1, "DAM");
//        alumnos.put(a2, "DAW");
    
        if(!alumnos.containsKey(a1)){ //introducir con containsKey()
            alumnos.put(a1, "DAW");
        }
        if(!alumnos.containsKey(a2)){
            alumnos.put(a2, "DAM");
        }
        if(!alumnos.containsKey(a3)){
            alumnos.put(a3,"ASIR");
        }
        
        System.out.println("Tamaño del mapa: " + alumnos.size());
        
//        la 
        
        System.out.println(alumnos);
        
//       alumnos.toString(); //mostrar usando toString()
        
        
    }
}
