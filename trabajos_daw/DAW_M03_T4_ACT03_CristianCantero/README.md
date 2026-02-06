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
El main tiene la responsabilidad de pedir los datos al usuario y llamar a las funciones. Esto lo haremos mediante un switch/case. Las opciones son 1.sumar, 2.restar, 3.multiplicar, 4.dividir. Cada vez q el usuario marca una opción el main llama a la función correspondiente.
Flujo:
El programa arranca. Se instancia un objeto Scanner. Salta el primer rótulo de bienvenida (no saltará más). Se despliega el menú. El usuario escoge una opción. Segun la opcion el case se encarga de encapsular todas las instrucciones. Se vuelve al menu principal (sin rotulo de bienvenida). El programa termina cuando el usuario marca la opción 0 en el menu. 

Observación:
cada case ha encapsulado sus intrucciones dentro de {}. Asi separamos cada ámbito. De esta manera evitamos los conflictos por declaración de variables dentro del switch. 

Casos de uso:
El usuario introduce 1 para sumar. El main inicializa una variable que alberga un array y le pasa el método public static int[] pedirDosNumoeros(Scanner sc). Guarda el valor de las posiciones del array e inicializa una variable llamada resultado cuyo valor será la función sumar(a,b); que agarra los valores y los suma. 

Las opciones restar y multiplicar usaran el array de int[] numeros para llamar a pedirDosNumeros(sc). Pero la opcion dividir tiene un cambio en el tipo de dato. Usaremos datos double. Asi creamos la funcion pedirDosNumerosDouble(Scanner sc) que cumple las mismas directrices de pedirDosNumeros(Scanner sc) pero cambiando el tipo de dato a double. 



## Autor
Cristian Cantero


