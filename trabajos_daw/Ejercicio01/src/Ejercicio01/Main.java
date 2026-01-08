package Ejercicio01;

import java.util.Scanner;

/*

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

    public static void main(String[] arg) {

        //--------declaracion de variables--------------------------------------------------
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double[] calificacion = new double[10];

        
        //--------- bucle introducir las calificaciones--------------------------------------
        for (int i = 0; i < calificacion.length; i++) {
            do {

                try {
                    System.out.println("Introduce las calificacion " + (i + 1));
                    nota = Double.parseDouble(sc.nextLine());

                    if (nota < 0 || nota > 10) {
                        System.out.println("Introduce una nota entre el 0 y el 10");
                    }
                } catch (Exception e) {
                    System.out.println("Error");
                }

            } while (nota < 0 || nota > 10);

            calificacion[i] = nota;
        }
        //---------- bucle mostrar calificaciones-------------------------------------------

        for (int i = 0; i < calificacion.length; i++) {
            double n = calificacion[i];
            if (n < 3) {
                System.out.println("Tu calificacion " + (i + 1) + " es " + n + " es suspendido");
            } else if (n < 5) {
                System.out.println("Tu calificacion " + (i + 1) + " es " + n + " es insuficiente");
            } else if (n < 8) {
                System.out.println("Tu calificacion " + (i + 1) + " es " + n + " es aprobado");
            } else if (n < 10) {
                System.out.println("Tu calificacion " + (i + 1) + " es " + n + " es excelente");
            } else if (n == 10) {
                System.out.println("Tu calificacion " + (i+1) + " es " + n + " es sobresaliente");
            }
        }

    }
}
