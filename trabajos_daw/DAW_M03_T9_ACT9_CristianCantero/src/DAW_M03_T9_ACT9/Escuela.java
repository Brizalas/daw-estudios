package DAW_M03_T9_ACT9;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Escuela {
   
    Asignatura [] asignatura = new Asignatura [10];
    Programacion [] programacion = new Programacion[10];
    BaseDatos [] baseDatos = new BaseDatos[10];//este todos los objetos del tipo bases de datos
    private int contadorAsignaturas;
    private int contadorProgramacion;
    private int contadorBaseDatos;
    
    public void crearProgramacion(Scanner sc){
        
        Programacion p = new Programacion();
        System.out.println("Introduce el lenguaje de programación");
        String lenguaje = sc.nextLine();
        p.setLenguaje(lenguaje);
        System.out.println("Introduce el nivel. Básico/Intermedio/Avanzado");
        String nivel = sc.nextLine();
        p.setNivel(nivel);
        System.out.println("Introduce el número de créditos: ");
        int creditos = sc.nextInt();sc.nextLine();
        p.setCreditos(creditos);
        guardarProgramacion(p);
        System.out.println("programación guardado correctamente");
        
        
    }
    public void guardarProgramacion(Programacion nuevo){
        if(contadorProgramacion < asignatura.length){
            programacion[contadorProgramacion]= nuevo;
            contadorProgramacion ++;
            contadorAsignaturas ++;
        }
    }
    public void crearBaseDatos(Scanner sc){
        BaseDatos bd = new BaseDatos();
        System.out.println("Introduce el sistema");
        String sistema = sc.nextLine();
        bd.setSistema(sistema);
        System.out.println("Introduce el nivel");
        String nivel = sc.nextLine();
        bd.setNivel(nivel);
        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();
        bd.setNombre(nombre);
        System.out.println("Introduce los creditos");
        int creditos = sc.nextInt();
        sc.nextLine();
        bd.setCreditos(creditos);
        
        guardarBaseDatos(bd);
        System.out.println("Bases de datos guardado correctamente");
        
    }
    public void guardarBaseDatos(Asignatura nuevo){
        if(contadorBaseDatos < baseDatos.length){
            asignatura[contadorBaseDatos]= nuevo;
            contadorBaseDatos ++;
            contadorAsignaturas ++;
        }
    }
    
   
    
    public void mostrar(){
        int contador = 0;
        System.out.println("--Programación--");
        for (int i = 0; i < contadorProgramacion; i++){
            
            Programacion p = programacion [i];
            
            if(programacion[i]==null){
                break;
            }else{
            System.out.println("---------------------------");
            System.out.println("Lenguaje: " + p.getLenguaje());
            System.out.println("Nivel: " + p.getNivel());
            System.out.println("Creditos: " + p.getCreditos());
            
            System.out.println("---------------------------");
            contador ++;
            }
        }
        System.out.println("Total paquetes de asignaturas: " + contador);
       
        }
    }
    
    
    
    
    

