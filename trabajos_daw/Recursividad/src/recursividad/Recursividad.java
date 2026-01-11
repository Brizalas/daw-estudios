package recursividad;

/*
Actividad 1
Escribe un programa de nombre Recursividad que imprima valores del 0 al 20 utilizando
una función recursiva

 */
public class Recursividad {

    public static void main(String[] args) {
        miFuncionRecursiva(0);
            
        }
    public static void miFuncionRecursiva(int numero){
        numero ++;
        System.out.println(numero);
        if(numero < 20){
            miFuncionRecursiva(numero);
        }

}
}
    
    

