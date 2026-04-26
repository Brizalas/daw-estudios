package ejerciciotema7;

/*
EJERCICIO 1: Define una clase llamada "Cliente" que contenga atributos 
como nombre, 
DNI, edad, teléfono, email, membresía (por ejemplo, número entero: 1. Básica;
2.Premium) y un objeto Entrenador.
 

Como definir la clase?? 
String nombre, int DNI, int Edad, int teléfono, string email, string membresía 
(menú membresía) + objeto entrenador.
*/

public class Cliente {
    public String nombre;
    public String dni;
    public int edad;
    public int telefono;
    public String email;
    public int membresia;  
    private Entrenador entrenador;


    public Cliente(){
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getMembresia() {
        return membresia;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

   
    
    
    
    
    
    
    
    
    
    
    
}
