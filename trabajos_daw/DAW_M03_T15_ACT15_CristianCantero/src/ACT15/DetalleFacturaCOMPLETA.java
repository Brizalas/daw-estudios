package ACT15;
import javax.persistence.*;

/**
 *
 * @author cristiancantero
 */
@Entity //--> esta clase se guarda en la base de datos
public class DetalleFacturaCOMPLETA {
    @Id // --> clave primaria
    @GeneratedValue // --> la BD genera el id automaticamente
    private int id;
    private int cantidad;
    private double precio;
    @ManyToOne
    private Producto producto;
    @ManyToOne
    private Factura factura;
    
    
    
    public DetalleFacturaCOMPLETA(){
        //constructor vacío
    }
    
    public DetalleFacturaCOMPLETA( int cantidad,double precio,Producto producto, Factura factura){
        //el id no se pasa porq es autoincrement, lleva el @GeneratedValue en el atributo
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
        this.factura=factura;
    }
    
    
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public Producto getProducto(){
        return producto;
    }
    public void setProducto (Producto producto){
        this.producto=producto;
    }
    public Factura getFactura(){
        return factura;
    }
    public void setFactura(Factura factura){
        this.factura =factura;
    }
}
