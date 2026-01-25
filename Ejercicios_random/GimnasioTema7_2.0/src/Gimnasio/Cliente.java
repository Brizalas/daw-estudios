package Gimnasio;

/**
 *
 * @author cristiancantero
 */
public class Cliente {
    private String nombre;
    private String dni;
    private int edad;
    private String telefono;
    private String email;
    private int tipoMembresia;
    private Entrenador entrenador;

    public Cliente() {
    }

    public Cliente(String nombre, String dni, int edad, String telefono, String email, int tipoMembresia) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.tipoMembresia = tipoMembresia;
        this.entrenador = null;
    }
    
//    public void mostrarDatosPrueba(){
//        System.out.println("Nombre: " + nombre);
//        System.out.println("Edad: " + edad);
//        if(tipoMembresia ==1){
//            System.out.println("Membresía premium");
//        }else if(tipoMembresia == 2){
//            System.out.println("Membresía básica");
//        }else{
//            System.out.println("Membresía no activa");
//        }
//    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(int tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", telefono=" + telefono + ", email=" + email + ", tipoMembresia=" + tipoMembresia + ", entrenador=" + entrenador + '}';
    }

      
    
}
