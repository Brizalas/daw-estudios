package ejerciciotema7;

/*
EJERCICIO 3: Define una clase llamada "Gimnasio" que tenga una array de objetos
"Cliente" y un array de objetos "Entrenador". Implementa métodos para agregar 
clientes al gimnasio, asignar entrenadores a los clientes y mostrar la información 
de los clientes y entrenadores. No pueden haber más de 100 clientes, ni más de
10 entrenadores.*/
public class Gimnasio {

    

    // atributos--------------------------------------------------------------------
    public Cliente clientes[] = new Cliente[100];
    public Entrenador entrenadores[] = new Entrenador[10];
    public int contadorClientes;
    public int contadorEntrenadores;
    // constructor-----------------------------------------------------------------

    public Gimnasio() {
    }

    //métodos---------------------------------------------------------------------
    
    public void agregarCliente(Cliente cliente) {
        if (contadorClientes >= 100) {
            System.out.println("El aforo está lleno");
        } else {
            //Guardo el cliente recibido en el array de clientes, 
            //en la posición que indica el contador
            //Clientes en la posición condtadorClientes es igual al cliente recibido
            clientes[contadorClientes] = cliente;
            contadorClientes++;
        }
    }

    public void agregarEntrenador(Entrenador entrenador) {
        if (contadorEntrenadores >= 10) {
            System.out.println("No hay más puestos de entrenador vacantes");
        } else {
            entrenadores[contadorEntrenadores] = entrenador;
            contadorEntrenadores++;
        }
    }/*
    Estructura correcta del método asignarEntrenador:
    
    método
 ├─ for buscar cliente 
 ├─ for buscar entrenador
 ├─ if cliente no encontrado → mensaje + return
 ├─ if entrenador no encontrado → mensaje + return
 └─ asignación final

    */
    
    public void asignarEntrenador(String dniCliente, String codigoEntrenador){
        Cliente clienteEncontrado = null;
        Entrenador entrenadorEncontrado = null;//forma correcta de inicializar en este caso
        for(int i=0; i<contadorClientes;i++){ //buscar cliente
            if(clientes[i].getDni().equalsIgnoreCase(dniCliente)){
                clienteEncontrado = clientes[i];
                break;
            }
        }
        for(int i=0; i<contadorEntrenadores;i++){ //buscar entrenadores
            if(entrenadores[i].getCodigoEntrenador().equalsIgnoreCase(codigoEntrenador)){
                entrenadorEncontrado = entrenadores[i];
                break;
            }
        }
        
        if (clienteEncontrado == null){ //si cliente no encontrado mensaje + return
            System.out.println("Cliente no encontrado");
            return;
        }
        if(entrenadorEncontrado == null){ //si entrenador no encontrado mensaje + return
            System.out.println("entrenador no encontrado");
            return;
        }
        
        //asignación
        clienteEncontrado.setEntrenador(entrenadorEncontrado);
        entrenadorEncontrado.agregarCliente(clienteEncontrado);
    }
    
    public void mostrarClientes(){
        for (int i = 0; i < contadorClientes; i ++){
            Cliente c = clientes[i];
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("DNI: " + c.getDni());
            System.out.println("Edad: " + c.getEdad());
            System.out.println("Email: " + c.getEmail());
            
            if(c.getEntrenador() != null){
                System.out.println("Entrenador asignado: " + c.getEntrenador().getNombre());
            }else{
                System.out.println("Entrenador no asignado");
            }
            System.out.println();
        }
    }
    
    public void mostrarEntrenadores(){
        for (int i = 0; i<contadorEntrenadores;i++){
            Entrenador e = entrenadores[i];
            System.out.println("----------ENTRENADOR----------------");
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Código: " + e.getCodigoEntrenador());
            System.out.println("Edad: " + e.getEdad());
            System.out.println("Teléfono: " + e.getTelefono());
            System.out.println("Email: " + e.getEmail());
            System.out.println("Especialidad: "+ e.getEspecialidad());
            System.out.println("Excperiencia: " + e.getAniosExperiencia() + " años.");
            
            
            if(e.getContadorClientes() ==0){
                System.out.println("No hay clientes asignados todavía.");
            }else{
                System.out.println("Clientes asignados: ");
                for(int j=0; j<e.getContadorClientes(); j++){
                    Cliente c = e.getClientes()[j];
                    System.out.println("- " + c.getNombre()+ " (DNI: " + c.getDni() + ")");
                }
            }
            System.out.println();
        }
    }
    
    
    

    //getters y setters----------------------------------------------------------------
    
    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Entrenador[] getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenador[] entrenadores) {
        this.entrenadores = entrenadores;
    }
    public int getContadorClientes() {
        return contadorClientes;
    }

    public void setContadorClientes(int contadorClientes) {
        this.contadorClientes = contadorClientes;
    }

    public int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    public void setContadorEntrenadores(int contadorEntrenadores) {
        this.contadorEntrenadores = contadorEntrenadores;
    }

}
