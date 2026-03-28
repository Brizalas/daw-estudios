package ACT_08;



/**
 *
 * @author cristiancantero
 */
public class Comida extends Producto implements Coccion {

    private String caducidad;
    private String tipo;
    private int TipoDeCoccion;

    public Comida() {
    }

    public Comida(String caducidad, String tipo, int TipoDeCoccion) {
        this.caducidad = caducidad;
        this.tipo = tipo;
        this.TipoDeCoccion = TipoDeCoccion;
    }

    public Comida(String caducidad, String tipo, int TipoDeCoccion, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.caducidad = caducidad;
        this.tipo = tipo;
        this.TipoDeCoccion = TipoDeCoccion;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTipoDeCoccion() {
        return TipoDeCoccion;
    }

    public void setTipoDeCoccion(int TipoDeCoccion) {
        this.TipoDeCoccion = TipoDeCoccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void tipoCoccion(int tipo) {

        if (tipo >= 1 && tipo < 3) {
            if (tipo >= 0 && tipo <= 2) {

                this.TipoDeCoccion = tipo;
            } else {
                System.out.println("Tipo de cocción no válido");
            }
        }

    }

}
