package Act07;

import java.util.Scanner;

public class Gimnasio {

    /*
    patrón:
        array + contador + método añadir
     */
    private Cliente[] clientes = new Cliente[100];
    private Entrenador[] entrenadores = new Entrenador[10];  //==> array
    private int numClientes;  //==> contador
    private int numEntrenadores;

    public Gimnasio() { //constructor vacío 
    }
    //==> Métodos

    public void agregarCliente(Cliente nuevoCli) {
        if (numClientes < clientes.length) {
            clientes[numClientes] = nuevoCli;
            numClientes++;
        } else {
            System.out.println("Aforo completo");
        }
    }

    public void crearCliente(Scanner sc) {
        Cliente c = new Cliente();

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        c.setNombre(nombre);
        System.out.println("Dni: ");
        String dni = sc.nextLine();
        c.setDni(dni);
        System.out.println("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        c.setEdad(edad);
        System.out.println("E-mail: ");
        String email = sc.nextLine();
        c.setEmail(email);
        System.out.println("Teléfono: ");
        String telefono = sc.nextLine();
        c.setTelefono(telefono);
        System.out.println("Membresía (1. premium/ 2. básico: ");

        int membresia = Integer.parseInt(sc.nextLine());
        if (membresia != 1 && membresia != 2) {
            System.out.println("Usa 1 o 2");
        }
        c.setMembresia(membresia);
        agregarCliente(c);
    }

    public void agregarEntrenador(Entrenador nuevoEnt) {
        if (numEntrenadores < entrenadores.length) {
            entrenadores[numEntrenadores] = nuevoEnt;
            numEntrenadores++;
        } else {
            System.out.println("Aforo completo");
        }
    }
    
    public void crearEntrenador(Scanner sc){
            Entrenador e = new Entrenador();
            System.out.println("Nombre: "); String nombre = sc.nextLine(); 
            e.setNombre(nombre);
            System.out.println("Código de entrenador: " ); int codigoEntrenador = sc.nextInt(); sc.nextLine();
            e.setCodigoEntrenador(codigoEntrenador);
            System.out.println("E-mail: "); String email = sc.nextLine();
            e.setEmail(email);
            System.out.println("Edad: "); int edad = sc.nextInt(); sc.nextLine();
            e.setEdad(edad);
            System.out.println("Especialidad: "); String especialidad = sc.nextLine();
            e.setEspecialidad(especialidad);
            System.out.println("Años de experiencia: "); int experiencia = sc.nextInt(); sc.nextLine();
            e.setExperiencia(experiencia);
            System.out.println("Teléfono: "); int telefono = sc.nextInt(); sc.nextLine();
            e.setTelefono(telefono);
            agregarEntrenador(e);
    }

    public void asignarEntrenador(String dniCliente, int codigoEntrenador) {
        Cliente clienteEncontrado = null;
        Entrenador entrenadorEncontrado = null;

        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getDni().equalsIgnoreCase(dniCliente)) {
                clienteEncontrado = clientes[i];
                break;
            }
        }

        for (int i = 0; i < numEntrenadores; i++) {
            if (entrenadores[i].getCodigoEntrenador() == (codigoEntrenador)) {
                entrenadorEncontrado = entrenadores[i];
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("No se encontró cliente");
            return;
        }
        if (entrenadorEncontrado == null) {
            System.out.println("No se encontró entrenador");
            return;
        }
        //Asignación
        clienteEncontrado.setEntrenador(entrenadorEncontrado);
        entrenadorEncontrado.agregarNuevoCliente(clienteEncontrado);
        //Patrón: Relación bidireccional
    }

    public void mostrarInfoClientes() {
        System.out.println("--Listado de clientes--");
        for (int i = 0; i < numClientes; i++) {
            Cliente c = clientes[i]; // acostumbrate a mirar 'parriba'

            System.out.println();
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("Dni:" + c.getDni());
            System.out.println("Edad:" + c.getEdad());
            System.out.println("Email:" + c.getEmail());
            System.out.println("Teléfono:" + c.getTelefono());
            System.out.println("Membresía: " + c.getMembresia());
            if (c.getMembresia() == 1) {
                System.out.println("Membresia Básica");
            } else {
                System.out.println("Membresia Premium");
            }

            if (c.getEntrenador() != null) {
                System.out.println("Entrenador: " + c.getEntrenador().getNombre());
            } else {
                System.out.println("Este cliente no tiene entrenador asignado");
            }
        }
    }

    public void mostrarInfoEntrenadores() {
        System.out.println("--Listado Entrenadores--");
        for (int i = 0; i < numEntrenadores; i++) {
            Entrenador e = entrenadores[i];
            Cliente[] lista = e.getClientesAsignados();

            System.out.println();
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Código de entrenador: " + e.getCodigoEntrenador());
            System.out.println("Edad: " + e.getEdad());
            System.out.println("Especialidad: " + e.getEspecialidad());
            System.out.println("Experiencia: " + e.getExperiencia() + " años.");
            System.out.println("Teléfono: " + e.getTelefono());

            if (e.getNumDeClientesAsignados() == 0) {
                System.out.println("Este entrenador no tiene clientes asignados");
            } else {
                System.out.println("--Clientes de " + e.getNombre() + " --");
                for (int j = 0; j < e.getNumDeClientesAsignados(); j++) {
                    Cliente c = lista[j];
                    System.out.println("-----------------------------------");
                    System.out.println("Nombre del cliente: " + c.getNombre());
                    System.out.println("Dni del cliente: " + c.getDni());
                    System.out.println();

                }
            }//patron: estructura de datos anidada
        }
    }

}
