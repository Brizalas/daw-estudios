package DAW_M03_T9_ACT9;


/**
 *
 * @author cristiancantero
 */
public class Programacion extends Asignatura{
    
    private String lenguaje;
    private String nivel;

    public Programacion() {
    }

    public Programacion(String lenguaje, String nivel) {
        this.lenguaje = lenguaje;
        this.nivel = nivel;
    }

    public Programacion(String lenguaje, String nivel, String nombre, int creditos) {
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
    public int calcularPrecioTotal(){
        int resultado = getCreditos() * 120;
        return resultado;
    }
    
    
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Asignatura: " + getNombre());
        System.out.println("Creditos: " + getCreditos());
        System.out.println("Lenguaje: " + getLenguaje());
        System.out.println("Nivel: " + getNivel());
        System.out.println(calcularPrecioTotal());
        
    }

  }
