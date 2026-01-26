package Gimnasio;

/**
 *
 * @author cristiancantero
 */
public class Entrenador {
    private String nombre;
    private int codigoEntrenador;
    private int edad;
    private String telefono;
    private String email;
    private String especialidad;
    private int experiencia;
    private Cliente[] clienteAsignado;
    private int contadorCliente;
    
    public Entrenador(String nombre, int codigoEntrenador, int edad, String telefono, String email,
            String especialidad, int experiencia){
        //datos reales del entrenador
        this.nombre=nombre;
        this.codigoEntrenador=codigoEntrenador;
        this.edad=edad;
        this.telefono=telefono;
        this.email=email;
        this.experiencia=experiencia;
        //Estado interno del entrenador
        this.clienteAsignado = new Cliente[10];
        this.contadorCliente = 0;
        /*
        El array de clientes y el contador forman parte del estado interno 
        del entrenador, por lo tanto se inicializan dentro del construcotr 
        y no se pasan como parametros
        */
       
    }
    
    public void agregarCliente(Cliente cliente){
        //si el contador de clientes es menor que la longitud del array, se crea un nuevo cliente
        if(contadorCliente < clienteAsignado.length){
            clienteAsignado[contadorCliente]= cliente;
            //clienteAsignado apuntando a contadorCliente es un nuevo cliente (declarado en parametros)
            contadorCliente ++; // se suma uno al contador
        }else{
            System.out.println("Cupo de clientes lleno para este entrenador. Por favor selecciona otro.");
        }// este println esta para depurar, en ningún caso debo hacer esto en un proyecto real
        // Es el main el responsable de avisar por pantalla nunca el método de una clase
       
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", codigo del entrenador=" + codigoEntrenador + ", edad=" + edad + ", telefono=" + telefono + ", e-mail=" + email + ", especialidad=" + especialidad + ", experiencia=" + experiencia + ", clientes asignados=" + contadorCliente + '}';
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getCodigoEntrenador(){
        return codigoEntrenador;
    }
    public void setCodigoEntrenador(int codigoEntrenador){
        this.codigoEntrenador=codigoEntrenador;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public void setExperiencia(int experiencia){
        this.experiencia=experiencia;
    }

    public Cliente[] getClienteAsignado() {
        return clienteAsignado;
    }
    
    public void setClienteAsignado(Cliente[]clienteAsignado){
        this.clienteAsignado=clienteAsignado;
    }
    
    public int getContadorCliente(){
        return contadorCliente;
    }
    
}
