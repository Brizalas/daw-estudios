package practicaequals;

/**
 *
 * @author cristiancantero
 */
public class Producto {
    String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object obj){
        Producto other = (Producto) obj;
        return nombre.equals(other.nombre);
    }
    
    @Override
    public int hashCode(){
        return nombre.hashCode();
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
