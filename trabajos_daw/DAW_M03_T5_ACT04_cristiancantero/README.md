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
el try/catch se envuelve dentro del for debido a que si el catch se ve obligado a volver por una introducción inconrrecta de datos, no empezemos a introducir los datos desde 0. Si no q lo hagamos desde el mismo sitio donde lo dejamos.
se pide por pantalla el dato
se guarda
se valida
Vuelve a pedirlo hasta que se acaben las posiciones de array.length
el catch contiene un mensaje que dice q se introduzca un número, si este salta valido sera false y no saldremos del bucle
si se cumplen las condiciones de antes del catch se devuelve el array entero

## calcularPromedio
Siguiendo el enunciado en su fase 3 la clase main se encargará de pedir a usuario 10 números y almacenarlos. Voy a crear un método que haga esa función y ese método será llamado por el main. 
Desde el main llamamos a calcularPromedio. Esta función tiene que llamar primero a la función pedirNumeros().
El resultado guardado en pedirNumeros() se utilizará para realizar las operaciones dentro de calcularPromedio().

flujo:
- calcularPromedio(double[]array) recibe por parametros un array que vendrá d la función pedirNumeros()
inicia una variable para usarla de contador dentro del bucle for/each. 
for(double notas : array){
    suma += notas;
}
Después se calcula el promedio que es el resultado de dividir la suma de los números por la cantidad de posiciones del array
double promedio = suma/array.length;
finalmente devolvemos ese resultado
return promedio;


