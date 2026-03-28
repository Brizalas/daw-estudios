package DAW_M03_T9_ACT9;

/**
 *
 * @author cristiancantero
 */
public class BaseDatos extends Asignatura implements precioTotal{
    Asignatura asignatura = new Asignatura();
    private String sistema;
    private String nivel;

    public BaseDatos() {
    }

    public BaseDatos(String sistema, String nivel) {
        this.sistema = sistema;
        this.nivel = nivel;
    }

    public BaseDatos(String sistema, String nivel, String nombre, int creditos) {
        super(nombre, creditos);
        this.sistema = sistema;
        this.nivel = nivel;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
     @Override
    public void calcularPrecioTotal(int credito){
        
        int precioTotal = asignatura.getCreditos() * 120;
    }
    
   
    
    
}
