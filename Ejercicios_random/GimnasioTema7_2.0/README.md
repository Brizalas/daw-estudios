
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
- constructor con el array de clientes (10) definido y el contadorClientes inicializado.
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
**Nota de diseño:**

El atributo `entrenador` no se inicializa en el constructor de la clase `Cliente`.
La asignación del entrenador se realiza posteriormente mediante un método específico,
ya que el flujo del programa establece que primero se crea el cliente y más adelante
se le asigna un entrenador desde la clase `Gimnasio`.

Por este motivo, el constructor de `Cliente` inicializa el atributo `entrenador` a `null`.


### Clase Entrenador
Seguimos por aqui porque entrenador es la otra pata del banco aunque todavía no es el cerebro. El entrenador tiene que tener actualizada la lista de clientes asignados. Sin clientes no hay entrenadores para asignar. 
Hay que crear el entrenador, declarar los atributos, crear constructor, getters y setters. También por si acaso crearemos un método toString().
Crearé la clase y le haré pruebas con cliente aunque sea en el main temporal.

Quiero hacer especial enfasis en getter y setter de Cliente[]clienteAsignado porque tienen una sintaxis ligeramente diferente:

- getter:
public Cliente[] getClienteAsignado(){
return clienteAsignado;
}
- setter:
public void setClienteAsignado(Cliente[]clienteAsignado){
this.clienteAsignado = clienteAsignado
}

Constructores:
El array de clientes y su contador forman parte del estado interno del entrenador. Por tanto, se inicializan dentro del constructor y no se pasan como parámentros.

### Clase Gimnasio

Actua como núcleo del sistema. Es la responsbla de almacenar clientes y entrenadores, y de coordinar las relaciones entre ellos.

### atributos
- Cliente[] clientes
- Entrenador[] entrenadores
- int contadorClientes
- int contadorEntrenadores

#### constructor:
- Inicializa el array de clientes (100)
- Inicializa el array de entrenadores (10)
- Inicializa ambos contadores a 0

#### métodos:
- agregarCliente (Cliente cliente)
- agregarEntrenador (Entrenador entrenador)
- asignarEntrenador (String dniCliente, int codigoEntrenador)
- mostrarClientes()
- mostrarEntrenadores()

Responsabilidad de la clase:
- No pide datos
- no scanner, no souts. 
Recibe objetos o identificadores:
- recibe Cliente
- recibe Entrenador
- recibe dni, codigo etc..
Solo hace lógica:
- guarda
- busca
- asigna
- muestra info ya preparada

Gimnasio necesita comprobar si hay clientes, si hay entrenadores y si estos tienen clientes asignados.
Usa los dos arrays, tanto el de clientes como el de entrenadores
Y toca los dos contadores porque le toca hacer las asignaciones

#### Diseño de los métodos
- agregarCliente(Cliente cliente){} Este método recibe por parametros un objeto Cliente que de nombre se llamara cliente (veáse el cambio de mays a minuscula en el nombre). Primero comprueba el contador para saber si el array está lleno, de esta forma no lo recorre entero si noque "se fia" del contador para recorrerlo. Si el contador lo permite agregará un cliente nuevo en la posicion correspondiente del array y aumenta su contador en 1. 

- agregarEntrenador(Entrenador entrenador){} sigue exactamente los mismos pasos de agregarCliente. Usando su contador y agregandolo si el contador nos dice que el array nos lo permite. Si el contador lo permite agregará un entrenador nuevo en su posición del array y sumará 1 a su contador.

- asignarEntrenador(String dniCliente, int codigoEntrenador) Buscará el cliente por su dni, buscará al entrenador por el códigoEntrenador. Comprobará que el entrenador tenga espacio. Realiza la asignacion en ambos sentidos (No pregunta nada, eso lo hace el Main)

- mostrarClientes() usará un bucle for para recorrer el array del objeto y muestra la información de clientes.
inicio bucle for. Se crea una instancia de Cliente. Se hacen los souts correspondientes obteniendo el nombre, dni etc con el método get. Se implementa un if para la membresía. 

- mostrarEntrenadores() usará un bucle for para mostrar los entrenadores y muestra la información de los entrenadores. También usará otro bucle for para mostrar los clientes en caso de que los tenga asignados.

### clase main
esta clase solo tiene el bucle de entrada y salida, y los métodos que serán llamados. Evitaremos los case biblia para dejar lo más limpio y legible posible toda la clase. 

flujo:
El método necesita crear una instancia de Gimnasio proque es quien controla todo. Gimnasio gimnasio = new Gimnasio();
Método Scanner para introducir datos de usuario
Un boleano para tener una bandera.
do/while try/catch y menú switch/case para controlar las decisiones del usuario. El case 0 que sirve para salir lo hace validando la bandera booleana y usando break. 

#### métodos estaticos dentro del main. 
En este caso y por una cuestión de estudio voy a usar los métodos dentro de esta misma query. En condiciones reales debería utilizar otra query para ingresar los métodos ahí y llamarlos desde el main:
controllerApp.registrarCliente(sc,Gimnasio);
