package ACT11;


import java.util.HashMap;



/**
 *
 * @author cristiancantero
 */
public class Funciones {

    private HashMap<String, Libro> listaLibros = new HashMap<>();
   
   
    
    public void agregarLibro(String titulo, int stock) throws ExcepcionExiste{
        titulo = titulo.toLowerCase(); //para q no me pillen mays y minusc
        if(listaLibros.containsKey(titulo)){
            throw new ExcepcionExiste("Este libro ya existe en el stock");
        } else {
            Libro libro = new Libro(titulo, stock);
            listaLibros.put(titulo,libro);
            System.out.println("Libro añadido correctamente");
        }
        
       }
    public void venderLibro(String titulo)throws ExcepcionNullLibro, ExcepcionStockAgotado{
        titulo = titulo.toLowerCase().trim();
        Libro libro = listaLibros.get(titulo);
        if (libro == null){
           throw new ExcepcionNullLibro("El libro no existe");
        }
        if(libro.getStock()==0){
           throw new ExcepcionStockAgotado("El stock está agotado");
        }
        
        libro.setStock(libro.getStock()-1);
        System.out.println("Libro vendido correctamente");
    }
    
    public Libro buscarLibro(String titulo) throws ExcepcionNullLibro{
        titulo = titulo.toLowerCase();
        Libro libro = listaLibros.get(titulo);
           if(libro == null){
               throw new ExcepcionNullLibro("El libro no existe");
           }
           return libro;
    }
    
}
    
       
        
   
        
        
        
 