package ACT15;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author cristiancantero
 */
@Entity
public class Cliente implements Serializable{
     @Id
     @GeneratedValue
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    
    public Cliente() {
        
    }

    public Cliente( String nombre, String direccion, String telefono) {
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }



   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
