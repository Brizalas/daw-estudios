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
    
    private Cliente[]clientes; //un entrenador puede tener muchos clientes
    
}
