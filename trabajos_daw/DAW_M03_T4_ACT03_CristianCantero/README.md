# DAW_M03_T04_ACT03_CristianCantero

## Descripción
Esta actividad corresponde al Tema 4 (Funciones).
El objetivo principal es aplicar el uso de funciones estáticas en Java, el paso de parámetros,
el retorno de valores y la modularización del código.

## Ejercicios implementados
- Ejercicio 1: Operaciones matemáticas básicas mediante funciones.
- Ejercicio 2: Cálculo y visualización de números primos en un rango determinado.

### Ejercicio 1

Crea un proyecto con métodos estáticos para realizar operaciones matemáticas básicas. Los métodos deben tener los siguientes nombres y funcionalidades:

- sumar: recibe dos números enteros y devuelve la suma de ambos.
- restar: recibe dos números enteros y devuelve la resta de ambos.
- multiplicar: recibe dos números enteros y devuelve el producto de ambos.
- dividir: recibe dos números enteros y devuelve el resultado de la división del primer número entre el segundo.
- potencia: recibe dos números enteros y devuelve el primer número elevado a la potencia del segundo.
Crea un menú para que el usuario pueda elegir que operación quiere realizar. Una de las opciones permitirá salir y cerrar el programa.

## Para este ejercicio.
El main tiene la responsabilidad de pedir los datos al usuario y llamar a las funciones. Esto lo haremos mediante un switch/case. Las opciones son 1.sumar, 2.restar, 3.multiplicar, 4.dividir, 5 potencias. Cada vez q el usuario marca una opción el main llama a la función correspondiente. Estas funciones estaticas estarán dentro de la misma clase donde también estará el bloque main. 

Flujo:
El programa arranca. Se instancia un objeto Scanner. Salta el primer rótulo de bienvenida (solo salta al iniciar el programa). Se despliega el menú. El usuario escoge una opción. El usuario sigue las instrucciones y hace sus operaciones hasta que termina la función. Se vuelve al menu principal (sin rotulo de bienvenida). El programa termina cuando el usuario marca la opción 0 en el menu. 

Observación del código:
Dentro del switch,cada case ha encapsulado sus intrucciones entre llaves {}. Asi separamos cada ámbito. De esta manera evitamos los conflictos por declaración de variables dentro del switch. 

- Caso de uso:
El usuario introduce 1 en el menú para sumar. El main inicializa una variable que alberga un array y le pasa el método public static int[] pedirDosNumoeros(Scanner sc). Este método es el que se encarga de recoger los datos que introduce el usuario. Despues declaramos dos variables integer (int a, int b) que guardan las posiciónes correspondientes del array donde se encuentran los datos introducidos por el usuario (int a = numeros[0]).
Finalmente, la variable resultado llama al método sumar pasandole por parametro los datos guardados en los integer.
int resulatdo = sumar(a,b);

Las opciones restar y multiplicar usaran la misma lógica para llamar a pedirDosNumeros(sc). Pero la opcion 4 dividir tiene un cambio en el tipo de dato. Usaremos datos double. Asi creamos la funcion pedirDosNumerosDouble(Scanner sc) que cumple las mismas directrices de pedirDosNumeros(Scanner sc) pero cambiando el tipo de dato a double. 

- Caso de uso:
El usuario introduce 5 para la potencia. Se vuelve a llamar al método pedirDosNumeros() inicializando una variable en forma de array que usará el método. int[]numeros = pedirDosNumeros(sc);
El programa pide al usuario la base, y seguidamente la potencia.  Seguidamente se almacenan las posiciones de los números en dos variables. Se inicializa otra variable de nombre resultado y se le pasa la función potencia(a,b) 
El programa pinta el resultado.

Función para calcular la pontencia:

public static int potencia(int base, int exponente){
	int resultado = 1;
	for(int i = 0; i < exponente; i ++){
		int resultado = base * resultado;
	}
	return resultado;

} /*nota: en el ejercicio cambié el tipo de dato a long. Para hacerlo bien debería haber utilizado BigInteger pero eso es harina de otro costal y no me he querido meter. He visto que pertenece al apartado de objetos y todavía me falta para eso. Ya se que el enunciado pide numeros enteros. Pero haciendole testing a la función vi que en nada teniamos overflow por culpa del tipo de dato, entonces me puse a trastear. */

