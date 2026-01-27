package Gimnasio;

/**
 *
 * @author cristiancantero
 */
public class Gimnasio {
   
    private Cliente[] clientes;
    private Entrenador[] entrenadores;
    private int contadorClientes;
    private int contadorEntrenadores;

    public Gimnasio() {
        /*Los arrays y contadores forman parte del estado interno
        del objeto y se inicializan en el constructor*/
        this.clientes = new Cliente[100];
        this.entrenadores = new Entrenador[10];
        this.contadorClientes = 0;
        this.contadorEntrenadores = 0;
    }
    
    

  
    
    public void agregarCliente(Cliente cliente){
        if(contadorClientes >= 100){
            System.out.println("Aforo completo");
        }else{
            clientes[contadorClientes]=cliente;
            contadorClientes ++;
        }
        
        
    }
    
    public void agregarEntrenador(Entrenador entrenador){
        if(contadorEntrenadores >=10){
            System.out.println("Aforo completo, "
                    + "no se pueden anotar más entrenadores");
        }else{
            entrenadores[contadorEntrenadores]= entrenador;
            contadorEntrenadores ++;
        }
    }
    
    public void asignarEntrenador(String dniCliente, int codigoEntrenador){
        Cliente clienteEncontrado = null;
        Entrenador entrenadorEncontrado = null;
        
        //buscar cliente
        for(int i = 0; i < contadorClientes; i++){
            if(clientes[i].getDni().equalsIgnoreCase(dniCliente)){
                clienteEncontrado=clientes[i];
                break;
            }
        }
        
        //buscar entrenador
        for(int i =0; i < contadorEntrenadores; i++){
            if(entrenadores[i].getCodigoEntrenador()==(codigoEntrenador)){
                entrenadorEncontrado = entrenadores[i];
                break;
            }
        }
        //seguridad, comprobación
        if(clienteEncontrado ==null || entrenadorEncontrado ==null){
            System.out.println("No se encuentran las personas.");
            return;
        }
        //asignacion
        clienteEncontrado.setEntrenador(entrenadorEncontrado);
        entrenadorEncontrado.agregarCliente(clienteEncontrado);
    }
    
    public void mostrarClientes(){
        for(int i = 0; i < contadorClientes; i++){
            Cliente c = clientes[i];
           
            System.out.println("Nombre: " + c.getNombre());
            System.out.println(" DNI:    " + c.getDni());
            System.out.println("Edad: " + c.getEdad());
            System.out.println("Teléfono: " + c.getTelefono());
            System.out.println("e-mail: " + c.getEmail());
            if(c.getTipoMembresia()==1){
                System.out.println("Membresía premium");
            }else if(c.getTipoMembresia()==2){
                System.out.println("Membresía básica");
            }else{
                System.out.println("Este cliente no tiene membresía");
            }
            if(c.getEntrenador() == null){
                System.out.println("Este cliente no tiene entrenador asignado");
            }else{
                System.out.println("El cliente " + c.getNombre() + " tiene asignado "
                + " al entrenador " + c.getEntrenador().getNombre() );
            }
        }
    }
    
    public void mostrarEntrenadores(){ 
        
        for(int i = 0; i < contadorEntrenadores; i++){
           
            Entrenador e = entrenadores[i];
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Código de entrenador: " + e.getCodigoEntrenador());
            System.out.println("Edad: " + e.getEdad());
            System.out.println("Teléfono: " + e.getTelefono());
            System.out.println("e-mail: " + e.getEmail());
            System.out.println("Especialidad: " + e.getEspecialidad());
            System.out.println("Experiencia: " + e.getExperiencia() + " años.");
            if(e.getContadorCliente() == 0){
                System.out.println(e.getNombre() + " no tiene clientes asignados");
            }else{
                Cliente[] clienteDelEntrenador = e.getClienteAsignado();
                for(int j = 0; j <e.getContadorCliente(); j++){
                    System.out.println("- " + clienteDelEntrenador[j].getNombre());
                }
            }
            System.out.println("------------------------------------------------------------------");
        }
    }

}
