package Act07;


public class Entrenador {
    private String nombre;
    private int codigoEntrenador;
    private int edad;
    private int telefono;
    private String email;
    private String especialidad;
    private int experiencia; 
    private Cliente [] clientesAsignados; 
    private int numDeClientesAsignados;

    public Entrenador() { //
        this.clientesAsignados = new Cliente[10];
        this.numDeClientesAsignados = 0;
    }

    public Entrenador(String nombre, int codigoEntrenador, int edad, int telefono, String email, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.codigoEntrenador = codigoEntrenador;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.clientesAsignados = new Cliente[10];//variables internas del objeto. No hacen falta en los parametros
        this.numDeClientesAsignados = 0; //ojo con el trampantojo!!
        
    }
    
    public void agregarNuevoCliente(Cliente c){
        if(numDeClientesAsignados<clientesAsignados.length){
            clientesAsignados[numDeClientesAsignados]=c;
            numDeClientesAsignados ++;
        }else{
            System.out.println("Aforo completo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoEntrenador() {
        return codigoEntrenador;
    }

    public void setCodigoEntrenador(int codigoEntrenador) {
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Cliente[] getClientesAsignados() {
        return clientesAsignados;
    }

    public void setClientesAsignados(Cliente[] clientesAsignados) {
        this.clientesAsignados = clientesAsignados;
    }
    
    public int getNumDeClientesAsignados() {
        return numDeClientesAsignados;
    }
    public void setNumDeClientesAsignados(){
        this.numDeClientesAsignados=numDeClientesAsignados;
    }
    
    
}
