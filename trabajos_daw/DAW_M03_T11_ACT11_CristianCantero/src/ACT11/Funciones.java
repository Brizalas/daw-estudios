package ACT11;

import java.io.IOException;
import java.util.HashMap;



/**
 *
 * @author cristiancantero
 */
public class Funciones {

    private HashMap<String, Libro> listaLibros = new HashMap<>();
    Libro l = new Libro();
   
    
    public void agregarLibro(String titulo, int stock) {
        titulo = titulo.toLowerCase(); //para q no me pillen mays y minusc
        if(listaLibros.containsKey(titulo)){
            System.out.println("Este título ya existe.");
        } else {
            Libro libro = new Libro(titulo, stock);
            listaLibros.put(titulo,libro);
            System.out.println("Libro añadido correctamente");
        }
        
       }
    public void venderLibro(String titulo)throws ExcepcionNullLibro, ExcepcionStockAgotado{
        Libro libro = listaLibros.get(titulo);
        if (libro == null){
           throw new ExcepcionNullLibro("El libro no existe");
        }
        if(libro.getStock()==0){
           throw new ExcepcionStockAgotado("El stock está agotado");
        }
        
        libro.setStock(libro.getStock()-1);
    }
    
}
    
       
        
   
        
        
        
 