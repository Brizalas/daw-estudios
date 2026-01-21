package gimnasiotema7;

/*
EJERCICIO 3: Define una clase llamada "Gimnasio" que tenga una array de objetos
"Cliente" y un array de objetos "Entrenador". Implementa métodos para agregar 
clientes al gimnasio, asignar entrenadores a los clientes y mostrar la información 
de los clientes y entrenadores. No pueden haber más de 100 clientes, ni más de
10 entrenadores.*/

public class Gimnasio {
    //atributos
    public Cliente clientes[]=new Cliente[100];
    public Entrenador entrenadores[]=new Entrenador[10];
    public int contadorClientes;
    public int contadorEntrenadores;
    //constructor

    public Gimnasio() {
    }
    //métodos
    public void agregarCliente(Cliente cliente){
        if(contadorClientes>=100){
            System.out.println("Aforo completo.");
        }else{
            clientes[contadorClientes]=cliente;
            contadorClientes ++;
    }
    }
    
    public void agregarEntrenador(Entrenador entrenador){
        if(contadorEntrenadores>=10){
            System.out.println("Aforo de entrenadores completo");
        }else{
            entrenadores[contadorEntrenadores]=entrenador;
            contadorEntrenadores ++;
        }
    }
    
    public void asignarEntrenador(int codigoEntrenador, String dniCliente){
        //asignar e inicializar variables
        Cliente clienteEncontrado = null;
        Entrenador entrenadorEncontrado = null;
        //for buscar cliente
        for(int i = 0; i < contadorEntrenadores; i++){
            if(clientes[i].getDni().equalsIgnoreCase(dniCliente)){
                clienteEncontrado = clientes[i];
                break;
            }
        }
        //for buscar entrenador
        for(int i = 0; i < contadorClientes;i++){
            if(entrenadores[i].getCodigoEntrenenador()==(codigoEntrenador)){
                entrenadorEncontrado = entrenadores[i];
                break;
            }
        }
        if(clienteEncontrado == null){
            System.out.println("Cliente no encontrado");
            return;
        }
        if(entrenadorEncontrado == null){
            System.out.println("Entrenador no encontrado");
        }
        
        //asignacion
        
        clienteEncontrado.setEntrenador(entrenadorEncontrado);
        entrenadorEncontrado.agregarCliente(clienteEncontrado);
        
        
        
        
    }
    //funcion mostrar clientes
    public void mostrarClientes(){
        for(int i=0; i < contadorClientes;i++){
            Cliente c = clientes[i];
            System.out.println("---CLIENTES---");
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("dni: "+ c.getDni());
            System.out.println("edad: " + c.getEdad());
            System.out.println("telefono: " + c.getTelefono());
            System.out.println("Mail: " + c.getEmail());
            if(c.getMembresia()==1){
                System.out.println("Membresia básica");
            }else{
                System.out.println("Membresía premium");
            }
            if(c.getEntrenador()!=null){
                System.out.println("Entrenador asignado: " + c.getEntrenador().getNombre());
            }else{
                System.out.println("Entrenador no asignado");
            }
        }
    }
    
    //mostrar entrenadores
    public void mostrarEntrenadores(){
        for(int i=0;i<contadorEntrenadores;i++){
            Entrenador e= entrenadores[i];
            System.out.println("---ENTRENADORES---");
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Codigo: "+ e.getCodigoEntrenenador());
            System.out.println("Edad: "+ e.getEdad());
            System.out.println("Telefono: "+ e.getTelefono());
            System.out.println("Mail: "+ e.getEmail());
            System.out.println("Especialidad: " + e.getEspecialidad());
            System.out.println("Experiencia: "+e.getExperiencia()+" años");
            
            if(getContadorClientes()==0){
                System.out.println("No hay clientes asignados.");
            }else{
                System.out.println("Clientes asignados");
                for(int j=0; j<contadorClientes;j++){
                    Cliente c = e.getClientes()[j];
                    System.out.println("- " + c.getNombre()+ " (DNI: " + c.getDni() +")");
                }
            }
            System.out.println();
        }
    }
    
    //getters y setters

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
    
    



