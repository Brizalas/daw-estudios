package DAW_M03_T9_ACT9;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {
    public static void main(String [] args){
        
        
        Asignatura [] asignatura = new Asignatura[20];
        Programacion p1 = new Programacion("Java","Básico", "Programacion", 6);
        BaseDatos bd1 = new BaseDatos("MySQL","Básico","Bases de datos", 4);
        
        asignatura[0]= p1;
        asignatura[1]= bd1;
        
        for(int i = 0; i < asignatura.length; i ++){
            if(asignatura[i]!=null){
                asignatura[i].mostrarInformacion();
                System.out.println("Precio total: " + asignatura[i].calcularPrecioTotal());
                System.out.println("-----------------------------");
            }
           
                
            
        }
        
       
        
        
   }
}
