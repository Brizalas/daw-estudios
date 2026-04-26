package Ejercicio_tema_3;

/*
Actividad 1
Se ha producido un robo, sabemos que puede haber sido o bien “Maria” o bien
“Phil”. Sabemos también que ha de haber sido uno de los siguientes habitantes de
la ciudad: "Cam", "Pepe", "Kim", "Phil", "Perry". Ayuda a descubrir quien ha sido
creando un programa que contenga un array con todos los habitantes y busque
mediante un bucle si Maria o Phil viven en la ciudad.
 */

public class Main {

    public static void main(String[] args) {
        String[]habitantesCiudad={"cam","pepe","kim","phil","perry"};
        boolean resultado;
        System.out.println("Maria es el ladron?");
        resultado=buscaSospechoso("maria", habitantesCiudad);
        System.out.println(resultado);
        
        System.out.println("ES phil el ladron?");
        resultado=buscaSospechoso("phil",habitantesCiudad);
        System.out.println(resultado);
        
    }
    

    

    //funcion para buscar al sospechoso
    public static boolean buscaSospechoso(String sospechoso, String[] sospechosos) {
        int longitudArray = sospechosos.length;

        //array para recorrer a los sospechosos
        for (int i = 0; i < longitudArray; i++) {
            if (sospechosos[i].compareTo(sospechoso)==0) {
                return true;
            }
        }
        return false;
    }
}
