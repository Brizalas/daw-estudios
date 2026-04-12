package PracticaHashMap;

/**
 *
 * @author cristiancantero
 */
public class Alumno {
    String nombre;
    String apellido;
    int edad;
    
    public Alumno(){
        
    }

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    @Override
    public int hashCode(){
        return nombre.hashCode() + apellido.hashCode() + edad;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() !=obj.getClass())
            return false;
        
        Alumno other = (Alumno) obj;
        
        if (!nombre.equals(other.nombre))
            return false;
        if (!apellido.equals(other.apellido))
            return false;
        if (edad != (other.edad)){
            return false;
        }
        
        return true;
    }
    
     @Override
        public String toString() {
            return nombre + " " +apellido + " (" + edad + ")";
    }
}
