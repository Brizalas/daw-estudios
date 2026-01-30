package Escuela_Musica;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private int suscripcion;
    private Profesor profesor;

    public Alumno(String nombre, String apellido, String dni, String email, int suscripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.suscripcion = suscripcion;
        this.profesor = null; //no va en el constructor porque la clase puede garantizar por si misma el estado inicial válido
        // El estado interno son los datos que necesita para cumplir con su responsabilidad sin depender del exterior
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(int suscripcion) {
        this.suscripcion = suscripcion;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    
    
    
}
