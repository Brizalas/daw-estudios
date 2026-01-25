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
        
    }
    
    public void agregarCliente(Cliente cliente){
        if(contadorClientes >= 100){
            System.out.println("Aforo completo");
        }else{
            clientes[contadorClientes]=cliente;
            contadorClientes ++;
        }
        
    }
    
    public void agragarEntrenador(Entrenador entrenador){
        if(contadorEntrenadores >=10){
            System.out.println("Aforo completo, "
                    + "no se pueden anotar más entrenadores");
        }else{
            entrenadores[contadorEntrenadores]= entrenador;
        }
    }
    
    public void asignarEntrenador(String dniCliente, int codigoEntrenador){
        Cliente clienteEncontrado = null;
        Entrenador entrenadorEncontrado = null;
        
        //buscar entrenador
        for(int i = 0; i < contadorEntrenadores; i++){
            if(clientes[i].getDni().equalsIgnoreCase(dniCliente)){
                clienteEncontrado=clientes[i];
                break;
            }
        }
        
        //buscar cliente
        for(int i =0; i < contadorClientes; i++){
            if(entrenadores[i].getCodigoEntrenador()==(codigoEntrenador)){
                entrenadorEncontrado = entrenadores[i];
                break;
            }
        }
    }

}
