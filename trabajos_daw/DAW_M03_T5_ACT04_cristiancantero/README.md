#### ACT04 de tema 5

EJERCICIO 1: Crea un paquete llamado estadisticas que contendrá las clases relacionadas con el cálculo de estadísticas. Dentro del paquete estadisticas, crea las siguientes clases:
CalculadoraEstadisticas: la clase principal que contiene el método main().
EstadisticasUtils: una clase de utilidades que contendrá las funciones para calcular diferentes estadísticas.

- Boton derecho encima del proyecto y paquetes creados.

EJERCICIO 2: En la clase EstadisticasUtils, implementa las siguientes funciones estáticas. Se tiene que hacer uso de la librería Math: 
calcularPromedio: recibe un array de números y devuelve el promedio de los valores.
calcularMediana: recibe un array de números y devuelve la mediana de los valores.
calcularDesviacionEstandar: recibe un array de números y devuelve la desviación estándar de los valores.

## Pedir números
Esta función será la que se encargará de pedir los números al usuario. Será llamada por todas las funciones dentro del main porque es pieza clave para que el usuario introduzca los datos.
flujo:
- Se declara la firma conforme a una función que pide un array y por parametros se le pasa el objeto Scanner
se declara un array de 10 posiciones
se declara un booleano que hace de bandera
empieza el bucle while con la condicion !valido
el try/catch se envuelve dentro del for debido a que si el catch se ve obligado a volver por una introducción inconrrecta de datos,lo hagamos desde el mismo sitio donde lo dejamos.
se pide por pantalla el dato
se guarda
se valida
Vuelve a pedirlo hasta que se acaben las posiciones de array.length
el catch contiene un mensaje que dice q se introduzca un número, si este salta valido sera false y no saldremos del bucle
si se cumplen las condiciones de antes del catch se devuelve el array entero listo para ser usado por las demás funciones.

## calcularPromedio
Es la función que se encarga de realizar la operación matemática de calcular promedio.
La función matemática para calcular el promedio (o media aritmética) consiste en sumar un conjunto de valores y dividir esa suma entre el número total de datos (fuente: Google).
Se declara un double suma y se inicializa en 0.
Bucle for. Recorre el array y en cada iteración suma el dato anterior con el dato de la posición donde se encuentra el índice. 
Se declara una variable double promedio que contiene la formula del promedio. Esta consiste en recoger la suma de los números de array que se encuentra almacenada en la palabra suma y lo divide por la cantidad de posiciones del array. 
Devuelve el resultado a través de la variable promedio. 

## calcularDesviacion
Es la función que se encarga de realizar la operación matemática de calcular la desviacion estandar. 
La desviación estándar es una medida estadística que indica cuánto se alejan, en promedio, los valores de un conjunto de datos respecto a su media (fuente: chatgpt. Yo no entiendo este enunciado).

Cómo se calcula:
	1.	Se calcula la media.
	2.	Se resta la media a cada dato.
	3.	Se elevan al cuadrado esas diferencias.
	4.	Se hace la media de esos cuadrados.
	5.	Se saca la raíz cuadrada del resultado.

Ese valor final es la desviación estándar.

Se declara una variable double q se llama media y directamente guardamos el calculo del promedio usando la funcion calcularPromedio() ya creada anteriormente. 
Se declara una variable double que se llama suma y es un acumulador. Sirve para ir guardando la suma de todas las diferencias al cuadrado entre cada valor del array y la media. 
Se declara una variable double q se llama diferencia y se dedicará a guardar cuánto se aleja cada valor del array respecto a la media en cada iteración del bucle.
Bucle for recorre todo el array elmento por elemneto, en cad vuelta calcula cuánto se aleja ese número de la media. Eleva esa distancia al cuadrado y la añade a la variable suma.
Una vez hechas todas las iteraciones se declara la variable variacion y se le aplican todas las diferencias al cuadrado que se acumularon en la variable suma. Y se dividen entre el número total de elementos.
Se devuelve el resultado obtenido en la variable variacion y se devuelve el resultado de su raiz cuadrada. En este caso he usado la libreria Math para resolverla.

## CalcularMediana

Es la función que se encarga de realizar la operación matemática de calcular la mediana. Que es el valor que ocupa la posición central de un conjunto de datos cuando están ordenados de menor a mayor.
Se calcula ordenando los datos. Si el número de valores es impar, la mediana es el valor que está justo en el centro. Si el número de valores es par, la mediana es el promedio de los dos valores centrales.
He aplicado la lógica de la fúncion sabiendo que nuestro array es de 10 posiciones es par... pero estaría bien encontrar como decirle al programa que si la suma de las posiciones da un número  par escoja los dos valores centrales. Pero que si es impar el valor es justo el que se encuentra en el centro. 

Se ordena el array con el método .sort(); 
Se muestra el array ordenado
Se hace el cálculo en base de saber las posiciones del array. Pos 5 + pos 5 y el resultado dividido entre 2. 
Se devuelve la mediana. 

