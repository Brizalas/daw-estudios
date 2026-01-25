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
            String especialidad, int experiencia, Cliente[] clienteAsignado, int contadorCliente){
        this.nombre=nombre;
        this.codigoEntrenador=codigoEntrenador;
        this.edad=edad;
        this.telefono=telefono;
        this.email=email;
        this.experiencia=experiencia;
        this.clienteAsignado=clienteAsignado;
        this.contadorCliente=contadorCliente;
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
    
}
