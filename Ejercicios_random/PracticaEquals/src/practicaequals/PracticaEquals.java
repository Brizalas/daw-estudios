package practicaequals;
import java.util.HashMap;
/**
 *
 * @author cristiancantero
 */
public class PracticaEquals {

    public static void main(String[] args) {
      HashMap<Producto, String> mapa = new HashMap<>();
      
      Producto p1 = new Producto ("Mesa1");
      Producto p2 = new Producto ("Mesa2");
      
      mapa.put(p1,"IKEA");
      mapa.put(p2,"Amazon");
      
        System.out.println("Tamaño: " + mapa.size());
        
        for(Producto clave : mapa.keySet()){
            System.out.println(clave+ " --> " + mapa.get(clave));
        }
    }
    
    
    
}