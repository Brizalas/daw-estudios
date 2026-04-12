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
        
        for(Producto pro : listaProductos.values()){
            if(pro.equals(p)){
                System.out.println("Ya existe");
            }
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
}
