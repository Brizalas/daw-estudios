package Act07;




public class Gimnasio {
    
    /*
    patrón:
        array + contador + método añadir
    */
    
    private Cliente [] clientes = new Cliente [100];
    private Entrenador [] entrenadores = new Entrenador[10];  //==> array
    private int numClientes;  //==> contador
    private int numEntrenadores;
    
    public Gimnasio() { //constructor vacío 
    }
    //==> Métodos
    public void crearCliente(){
        
    }
    public void agregarCliente(Cliente nuevoCli){
        if(numClientes < clientes.length){
            clientes[numClientes]=nuevoCli;
            numClientes ++;
        }else{
            System.out.println("Aforo completo");
        }
    }
    
    
    public void agregarEntrenador(Entrenador nuevoEnt){
        if(numEntrenadores < entrenadores.length){
            entrenadores[numEntrenadores]=nuevoEnt;
            numEntrenadores ++;
        }else{
            System.out.println("Aforo completo");
        }
    }
    
    public void asignarEntrenador(String dniCliente, int codigoEntrenador){
        Cliente clienteEncontrado = null;
        Entrenador entrenadorEncontrado = null;
        
        for(int i = 0; i < numClientes; i ++){
            if(clientes[i].getDni().equalsIgnoreCase(dniCliente)){
                clienteEncontrado=clientes[i];
                break;
            }
        }
        
        for(int i= 0; i <numEntrenadores;i++){
            if(entrenadores[i].getCodigoEntrenador()==(codigoEntrenador)){
                entrenadorEncontrado=entrenadores[i];
                break;
            }
        }
        
        if(clienteEncontrado==null){
            System.out.println("No se encontró cliente");
            return;
        }
        if(entrenadorEncontrado==null){
            System.out.println("No se encontró entrenador");
            return;
        }
        //Asignación
        clienteEncontrado.setEntrenador(entrenadorEncontrado);
        entrenadorEncontrado.agregarNuevoCliente(clienteEncontrado);
        //Patrón: Relación bidireccional
    }
    
    public void mostrarInfoClientes(Cliente c){
        System.out.println("--Listado de clientes--");
        for(int i =0; i < numClientes; i ++){
            c = clientes[i]; // acostumbrate a mirar 'parriba'
            
            System.out.println();
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("Dni:" + c.getDni());
            System.out.println("Edad:" + c.getEdad());
            System.out.println("Email:" + c.getEmail());
            System.out.println("Teléfono:" + c.getTelefono());
            System.out.println("Membresía: " + c.getMembresia());
            if(c.getMembresia()==1){
                System.out.println("Membresia Básica");
            }else{
                System.out.println("Membresia Premium");
            }
            
            if(c.getEntrenador()!=null){
                System.out.println("Entrenador: "+ c.getEntrenador().getNombre());
            }else{
                System.out.println("Este cliente no tiene entrenador asignado");
            }
        }
    }
    
    public void mostrarInfoEntrenadores(){
        System.out.println("--Listado Entrenadores--");
        for(int i = 0; i < numEntrenadores; i++){
            Entrenador e = entrenadores[i];
            Cliente[] lista = e.getClientesAsignados();
            
            System.out.println();
            System.out.println("Nombre: "+e.getNombre());
            System.out.println("Código de entrenador: "+e.getCodigoEntrenador());
            System.out.println("Edad: "+e.getEdad());
            System.out.println("Especialidad: "+e.getEspecialidad());
            System.out.println("Experiencia: "+e.getExperiencia()+" años.");
            System.out.println("Teléfono: "+e.getTelefono());
            
            if(e.getNumDeClientesAsignados()==0){
                System.out.println("Este entrenador no tiene clientes asignados");
            }else{
                System.out.println("--Clientes de " + e.getNombre()+ " --");
                for(int j=0; j<e.getNumDeClientesAsignados(); j++){
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
