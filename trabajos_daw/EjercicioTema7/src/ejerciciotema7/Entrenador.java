package ejerciciotema7;


/*
EJERCICIO 2: Crea una clase llamada "Entrenador" que represente a los entrenadores del gimnasio. 
Esta clase debe tener atributos como nombre, codigoEntrenador, edad, teléfono, email, especialidad, 
años de experiencia y un listado de Clientes asignados.
 */
public class Entrenador {
    public String nombre;
    public String codigoEntrenador;
    public int edad;
    public int telefono;
    public String email;
    public String especialidad;
    public int aniosExperiencia;
    
    private int contadorClientes;
    
    private Cliente[]clientes; //un entrenador puede tener muchos clientes

    public Entrenador() {
        clientes = new Cliente[10];
        contadorClientes = 0;
    }
    
    public void incrementarContadorClientes(){
        contadorClientes ++;
    }

    public Entrenador(String nombre, String codigoEntrenador, int edad, int telefono, String email, String especialidad, int aniosExperiencia, Cliente[] clientes) {
        this.nombre = nombre;
        this.codigoEntrenador = codigoEntrenador;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEntrenador() {
        return codigoEntrenador;
    }

    public void setCodigoEntrenador(String codigoEntrenador) {
        this.codigoEntrenador = codigoEntrenador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getContadorClientes() {
        return contadorClientes;
    }

    public void setContadorClientes(int contadorClientes) {
        this.contadorClientes = contadorClientes;
    }
    
    
    
    
}
