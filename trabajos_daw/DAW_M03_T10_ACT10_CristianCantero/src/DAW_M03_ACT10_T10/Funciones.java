package DAW_M03_ACT10_T10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Funciones {

    private HashMap<String, Producto> listaProductos = new HashMap<>();
    private ArrayList<String> materiales = new ArrayList<>();
    
    
    public Funciones(){
        
    }
    
    public void ingresarProducto(HashMap<String,Producto>listaProductos, Producto p){
         boolean existe = false;
        for(Producto pro : listaProductos.values()){
           
            if(pro.equals(p)){
               
                existe = true;
                break;
            }
        }
        if(existe){
            System.out.println("El producto ya existe");
        }else{
            String codigo = "P" + (listaProductos.size()+1);
            listaProductos.put(codigo,p);
            System.out.println("Producto añadido con código: " + codigo);
        }
        System.out.println("====Lista de productos====");
        for(Producto pr : listaProductos.values()){
            System.out.println(pr);
        }
    }

    public void agregarProducto(Scanner sc) {

        Producto p = new Producto();
        boolean mats = false;
        System.out.println("Introduce el nombre del producto: ");
        String nombre = sc.nextLine();
        p.setNombre(nombre);
        do {
            try {
                System.out.println("Introduce el material");
                String material = sc.nextLine();
                materiales.add(material);

                System.out.println("¿Quieres introducir más materiales? S/N");
                String introducir = sc.nextLine();
                if (introducir.equalsIgnoreCase("s")) {
                    mats = false;
                } else {
                    mats = true;
                }

            } catch (Exception e) {
                System.out.println("Ingresa una opcion válida");
            }
        } while (!mats);
        System.out.println("Introduce el precio");
        double precio = sc.nextDouble();
        sc.nextLine();
        p.setPrecio(precio);
        System.out.println("Introduce la cantidad");
        int cantidad = sc.nextInt();
        sc.nextLine();
        p.setCantidad(cantidad);
        
        ingresarProducto(listaProductos, p);

    }
    
    public void eliminarProducto(Scanner sc, HashMap<String,Producto>listaProductos){
        System.out.println("Introduce el nombre a eliminar: ");
        String nombreEliminar = sc.nextLine();
        
        String claveAEliminar = null;
        
        for(String clave :listaProductos.keySet()){
            Producto product=listaProductos.get(clave);
            
            if(product.getNombre().equalsIgnoreCase(nombreEliminar)){
                claveAEliminar = clave;
                break;
            }
        }
        if(claveAEliminar != null){
            listaProductos.remove(claveAEliminar);
            System.out.println("Producto eliminado");
        }else{
            System.out.println("No se encontró el producto");
        }
    }
    
    public void actualizarProducto(Scanner sc, HashMap<String,Producto> listaProductos){
        System.out.println("Introduce el producto que quieres modificar");
        String nombreModificar=sc.nextLine();
        
        boolean encontrado = false;
        
        for(Producto pro : listaProductos.values()){
            if(pro.getNombre().equalsIgnoreCase(nombreModificar)){
                
                System.out.println("Introduce el nuevo precio: ");
                double nuevoPrecio = sc.nextDouble();
                sc.nextLine();
                pro.setPrecio(nuevoPrecio);
                
                System.out.println("Introduce la nueva cantidad: ");
                int nuevaCantidad = sc.nextInt();
                sc.nextLine();
                pro.setCantidad(nuevaCantidad);
                
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encuentra el producto");
        }
    }
}//comentario de cambio
