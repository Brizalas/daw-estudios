package ACT_08;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Tienda {

    private Comida[] comida = new Comida[100];
    private Bebida[] bebida = new Bebida[100];
    private int contadorComidas;
    private int contadorBebidas;

    public Tienda() {

    }

    public void ingresarComida(Comida nuevaComida) {
        if (contadorComidas < comida.length) {
            comida[contadorComidas] = nuevaComida;
            contadorComidas++;
        } else {
            System.out.println("Ya no caben más comidas");
        }

    }

    public void ingresarBebida(Bebida nuevaBebida) {
        if (contadorBebidas < bebida.length) {
            bebida[contadorBebidas] = nuevaBebida;
            contadorBebidas++;
        } else {
            System.out.println("Ya no caben más bebidas");
        }
    }

    public void agregarComida(Scanner sc) {
        Comida c = new Comida();
        System.out.println("Nombre de la comida: ");
        String nombre = sc.nextLine();
        c.setNombre(nombre);
        System.out.println("Ingresa el precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        c.setPrecio(precio);
        System.out.println("Ingresa la cantidad: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        c.setCantidad(cantidad);
        System.out.println("Ingresa la caducidad: ");
        String caducidad = sc.nextLine();
        c.setCaducidad(caducidad);
        System.out.println("Ingresa el tipo de comida");
        String tipo = sc.nextLine();
        c.setTipo(tipo);

        int tipoDeCoccion;
        do {
            System.out.println("Ingresa el tipo de cocción 1.sarten/2.horno/3.Microondas ");
            tipoDeCoccion = sc.nextInt();
            sc.nextLine();

            if (tipoDeCoccion < 1 || tipoDeCoccion > 3) {
                System.out.println("Opción inválida");
            }
        } while (tipoDeCoccion < 1 || tipoDeCoccion > 3);

        ingresarComida(c);

    }

    public void agregarBebida(Scanner sc) {
        Bebida b = new Bebida();
        System.out.println("Ingresa nombre");
        String nombre = sc.nextLine();
        b.setNombre(nombre);
        System.out.println("Ingresa precio");
        double precio = sc.nextDouble();
        sc.nextLine();
        b.setPrecio(precio);
        System.out.println("Ingresa cantidad");
        int cantidad = sc.nextInt();
        sc.nextLine();
        b.setCantidad(cantidad);
        System.out.println("Ingresa las unidades");
        double unidad = sc.nextDouble();
        sc.nextLine();
        b.setUnidad(unidad);
        System.out.println("Ingresa el sabor");
        String sabor = sc.nextLine();
        b.setSabor(sabor);
        ingresarBebida(b);

    }

    public void mostrarStock() {
        System.out.println("--- STOCK ---");
        System.out.println("-Comidas-");
        for (int i = 0; i < contadorComidas; i++) {
            Comida c = comida[i];
            System.out.println();
            System.out.println("Comida: " + (i + 1) + c.getNombre());
            System.out.println("Precio: " + c.getPrecio());
            System.out.println("Precio total: " + c.obtenerPrecioTotal());
            System.out.println("Tipo de cocción: " + c.getTipoDeCoccion());
            System.out.println();
        }

        for (int i = 0; i < contadorBebidas; i++) {
            Bebida b = bebida[i];
            System.out.println();
            System.out.println("Bebida: " + (i + 1) + b.getNombre());
            System.out.println("Precio: " + b.getPrecio());
            System.out.println("Precio total: " + b.obtenerPrecioTotal());
            System.out.println();
        }

    }

}
