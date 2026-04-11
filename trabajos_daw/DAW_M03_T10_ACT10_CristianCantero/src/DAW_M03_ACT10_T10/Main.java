package DAW_M03_ACT10_T10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashMap<String,Producto>listaProductos = new HashMap<>();
        ArrayList<String>materiales= new ArrayList<>();
        Producto p1 = new Producto("Mesa", materiales,100,5);
        p1.getMateriales().add("madera");
        p1.getMateriales().add("clavo");
        p1.getMateriales().add("romero");
        
        for (int i = 0; i < materiales.size(); i++) {
            System.out.println(("Material ")+(i+1)+(" ")+materiales.get(i));
        }
        
        for(String m : materiales){
            System.out.println(m); 
        }
        
        
       
        
    }
}
