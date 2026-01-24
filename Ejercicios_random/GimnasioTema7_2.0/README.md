
## Fase 1. Entender y reinterpretar el enunciado.

Este proyecto pretende desarrollar una aplicación que gestione los entrenadores y clientes de un gimnasio. Tiene que mantener clientes y entrenadores en memória. Permitiendo altas, bajas, asignaciones y consultas mediante un menú. 

## Fase 2. Identificar ENTIDADES(sustantivos)
Regla: 
- Sustantivo => posible clase
- Acción => Será método

## ENTIDADES(nombres en singular, una clase representa una cosa, no una colección)
-Gimnasio
-cliente
-entrenador
-Menu(conceptual)

## Fase 3 - Responsabilidades (el corazón de la POO)
Objetivo: evitar clases caóticas.

### Gimnasio
Responsable de:
- Almacenar clientes
- Almacenar entrenadores
- Realizar asignaciones de entrenadores a clientes
- Consultar información de clientes y entrenadores

No es responsable de:
- pedir datos por teclado
- mostrar menús

### Cliente
Responsable de:
- Almacenar su propia información (nombre, dni etc..)
- Conocer qué entrenador tiene asignado (si lo tiene)

No es responsable de: 
- pedir datos por teclado
- mostrar menús
- almacenar otros clientes
- buscar entrenadores


### entrenador
Responsable de:
- Almacenar su propia información
- Mantener un listado de clientes asignados
 
No es responsable de: 
- crear clientes
- pedir datos por teclado
- mostrar menus

### clase Main 
Responsable de:
- Mostrar los menus 
- Pedir datos al usuario
- Llamar a los métodos del gimnasio

No es responsable de:
- Almacenar datos
- Aplicar reglas de negocio

## Fase 4. Flujo general del programa

1. El programa arranca
2. Se crea una instancia del gimnasio
3. Se muestra el menú principal
4. El usuario selecciona una opción
5. Según la opción se ejecuta la acción correspondiente
6. Al finalizar la acción se vuelve al menú principal
7. El programa termina cuando el usuario selecciona la opción salir

### Registrar cliente

1. El usuario selecciona "Registrar cliente nuevo"
2. El sistema comprueba si hay espacio disponible
3. Se solicitan los datos del cliente
4. Se crea el cliente
5. Se añade al gimnasio
6. Se muestra un mensaje de confirmación

### Registrar entrenador

1. El usuario selecciona "Registrar profesional"
2. El sistema comprueba si hay espacio disponible
3. Se solicitan los datos del entrenador
4. Se crea el entrenador
5. Se añade al gimnasio


### Asignar entrenador

1. El usuario selecciona "Asignar entrenador a cliente"
2. El sistema comprueba que existan clientes y entrenadores
3. El usuario selecciona un cliente
4. El usuario selecciona un entrenador
5. Se realiza la asignación
6. Se muestra un mensaje de confirmación

### Mostrar clientes

1. El usuario selecciona "Mostrar todos los clientes"
2. Se muestran los datos de todos los clientes

### Mostrar entrenadores

1. El usuario selecciona "Mostrar todos los entrenadores"
2. Se muestran los datos de los entrenadores y sus clientes asignados

### Salir

1. El usuario selecciona "Salir"
2. El programa termina

## Fase 5 - CASO DE USO DETALLADO - Registrar Cliente
### Caso de uso: Registrar cliente

Precondiciones:
- El programa está en ejecución
- Existe una instancia del gimnasio

Flujo principal:

1. El usuario selecciona la opcion "Registrar cliente"
2. El sistema comprueba si hay espacio en el disco
3. El sistema solicita los datos del cliente
4. El usuario introduce los datos
5. El sistema crea el cliente con los datos introducidos
6. El sistema añada el cliente al gimnasio
7. El sistema muestra un mensaje de confirmacion
8. El sistema vuelve al menu principal

Flujo alternativo:
Gimnasio lleno:
- Si no hay espacio disponible:
    - El sistema muestra un mensaje de aforo completo
    - No se completa el registro
    - Se vuelve al menu principal
    
Postcondiciones
    - El cliente queda registrado en el gimnasio
    - El número de clientes del gimnasio aumenta


# FAse 6.1 diseño técnico

### Clases del sistema
- Gimnasio
- Cliente
- Entrenador
- Main

### Clase Cliente - representa a una persona, guarda sus propios datos, conoce a su entreador (si lo tiene)
- nombre
- dni
- edad
- telefono
- email
- tipomembresia
- entrenador

Métodos:
- getters y setters

### Clase Entrenador. - representa a una persona, tiene clientes asignados
- nombre
- codigoEntrenador
- edad
- telefono
- email
- especialidad
- experiencia
- clientesAsignados

Métodos.
- agregarCliente
- getters y setters

Aqui aparece una relacion: un entrenador puede tener muchos clientes

### Clase Gimnasio. Cerebro del sistema

- clientes
- entrenadores
- contadorClientes
- contadorEntrenadores

Métodos:
- agregarCliente
- agregarEntrenador
- asignarEntrenador
- mostrarClientes
- mostrarEntrenadores

Aquí vive la lógica, se controlan límites, se hacen asignaciones de los entrenadores para los clientes.

### Clase Main
- mostrar menu
- pedir datos al usuario
- Llamar a los métodos del gimnasio

No guarda clientes, no valida aforos, no asigna entrenadores.

### PUNTO DE CONTROL
- ¿Cada clase tiene una responsabilidad clara? Si
- ¿POdría explicar pra qué sirve cada clase en una frase? Si
- ¿No hay lógica "rara" en el Cliente o Main? No


### Fase 6.2 Diseño técnico detallado

### Clase Cliente
Atributos:
- String nombre
- String dni
- int edad
- String telefono
- String email
- int tipomembresia
- Entrenador entrenador
Métodos:
- Constructor con todos los atributos(excepto entrenador)
- get/set de todos los atributos

### Clase Entrenador
Atributos:
- String nombre
- int codigoEntrenador
- int edad
- String telefono
- String email
- String especialidad
- int experiencia
- Cliente[] clientesAsignados
- int contadorClientes
Métodos:
- Constructor con todos los atributos
- agregarCliente (Cliente cliente) //no agrega clientes, los añade a su lista
- get/set de atributos

### Clase Main
Responsabilidad:
- Mostrar menu
- Pedir datos por teclado
- Crear objetos Cliente y Entrenador
- Llamar a métodos del Gimnasio

Scanner, validaciones de entrada, bucle menu...

## Punto de control
La clase Main crea los clientes
La clase Gimnasio los guarda
La clase Cliente sabe quien es su entrenador
La clase Entrenador mantiene su lista de clientes

### Fase 7- ORDEN DE IMPLEMENTACIÓN 
El objetivo es programar sin bloqueos, probar cada paso y llegar al Main con tdo sólido.
Como regla general: de lo simple a lo complejo. De lo que no depende de nadie a lo que depende de todos.

### Clase Cliente.
Empiezo por aqui porque no depende de ninguna otra lógica, es una clase de datos pura y si esto falla, todo falla.
Hay que crear el cliente, declarar los atributos, crear el constructor y los getters/setters. Es opcional pero recomendable crear un toString(). 
El planteamiento es crear un Cliente en una prueba rápida (o en el main temporal). Mostrar sus datos y ver que todo se asigna bien. 


