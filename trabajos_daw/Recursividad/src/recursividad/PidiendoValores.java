package recursividad;

import java.util.Scanner;

/*

Actividad 2
Escribe un programa de nombre PidiendoValores que llame a una función encargada de
pedir un número entero superior a 0. Si el usuario escribe un número incorrecto, vuelve a
pedir. Cuando el usuario haya escrito un número correcto la función ha de retornar ése
número y desde la función main se ha de mostrar el número introducido
 */
public class PidiendoValores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int num = 0;

        do {
            try {
                
               
                num = pideValor(sc);

                if (num > 0) {
                    System.out.println();
                    valido = true;
                } else if (num < 0) {

                    System.out.println("El numero ha de ser positivo.");
                }
            } catch (Exception e) {
                System.out.println("Error introduce números no letras");
            }
        } while (!valido);
        
        System.out.println("Tu número es: " + num);
        System.out.println();
        System.out.println("Programa terminado correctamente.");
        
    }

    public static int pideValor(Scanner sc) {

        System.out.println("Introduce un número entero superior a 0");
        int numero = Integer.parseInt(sc.nextLine());
        return numero;

    }
}
