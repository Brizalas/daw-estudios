package ACT15;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author cristiancantero
 */
@Entity
public class Factura  {
    @Id
    @GeneratedValue
    private int id;
    private Date fecha;
    private double total;
    @OneToMany(mappedBy= "factura", cascade = CascadeType.ALL)
    private List<DetalleFacturaCOMPLETA> detalles = new ArrayList<>();
    
    public Factura(){
        
    }
    
    public Factura(Date fecha, double tota){
       
        this.fecha = fecha;
        this.total = total;
        this.detalles = detalles;
    }
    
    public List<DetalleFacturaCOMPLETA> getDetalles(){
        return detalles;
    }
    public void setDetalles(List<DetalleFacturaCOMPLETA>detalles){
        this.detalles=detalles;
    }
    
    
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha =fecha;
    }
    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", fecha=" + fecha + ", total=" + total + ", detalles=" + detalles + '}';
    }
    
    
}
