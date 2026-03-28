package ACT_08;

/**
 *
 * @author cristiancantero
 */
public class Bebida extends Producto{
    private double unidad;
    private String sabor;

    public Bebida() {
    }

    public Bebida(double unidad, String sabor) {
        this.unidad = unidad;
        this.sabor = sabor;
    }

    public Bebida(double unidad, String sabor, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.unidad = unidad;
        this.sabor = sabor;
    }

    public double getUnidad() {
        return unidad;
    }

    public void setUnidad(double unidad) {
        this.unidad = unidad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    
    
    
    
    
    
    
    
    
}
