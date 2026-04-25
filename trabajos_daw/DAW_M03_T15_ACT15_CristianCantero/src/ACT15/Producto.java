package ACT15;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author cristiancantero
 */
@Entity
public class Producto {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private double precio;
    private String categoria;
    @OneToMany(mappedBy="producto", cascade = CascadeType.ALL)
    private List <DetalleFacturaCOMPLETA> detalles = new ArrayList<>();
    
    public Producto(){
        
    }
    
    public Producto ( String nombre, double precio, String categoria){
        //id eliminado po rel autoincrement
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
        this.detalles=detalles;
        
    }
    
    public List<DetalleFacturaCOMPLETA> getDetalles(){
        return detalles;
    }
    public void setDetalles(){
        this.detalles=detalles;
    }
    
   
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(){
        this.precio = precio;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + ", detalles=" + detalles + '}';
    }
    
    
}
