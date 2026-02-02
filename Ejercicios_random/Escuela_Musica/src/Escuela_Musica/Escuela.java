package Escuela_Musica;

public class Escuela {

    public Alumno alumnos[] = new Alumno[15];
    public Profesor profesores[] = new Profesor[3];
    public int contadorAlumnos = 0;
    public int contadorProfesores = 0;

    public void agregarAlumno(Alumno alu) {
        if (contadorAlumnos >= alumnos.length) { //error corregido
            System.out.println("Aforo completo");
        } else {
            alumnos[contadorAlumnos] = alu;
            contadorAlumnos++;
        }
    }

    public void agregarProfesor(Profesor profe) {
        if (contadorProfesores >= profesores.length) {//no trebajes los arrays con números reales nunca, siempre con .lenght
            System.out.println("Aforo de profes completo");
        } else {
            profesores[contadorProfesores] = profe;
            contadorProfesores++;
        }
    }

    public void asignarProfesor(String dniAlumno, int codigoProfesor) {
        Alumno alumnoEncontrado = null;
        Profesor profesorEncontrado = null;
        //for para buscar al alumno
        for (int i = 0; i < contadorAlumnos; i++) {
            if (alumnos[i].getDni().equalsIgnoreCase(dniAlumno)) {
                alumnoEncontrado = alumnos[i];
                break;
            }
        }
        //for buscar profesores
        for (int i = 0; i < contadorProfesores; i++) {
            if (profesores[i].getCodigoProfesor() == (codigoProfesor)) {
                 profesorEncontrado= profesores[i];
                break;
            }
        }
        //comprobación de seguridad
        if (alumnoEncontrado == null) {
            System.out.println("No existe este alumno");
            return;
        }
        if (profesorEncontrado == null) {
            System.out.println("No existe este profesor");
            return;
        }
        
        if(alumnoEncontrado == null || profesorEncontrado == null){
        return;
    }

        //asignacion
        alumnoEncontrado.setProfesor(profesorEncontrado);
        profesorEncontrado.agregarAlumno(alumnoEncontrado);
    }

    public void mostrarAlumnos() {
        for (int i = 0; i < contadorAlumnos; i++) {
            Alumno a = alumnos[i];

            System.out.println("------------------------");
            System.out.println("Nombre: " + a.getNombre());
            System.out.println("Apellido: " + a.getApellido());
            System.out.println("DNI: " + a.getDni());
            System.out.println("E-mail: " + a.getEmail());
            if (a.getSuscripcion() == 1) {
                System.out.println("Alumno suscrito");
            } else {
                System.out.println("Este alumno no está suscrito");
            }
            if (contadorProfesores == 0) {
                System.out.println("No tiene profesor asignado");
            } else {
                System.out.println("Profesor asignado: ");
                for (int j = 0; j < contadorProfesores; j++) {
                    Profesor p = profesores[j];
                    System.out.println("------------------------");
                    System.out.println("Nombre: " + p.getNombre());
                    System.out.println("Código profesor: " + p.getCodigoProfesor());
                    System.out.println("------------------------");
                }
                System.out.println("------------------------");
            
        }
    }
    }

    public void mostrarProfesores() {
        for (int i = 0; i < contadorProfesores; i++) {
            Profesor p = profesores[i];

            System.out.println("-----------------------------");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Codigo de profesor: " + p.getCodigoProfesor());
            System.out.println("Instrumento: " + p.getInstrumento());
            System.out.println("------------------------------");

            if (p.getContadorAlumnos() == 0) {
                System.out.println("No tiene alumnos asignados");
            } else {
                System.out.println("Alumnos asignados: ");
                for (int j = 0; j < contadorAlumnos; j++) {
                    Alumno a = alumnos[j];
                    System.out.println("---------------------------------");
                    System.out.println("Nombre: " + a.getNombre());
                    System.out.println("DNI: " + a.getDni());
                    System.out.println("E-mail: " + a.getEmail());
                    System.out.println("---------------------------------");
                }
            }

        }
    }
}
