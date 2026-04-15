package ACT11;



/**
 *
 * @author cristiancantero
 */
public class Libro {
    private String titulo;
    private int stock;
    

    public Libro() {
    }

    public Libro(String titulo, int stock) {
        this.titulo = titulo;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro: " + "Titulo= " + titulo + " | " + " stock= " + stock;
    }
    
    
    
    
}
