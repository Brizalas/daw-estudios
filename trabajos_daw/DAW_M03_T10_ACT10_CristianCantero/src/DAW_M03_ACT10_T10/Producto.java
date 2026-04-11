
package DAW_M03_ACT10_T10;

import java.util.ArrayList;

/**
 *
 * @author cristiancantero
 */
public class Producto {
    private String nombre;
    private ArrayList<String>materiales;
    private double precio;
    private int cantidad;

    public Producto() {
        
    }

    public Producto(String nombre, ArrayList<String> materiales, double precio, int cantidad) {
        this.nombre = nombre;
        this.materiales = materiales;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<String> materiales) {
        this.materiales = materiales;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public int hashCode(){
        int result = this.nombre.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        
        Producto other = (Producto) obj;
        if(this.nombre==null){
            if(other.nombre !=null)
                return false;
            
        }else if(!nombre.equals(other.nombre))
            return false;
        return true;
    }
    
    
}
