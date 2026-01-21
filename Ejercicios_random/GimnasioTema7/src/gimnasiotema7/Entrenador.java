
package gimnasiotema7;

/*
EJERCICIO 2: Crea una clase llamada "Entrenador" que represente a los entrenadores del 
gimnasio. Esta clase debe tener atributos como nombre, codigoEntrenador, edad, 
teléfono, email, especialidad,años de experiencia y un listado de Clientes asignados.
 */
public class Entrenador {
    private String nombre;
    private int codigoEntrenenador;
    private int edad;
    private int telefono;
    private String email;
    private String especialidad;
    private int experiencia;
    private int contadorClientes; //contador para controlar los clientes
    private Cliente[]clientes; //rleacion un entrenador puede tener muchos clientes
        //constructor vacío    
    public Entrenador(){
    clientes =  new Cliente[10];//constructor con el array definido
    contadorClientes = 0;//contador inicializado
}
    //métodos...
    public void incrementarContadorClientes(){//metodo para incrementar el contador
        contadorClientes ++;
    }
    
    public void agregarCliente(Cliente cliente){//metodo para agregar uncliente a un entrenador
        if(contadorClientes<clientes.length){//Si el contador de clientes es menor q la longitud del array
            clientes[contadorClientes]=cliente;//se crea un cliente
            contadorClientes ++;//se suma uno al contador
        }
    }
    //constructores...
    public Entrenador(String nombre, int codigoEntrenenador, int edad, int telefono, String email, String especialidad, int experiencia, int contadorClientes, Cliente[] clientes) {
        this.nombre = nombre;
        this.codigoEntrenenador = codigoEntrenenador;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.contadorClientes = contadorClientes;
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoEntrenenador() {
        return codigoEntrenenador;
    }

    public void setCodigoEntrenenador(int codigoEntrenenador) {
        this.codigoEntrenenador = codigoEntrenenador;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getContadorClientes() {
        return contadorClientes;
    }

    public void setContadorClientes(int contadorClientes) {
        this.contadorClientes = contadorClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
}
