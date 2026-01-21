package gimnasiotema7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaración de variables
        //lectura
        Scanner sc = new Scanner(System.in);
        //objeto gimnasio porque es el que administra entrenador y cliente
        Gimnasio gimnasio = new Gimnasio();
        //banderita booleana para lo que haga falta
        boolean valido = false;

        //bloque do/while para ejecutar los metodos de las clases
        do {
            try {
                //empieza el show
                System.out.println("Bienvenidos a GimAdministrator Plus ;D");
                System.out.println("--------------------------------------");
                System.out.println("1.Registrar cliente");
                System.out.println("2.Registrar entrenador");
                System.out.println("3.Asignar entrenador");
                System.out.println("4.Listado de clientes");
                System.out.println("5.Listado de entrenadores");
                System.out.println("0.Salir");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        //creamos objeto cliente para saber a quien nos referimos
                        Cliente cliente = new Cliente();

                        //pedimos los datos al user siguiendo el modelo:
                        //inicio modelo pedir y almacenar datos user ==>
                        System.out.println("Introduce el nombre: ");//imp pantalla pedir datos user
                        String nombre = sc.nextLine();//variable para almacenar datos user
                        cliente.setNombre(nombre);//asociación con el objeto a traves del método set
                        //fin modelo pedir y almacenar datos user //

                        //continuamos siguiendo el modelo tras cada entrada de datos...
                        System.out.println("Introduce el DNI: ");
                        String dni = sc.nextLine();
                        cliente.setDni(dni);
                        System.out.println("Introduce la edad: ");
                        int edad = Integer.parseInt(sc.nextLine());
                        cliente.setEdad(edad);
                        System.out.println("Introduce el telefono");
                        int telefono = Integer.parseInt(sc.nextLine());
                        cliente.setTelefono(telefono);
                        System.out.println("Introduce el e-mail");
                        String email = sc.nextLine();
                        cliente.setEmail(email);
                        System.out.println("Introduce la membresía. 1-Básica/2-Premium");
                        int membresia = Integer.parseInt(sc.nextLine());
                        cliente.setMembresia(membresia);

                        //hacer que el cliente entre en el sistema usando el método agregarCliente
                        gimnasio.agregarCliente(cliente);
                        break;
                    case 2:
                        Entrenador entrenador = new Entrenador();
                        System.out.println("Introduce el nombre: ");
                        String nombreEntrenador = sc.nextLine();
                        entrenador.setNombre(nombreEntrenador);
                        System.out.println("Introduce el código:");
                        int codigoEntrenador = Integer.parseInt(sc.nextLine());
                        entrenador.setCodigoEntrenenador(codigoEntrenador);
                        System.out.println("Introduce la edad: ");
                        int edadEntrenador = Integer.parseInt(sc.nextLine());
                        entrenador.setEdad(edadEntrenador);
                        System.out.println("Introduce el teléfono: ");
                        int telefonoEntrenador = Integer.parseInt(sc.nextLine());
                        entrenador.setTelefono(telefonoEntrenador);
                        System.out.println("Introduce el e-mail");
                        String emailEntrenador = sc.nextLine();
                        entrenador.setEmail(emailEntrenador);
                        System.out.println("Introduce la especialidad");
                        String especialidadEntrenador = sc.nextLine();
                        entrenador.setEspecialidad(especialidadEntrenador);
                        System.out.println("Introduce los años de experiencia");
                        int aniosExperiencia = Integer.parseInt(sc.nextLine());
                        entrenador.setExperiencia(aniosExperiencia);

                        //Introducir todos los datos en el sistema mediante agregarEntrenador
                        gimnasio.agregarEntrenador(entrenador);

                        break;

                    case 3:
                        System.out.println("Introduce el DNI del cliente: ");
                        String dniCliente = sc.nextLine();
                        System.out.println("Introduce el código de entrenador: ");
                        int codigoDeEntrenador = Integer.parseInt(sc.nextLine());
                        
                        gimnasio.asignarEntrenador(codigoDeEntrenador, dniCliente);
                        
                        break;
                    case 4:
                        
                        gimnasio.mostrarClientes();
                        break;
                    case 5:
                        gimnasio.mostrarEntrenadores();
                        break;
                    case 0:
                        System.out.println("Adios.");
                        return;
                    default:
                        System.out.println("Escribe una opcion válida");
                }

            } catch (Exception e) {
                System.out.println("error");
            }
        } while (!valido);
        sc.close();

    }

}
