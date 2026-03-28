package DAW_M03_T9_ACT9;


/**
 *
 * @author cristiancantero
 */
public class Progamacion extends Asignatura implements precioTotal {
    Asignatura asignatura = new Asignatura();
    private String lenguaje;
    private String nivel;

    public Progamacion() {
    }

    public Progamacion(String lenguaje, String nivel) {
        this.lenguaje = lenguaje;
        this.nivel = nivel;
    }

    public Progamacion(String lenguaje, String nivel, String nombre, int creditos) {
        super(nombre, creditos);
        this.lenguaje = lenguaje;
        this.nivel = nivel;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
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
