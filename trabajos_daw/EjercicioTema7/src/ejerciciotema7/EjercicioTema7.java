package ejerciciotema7;

import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class EjercicioTema7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gimnasio gym = new Gimnasio();
        boolean valido = false;
        
        
        do{
            try{
                System.out.println("Gimnasio Administrator plus :D ");
                System.out.println("Escoge una opción");
                System.out.println("1.Registrar cliente nuevo. ");
                System.out.println("2.Registrar entrenador.");
                System.out.println("3.Asignar entrenador al cliente");
                System.out.println("4.Listado de clientes");
                System.out.println("5.Listado de entrenadores");
                System.out.println("0.Salir");
                int opcion = Integer.parseInt(sc.nextLine());
                switch(opcion){
                    case 1:
                        Cliente cliente = new Cliente();
                        System.out.println("Introduce el nombre:");
                        String nombre = sc.nextLine();
                        cliente.setNombre(nombre);
                        System.out.println("Introduce DNI: ");
                        String dni = sc.nextLine();
                        cliente.setDni(dni);
                        System.out.println("Introduce la edad");
                        int edad = Integer.parseInt(sc.nextLine());
                        cliente.setEdad(edad);
                        System.out.println("Introduce el telefono");
                        int telefono = Integer.parseInt(sc.nextLine());
                        cliente.setTelefono(telefono);
                        System.out.println("Introduce el e-mail");
                        String mail = sc.nextLine();
                        cliente.setEmail(mail);
                        System.out.println("Introduce la membresia. 1-Básica / 2-Premium");
                        int membresia = Integer.parseInt(sc.nextLine());
                        cliente.setMembresia(membresia);
                        gym.agregarCliente(cliente);//para que entre el cliente en el sistema
                        break;
                    case 2:
                        Entrenador entrenador = new Entrenador(); //se instancia un objeto Entrenador para representar un entrenador nuevo
                        System.out.println("Introduce el nombre: "); //se pregunta al user
                        String nombreEntrenador = sc.nextLine();//se guarda en variable local
                        entrenador.setNombre(nombreEntrenador);
                        System.out.println("Introduce el código del entrenador: ");
                        String codigoEntrenador = sc.nextLine();
                        entrenador.setCodigoEntrenador(codigoEntrenador);
                        System.out.println("Introduce la edad: ");
                        int edadEntrenador = Integer.parseInt(sc.nextLine());
                        entrenador.setEdad(edadEntrenador);
                        System.out.println("Introduce el teléfono: ");
                        int telefonoEntrenador = Integer.parseInt(sc.nextLine());
                        entrenador.setTelefono(telefonoEntrenador);
                        System.out.println("Introduce el e-mail:");
                        String emailEntrenador = sc.nextLine();
                        entrenador.setEmail(emailEntrenador);
                        System.out.println("Introduce la especialidad: ");
                        String especialidad = sc.nextLine();
                        entrenador.setEspecialidad(especialidad);
                        System.out.println("Introduce los años de experiencia: ");
                        int expe = Integer.parseInt(sc.nextLine());
                        entrenador.setAniosExperiencia(expe);//cuando el objeto está completo, se pasa al gimnasio
                        gym.agregarEntrenador(entrenador); //Gimnasio lo guarda en su array mediante agregarEntrenador
                        
                        break;
                    case 3: 
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Introduce un valor válido");
                }
            }catch(Exception e){
                System.out.println("yo");
            }
            
            System.out.println("¿Volver al menu principal?");
            String volver = sc.nextLine();
            
            if(volver.equalsIgnoreCase("s")){
                valido=false;
                
            }else{
                System.out.println("Volviendo al menú principal");
                valido=true;
            }
        }while(!valido);
        sc.close();
    }
    
}
