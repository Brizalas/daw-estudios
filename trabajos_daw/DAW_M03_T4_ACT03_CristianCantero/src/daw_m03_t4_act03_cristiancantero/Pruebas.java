/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_m03_t4_act03_cristiancantero;

import java.util.Scanner;

/**
 *
 * @author cristiancantero
 */
public class Pruebas {
    /*introduce un número y q diga si es primo o no*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = Integer.parseInt(sc.nextLine());
        if(numero <= 1){
            System.out.println("Si es 1 o menor, este número no es primo.");
        }
        if(numero % 2 == 0){
            System.out.println("Es divisible entre 2. Este número no es primo");
        }
        if(numero == 3){
            System.out.println("3 es primo");
        }
        
        
    }
}