Observaciones: La primera vez que modelé esta función inicialicé la variable resultado en 0. Entonces si exponente == 0 no hay ninguna iteración y por lo tanto cuando llega el return devuelve resultado tal y como lo inicialicé. La compilación no da error pero el fallo matemático era evidente. Solución: inicializar en 1. Si no hay iteración cuando llegamos al return el resultado que devuelve es el mismo que el de inicio. Que a la postre nos sirve matemáticamente porque cualquier número eleveado a 0 es 1. 
 
#### pendiente de revisión todo



### Ejercicio 2

Crea un proyecto que solicite al usuario que ingrese dos números enteros positivos: inicio y fin. El programa debe encontrar todos los números primos dentro de ese rango y mostrarlos al usuario.

Para resolver esta actividad, puedes implementar las siguientes funciones:

esPrimo(n): Esta función recibe un número entero positivo n como parámetro y devuelve true si es un número primo, y false en caso contrario. Para determinar si un número es primo, debes comprobar si es divisible únicamente por 1 y por sí mismo.

calcularRaizCuadrada(n): Esta función recibe un número entero positivo n como parámetro y devuelve su raíz cuadrada.

imprimirPrimosEnRango(inicio, fin): Esta función recibe dos números enteros positivos (inicio y fin) como parámetros y muestra por pantalla todos los números primos que se encuentran en ese rango. Puedes utilizar un bucle for para iterar desde inicio hasta fin, y dentro del bucle, llamar a la función esPrimo() para verificar si cada número es primo.

El programa principal debe solicitar al usuario que ingrese los valores de inicio y fin, y luego llamar a la función imprimirPrimosEnRango() para mostrar los números primos en ese rango.

En este ejercicio se ha desarrollado un programa que solicita al usuario dos números enteros positivos (inicio y fin) y muestra por pantalla todos los números primos que se encuentran dentro de ese rango.

Enfoque y diseño
Antes de implementar el código, se ha diseñado la solución separando claramente las responsabilidades de cada parte del programa:
	•	El método main se encarga de la interacción con el usuario y de coordinar la ejecución del programa.
	•	La función pedirNumeros(Scanner sc) solicita los valores de inicio y fin al usuario y los devuelve en un array de enteros.
	•	La función recorrerNumeros(int inicio, int fin) recorre el rango de números comprendido entre inicio y fin y decide qué valores deben mostrarse.
	•	La función esPrimo(int n) se encarga exclusivamente de determinar si un número es primo, devolviendo un valor booleano (true o false).

De esta forma, cada función tiene una única responsabilidad, evitando mezclar entrada de datos, lógica de cálculo y salida por pantalla.

Lógica para determinar números primos
Para comprobar si un número es primo, se ha implementado la función esPrimo(int n) siguiendo estos pasos:
	•	Se descartan directamente los números menores o iguales a 1, ya que no pueden ser primos.
	•	Se calcula la raíz cuadrada del número como límite de comprobación.
	•	Se comprueba si el número es divisible por algún valor comprendido entre 2 y la raíz cuadrada (inclusive).
	•	Si se encuentra algún divisor exacto, el número no es primo.
	•	Si no se encuentra ningún divisor, el número se considera primo.

Este enfoque evita comprobaciones innecesarias y se ajusta a lo indicado en el enunciado del ejercicio.

Uso de funciones booleanas y condicionales
Un aspecto clave del ejercicio ha sido el uso de funciones que devuelven valores booleanos.
La función esPrimo(n) se utiliza directamente dentro de una estructura if, de modo que:
	•	Si la función devuelve true, el número se muestra por pantalla.
	•	Si devuelve false, el número se ignora y el programa continúa con el siguiente valor del rango.

Este patrón permite que la decisión lógica esté encapsulada dentro de la función, manteniendo el código del recorrido limpio y legible.

Dificultades y resolución
Durante el desarrollo del ejercicio se detectó un error sutil relacionado con el límite del bucle utilizado para comprobar los divisores de un número primo. En concreto, fue necesario incluir correctamente la raíz cuadrada como límite superior del bucle (<=) para garantizar que todos los divisores relevantes fueran evaluados.

La detección y corrección de este error permitió comprender mejor la relación entre la lógica matemática y su implementación en código, reforzando el entendimiento del algoritmo utilizado.



## Autor
Cristian Cantero


