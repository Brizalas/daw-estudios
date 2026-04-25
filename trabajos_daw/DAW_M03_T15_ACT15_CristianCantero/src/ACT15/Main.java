package ACT15;

import javax.persistence.*;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/tienda.odb");
        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        
        do{
            try{
                System.out.println("MENU PRINCIPAL");
                System.out.println("1. Insertar cliente");
                System.out.println("2. Insertar producto");
                System.out.println("3. Realizar compra");
                System.out.println("4. Mostrar clientes");
                System.out.println("5. Mostrar productos");
                System.out.println("6. Mostrar facturas");
                System.out.println("0. Salir");
                int pocion = Integer.parseInt(sc.nextLine());
                
                switch(pocion){
                    case 1:
                        insertarCliente(em, sc);
                        break;
                    case 2:
                        insertarProducto(em, sc);
                        break;
                    case 3:
                        insertarFactura(em, sc);
                        break;
                    case 4:
                        mostrarClientes(em);
                        break;
                    case 5:
                        mostrarProductos(em);
                        break;
                    case 6:
                        mostrarFacturas(em);
                        break;
                    case 0:
                        System.out.println("Adios");
                        salir = true;
                }
                
            }catch(NumberFormatException e){
                    System.out.println("Opcion no válida");
                    continue;
                    }
        }while(!salir);

    }

    public static void insertarCliente(EntityManager em, Scanner sc) {

        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la dirección: ");
        String direccion = sc.nextLine();
        System.out.println("Introduce el telefon: ");
        String telefono = sc.nextLine();

        Cliente c = new Cliente(nombre, direccion, telefono);

        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            System.out.println("Cliente insertado correctamente");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al insertar cliente");
            e.printStackTrace();
        }
    }

    public static void insertarProducto(EntityManager em, Scanner sc) {
        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede esatr vacío");
            return;
        }
        System.out.println("Introduce  el precio");
        double precio;
        try {
            precio = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Precio no válido");
            return;
        }
        System.out.println("Introduce la categoría");
        String categoria = sc.nextLine().trim();

        Producto p = new Producto(nombre, precio, categoria);

        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            System.out.println("Producto insertado correctamente");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al insertar el producto");
            e.printStackTrace();
        }
    }

    public static void insertarFactura(EntityManager em, Scanner sc) {
        Factura f = new Factura(new Date(), 0.0); //crear factura
        Producto p = new Producto("Camiseta", 20.0, "Ropa"); //crear producto
        System.out.println("Introduce la cantidad");//pedir cantidad
        int cantidad;

        try {
            cantidad = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Cantidad no válida");
            return;
        }

        DetalleFacturaCOMPLETA d = new DetalleFacturaCOMPLETA(cantidad, p.getPrecio(), p, f);
        f.getDetalles().add(d);
        p.getDetalles().add(d);

        try {
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
            System.out.println("Factura insertada.");

        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error al insertar la factura");
        }
    }

    public static void mostrarClientes(EntityManager em) {
        var lista = em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();

        for (Cliente c : lista) {
            System.out.println(c);
        }
    }

    public static void mostrarProductos(EntityManager em) {
        var lista = em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();

        for (Producto p : lista) {
            System.out.println(p);
        }
    }

    public static void mostrarFacturas(EntityManager em) {
        var lista = em.createQuery("SELECT f FROM Factura f", Factura.class).getResultList();

        for (Factura f : lista) {
            System.out.println(f);
        }
    }

}
