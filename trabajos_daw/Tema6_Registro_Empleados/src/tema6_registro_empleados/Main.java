package tema6_registro_empleados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int opcion = 0;

        do {
            try {
                System.out.println("REGISTRO DE EMPLEADOS");
                System.out.println("Selecciona una opción");
                System.out.println("1.Registrar empleado");
                System.out.println("2.Buscar empleado");
                System.out.println("3.Eliminar empleado");
                System.out.println("4.Mostrar todos los empleados");
                System.out.println("0.Salir");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        registrarEmpleado(sc);
                        break;
                    case 2:
                        buscarEmpleado(sc);
                        break;
                    case 3:
                        eliminarEmpleado(sc);
                        break;
                    case 4:
                        mostrarLista(sc); //aunque este método no pide nada al user, contiene una llamada a una función que en caso de q se active si tiene sc
                        break;
                    case 0:
                        System.out.println("Adios.");
                        return;
                    default:
                        System.out.println("Introduce un número válido");
                }
            } catch (Exception e) {
                System.out.println("Error en el catch");
            }
        } while (!valido);

        System.out.println("Programa cerrado correctamente.");
    }

    //función registrar empleado -----------------------------------------------------------
    public static void registrarEmpleado(Scanner sc) throws IOException {
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta + sep + "archivo.txt");
        if (!archivo.exists()) { //puse una opción por si no había archivo en este punto...
            System.out.println("Este archivo no existe");//si, he reutilizado código ... XD
            System.out.println("¿Crear uno? S/N");
            String crearUno = sc.nextLine();
            try {
                if (crearUno.equalsIgnoreCase("s")) {
                    registrarEmpleado(sc);
                } else if(crearUno.equalsIgnoreCase("n")) {
                    System.out.println("Volviendo al menú principal...");
                    return;
                }else{
                    System.out.println("Introduce S ó N");
                }
            } catch (Exception e) {
                System.out.println("Introduce carácteres válidos.");
            }
            return;
        }

        System.out.println("");
        System.out.println("Registra los datos del empleado:");
        System.out.println("");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("dni: ");
        String dni = sc.nextLine();
        System.out.println("Puesto: ");
        String puesto = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(nombre + ";" + apellido + ";" + edad + ";" + dni + ";" + puesto);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error en la escritura del registro");
        }
    }

    //Funcion buscar empleado-----------------------------------------
    public static void buscarEmpleado(Scanner sc) throws IOException {
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta + sep + "archivo.txt");
        if (!archivo.exists()) { //puse una opción por si no había archivo en este punto...
            System.out.println("Este archivo no existe");//si, he reutilizado código ... XD
            System.out.println("¿Crear uno? S/N");
            String crearUno = sc.nextLine();
            try {
                if (crearUno.equalsIgnoreCase("s")) {
                    registrarEmpleado(sc);
                } else if(crearUno.equalsIgnoreCase("n")) {
                    System.out.println("Volviendo al menú principal...");
                    return;
                }else{
                    System.out.println("Introduce S ó N");
                }
            } catch (Exception e) {
                System.out.println("Introduce carácteres válidos.");
            }
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            System.out.println("Introduce el nombre a buscar: "); //lo podría hacer por DNI pero para testear el programa es más fácil por nombre
            String nombreBuscar = sc.nextLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                String[] datos = linea.split(";");
                if (datos.length != 5) {
                    System.out.println("Línea corrupta en: " + linea);
                }
                String nombreEncontrado = datos[0].trim();
                if (nombreBuscar.equalsIgnoreCase(nombreEncontrado)) {
                    System.out.println("--------------------------------");
                    System.out.println("Nombre: " + datos[0].trim());
                    System.out.println("Apellido: " + datos[1].trim());
                    System.out.println("Edad: " + datos[2].trim());
                    System.out.println("DNI: " + datos[3].trim());
                    System.out.println("Puesto: " + datos[4].trim());
                    System.out.println("--------------------------------");
                }

            }
        }
    }

    /*Función eliminar empleado:
    para esta función buscamos en el archivo el nombre. Si la función lo encuentra,
    reescribirá otro archivo omitiendo el nombre encontrado. El resultado de esta 
    re-escritura se volverá a escribir en el archivo inicial con la cual cosa el 
    resultado será un borrado del dato requerido por el usuario.
     */
    public static void eliminarEmpleado(Scanner sc) throws IOException {
        System.out.println("Escribe el nombre a eliminar.");
        String nombreBorrar = sc.nextLine();
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta + sep + "archivo.txt");
       if (!archivo.exists()) { //puse una opción por si no había archivo en este punto...
            System.out.println("Este archivo no existe");//si, he reutilizado código ... XD
            System.out.println("¿Crear uno? S/N");
            String crearUno = sc.nextLine();
            try {
                if (crearUno.equalsIgnoreCase("s")) {
                    registrarEmpleado(sc);
                } else if(crearUno.equalsIgnoreCase("n")) {
                    System.out.println("Volviendo al menú principal...");
                    return;
                }else{
                    System.out.println("Introduce S ó N");
                }
            } catch (Exception e) {
                System.out.println("Introduce carácteres válidos.");
            }
            return;
        }
        ArrayList<String> recuperado = new ArrayList<>();  //aquí re-escribo el array pral.
        boolean valido = false; //bandera booleana para cuando recupere el archivo

        //primero leemos para encontrar el dato pedido por el user:
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                String[] datos = linea.split(";");
                String nombreEncontrado = datos[0].trim();
                if (datos.length != 5) {
                    System.out.println("Error en la linea " + linea);

                }
                if (nombreEncontrado.equalsIgnoreCase(nombreBorrar)) {
                    valido = true;
                    continue;
                } else {
                    recuperado.add(linea);
                }
                

            }
        } catch (IOException e) {
            System.out.println("Error leyendo la linea: " + e.getMessage());
        }
        
        if (!valido) {
                    System.out.println("Empleado no encontrado");
                    return;
                }

        //Reescribimos el archivo sin el nombre encontrado:
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {
            for (String linea : recuperado) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("error borrando: " + e.getMessage());
        }

        System.out.println("Empleado eliminado correctamente");
    }

    //MOstrar todos los empleados
    public static void mostrarLista(Scanner sc) {
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta + sep + "archivo.txt");
        if (!archivo.exists()) { //puse una opción por si no había archivo en este punto...
            System.out.println("Este archivo no existe");//si, he reutilizado código ... XD
            System.out.println("¿Crear uno? S/N");
            String crearUno = sc.nextLine();
            try {
                if (crearUno.equalsIgnoreCase("s")) {
                    registrarEmpleado(sc);
                } else if(crearUno.equalsIgnoreCase("n")) {
                    System.out.println("Volviendo al menú principal...");
                    return;
                }else{
                    System.out.println("Introduce S ó N");
                }
            } catch (Exception e) {
                System.out.println("Introduce carácteres válidos.");
            }
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;

                }
                String[] datos = linea.split(";");
                if (datos.length != 5) {
                    System.out.println("error en la linea: " + linea);
                }
                System.out.println("--------------------------------");
                System.out.println("Nombre: " + datos[0].trim());
                System.out.println("Apellido: " + datos[1].trim());
                System.out.println("Edad: " + datos[2].trim());
                System.out.println("DNI: " + datos[3].trim());
                System.out.println("Puesto: " + datos[4].trim());
                System.out.println("--------------------------------");

            }
        } catch (IOException e) {
            System.out.println("error en la lectura" + e.getMessage());
        }
    }

}
