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

}
