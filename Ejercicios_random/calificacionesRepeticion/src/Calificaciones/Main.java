package Calificaciones;

import java.util.Scanner;

/*
    1. Ejercicio01.java. Gestión de las calificaciones de un alumno.
        1.1. Crea un array de tamaño 10 para almacenar calificaciones de tipo double.
        1.2. Mediante un bucle for, solicita al usuario que vaya introduciendo sus calificaciones.
        1.3. Las calificaciones tienen que ser valores entre 0 y 10. Si el usuario introduce un valor incorrecto se le tendrá que informar y solicitar un nuevo valor.
        1.4. Muestra todas las calificaciones en líneas diferentes, indicando su leyenda, tal y como se ve en la siguiente tabla. (Ej. Nota: 6.45 – Bien) 
            ▪ De 0 a 2.99: Deficiente
            ▪ De 3 a 4.99: Insuficiente
            ▪ De 5 a 7.99: Bien
            ▪ De 8 a 9.99: Notable
            ▪ 10: Excelente

 */
public class Main {

    public static void main(String[] args) {
        //declaracion de variables
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double[] calificacion = new double[10];
        boolean valido = false;
       

        //bucle para introducir las calificaciones
        for (int i = 0; i < calificacion.length; i++) {
            valido = false; //reset obligatorio porque hay q validar que 
                            //valido empieza siempre en false en cada iteración
            do {
                try {
                    System.out.println("Introduce la calificación " +(i+1));
                    nota = Double.parseDouble(sc.nextLine());
                   
                    if (nota >= 0 && nota <= 10) { //ESto es importante.
                        //se usa este condicional para cambiar la bandera
                        //Si esto pasa, valido pasa a true. Y eso pasa se sale del bucle.
                        valido = true;
                        
                    } else{
                        System.out.println("Introduce un número comprendido entre 0 y 10 ambos inclusive.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Introduce un número");
                    
                }
            } while (!valido);
            calificacion[i] = nota;
        }

        //mostrar las calificaciones
        for (int i = 0; i < calificacion.length; i++) {
            double n = calificacion[i];
            if (n < 3) {
                System.out.println("suspendido");
            } else if (n < 5) {
                System.out.println("Insuficiente");
            } else if (n < 7) {
                System.out.println("aprobado");
            } else if (n < 10) {
                System.out.println("excelente");
            } else if (n == 10) {
                System.out.println("Matricula");
            }
            System.out.println("");
            System.out.println("Programa terminado");
        }
    }

}
