
package Escuela_Musica;


public class Profesor {
    private String nombre;
    private String apellido;
    private int codigoProfesor;
    private String instrumento;
    private int experiencia;
    private int contadorAlumnos;
    private Alumno [] alumnos; //relación, un profesro puede tener muchos alumnos
    
    //constructor sin parámetros solo con datos del estado interno (constructor vacío)
    public Profesor(){
        alumnos =new Alumno[15];
        contadorAlumnos=0;
    }
    
    public void agregarAlumno(Alumno nuevoAlumno){
        if(contadorAlumnos < alumnos.length){
            alumnos[contadorAlumnos]= nuevoAlumno;
            contadorAlumnos ++;
        }
    }

    public Profesor(String nombre, String apellido, int codigoProfesor, String instrumento, int experiencia, int contadorAlumnos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoProfesor = codigoProfesor;
        this.instrumento = instrumento;
        this.experiencia = experiencia;
        this.contadorAlumnos = 0;
        
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

    public int getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(int codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getContadorAlumnos() {
        return contadorAlumnos;
    }

    public void setContadorAlumnos(int contadorAlumnos) {
        this.contadorAlumnos = contadorAlumnos;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
