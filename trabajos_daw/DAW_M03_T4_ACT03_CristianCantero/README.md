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
El main tiene la responsabilidad de pedir los datos al usuario y llamar a las funciones. Esto lo haremos mediante un switch/case. Las opciones son 1.sumar, 2.restar, 3.multiplicar, 4.dividir, 5 potencias. Cada vez q el usuario marca una opción el main llama a la función correspondiente.
Flujo:
El programa arranca. Se instancia un objeto Scanner. Salta el primer rótulo de bienvenida (solo salta al iniciar el programa). Se despliega el menú. El usuario escoge una opción. Segun la opcion el case se encarga de encapsular todas las instrucciones. Se vuelve al menu principal (sin rotulo de bienvenida). El programa termina cuando el usuario marca la opción 0 en el menu. 

Observación:
cada case ha encapsulado sus intrucciones dentro de {}. Asi separamos cada ámbito. De esta manera evitamos los conflictos por declaración de variables dentro del switch. 

Casos de uso:
El usuario introduce 1 para sumar. El main inicializa una variable que alberga un array y le pasa el método public static int[] pedirDosNumoeros(Scanner sc). Guarda el valor de las posiciones del array e inicializa una variable llamada resultado cuyo valor será la función sumar(a,b); que agarra los valores y los suma. 

Las opciones restar y multiplicar usaran el array de int[] numeros para llamar a pedirDosNumeros(sc). Pero la opcion dividir tiene un cambio en el tipo de dato. Usaremos datos double. Asi creamos la funcion pedirDosNumerosDouble(Scanner sc) que cumple las mismas directrices de pedirDosNumeros(Scanner sc) pero cambiando el tipo de dato a double. 

Casos de uso:
El usuario introduce 5 para la potencia. Se vuelve a llamar al método pedirDosNumeros() inicializando una variable en forma de array que usará el método. int[]variable = pedirDosNumeros(sc);
El programa pide al usuario la base, y seguidamente la potencia.  Seguidamente se almacenan las posiciones de los números en dos variables. Se inicializa otra variable que será el resultado y se pasa la función potencia(a,b) 
El programa pinta el resultado.

Función public static int potencia(int base, int exponente){
	int resultado = 0;
	for(int i = 0; i < exponente; i ++){
		int resultado = base * resultado;
	}
	return resultado;

}
 


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


