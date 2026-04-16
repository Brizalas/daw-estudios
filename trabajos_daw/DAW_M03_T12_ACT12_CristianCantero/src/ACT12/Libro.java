
package ACT12;
 import java.io.Serializable;

/**
 *
 * @author cristiancantero
 */

public class Libro implements Serializable {

    private String autor;
    private String titulo;
    private int anyo;
    private transient double precio; // NO se serializa

    public Libro(String autor, String titulo, int anyo, double precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.anyo = anyo;
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + anyo +
                ", precio=" + precio +
                '}';
    }
}

