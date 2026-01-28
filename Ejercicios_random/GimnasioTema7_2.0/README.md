📋 Proyecto Gimnasio – Documento de diseño y razonamiento
### Fase 1. Comprensión y reinterpretación del enunciado

Este proyecto consiste en desarrollar una aplicación de consola que gestione clientes y entrenadores de un gimnasio.
El sistema debe trabajar en memoria y permitir, mediante un menú, las siguientes operaciones:

Alta de clientes

Alta de entrenadores

Asignación de entrenadores a clientes

Consulta de clientes

Consulta de entrenadores y sus clientes asignados

El objetivo principal no es solo que la aplicación funcione, sino aplicar correctamente los principios de Programación Orientada a Objetos (POO).

### Fase 2. Identificación de entidades

Regla utilizada:

Sustantivo → posible clase

Acción → posible método

Entidades detectadas (en singular)

Gimnasio

Cliente

Entrenador

Menú (conceptual, no como clase independiente)

Cada clase representa una cosa, no una colección.

### Fase 3. Definición de responsabilidades (núcleo de la POO)

El objetivo de esta fase es evitar clases caóticas y repartir responsabilidades de forma clara.

Clase Gimnasio

Responsabilidades:

Almacenar clientes

Almacenar entrenadores

Asignar entrenadores a clientes

Consultar información de clientes y entrenadores

No es responsable de:

Pedir datos por teclado

Mostrar menús

Gestionar entrada/salida de usuario

Clase Cliente

Responsabilidades:

Almacenar su propia información (nombre, DNI, edad, etc.)

Conocer qué entrenador tiene asignado (si lo tiene)

No es responsable de:

Pedir datos por teclado

Mostrar menús

Almacenar otros clientes

Buscar entrenadores

Clase Entrenador

Responsabilidades:

Almacenar su propia información

Mantener una lista de clientes asignados

No es responsable de:

Crear clientes

Pedir datos por teclado

Mostrar menús

Clase Main

Responsabilidades:

Mostrar menús

Pedir datos al usuario

Llamar a los métodos del gimnasio

No es responsable de:

Almacenar datos

Aplicar reglas de negocio

Buscar o asignar objetos

### Fase 4. Flujo general del programa

El programa arranca

Se crea una instancia de Gimnasio

Se muestra el menú principal

El usuario selecciona una opción

Se ejecuta la acción correspondiente

Se vuelve al menú principal

El programa finaliza cuando el usuario selecciona “Salir”

Registrar cliente

El usuario selecciona “Registrar cliente”

El sistema comprueba si hay espacio

Se solicitan los datos del cliente

Se crea el objeto Cliente

Se añade al gimnasio

Se muestra confirmación

Registrar entrenador

El usuario selecciona “Registrar entrenador”

El sistema comprueba si hay espacio

Se solicitan los datos del entrenador

Se crea el objeto Entrenador

Se añade al gimnasio

Asignar entrenador

El usuario selecciona “Asignar entrenador”

Se comprueba que existan clientes y entrenadores

El usuario introduce el DNI del cliente

El usuario introduce el código del entrenador

El gimnasio realiza la asignación

Se muestra confirmación

Mostrar clientes

El usuario selecciona “Mostrar clientes”

Se muestran los datos de todos los clientes registrados

Mostrar entrenadores

El usuario selecciona “Mostrar entrenadores”

Se muestran los entrenadores y sus clientes asignados

### Fase 5. Caso de uso detallado – Registrar cliente

Precondiciones:

El programa está en ejecución

Existe una instancia de Gimnasio

Flujo principal:

El usuario selecciona “Registrar cliente”

El sistema solicita los datos

El usuario introduce los datos

Se crea el cliente

Se añade al gimnasio

Se muestra confirmación

Se vuelve al menú principal

Flujo alternativo:

Si el gimnasio está lleno:

Se muestra mensaje de aforo completo

No se registra el cliente

Se vuelve al menú

Postcondiciones:

El cliente queda registrado

El contador de clientes aumenta

### Fase 6. Diseño técnico
Clases del sistema

Gimnasio

Cliente

Entrenador

Main

Clase Cliente

Representa a una persona.

Atributos:

nombre

dni

edad

telefono

email

tipoMembresia

entrenador

Métodos:

Constructor (sin entrenador)

Getters y setters

Nota de diseño:
El entrenador se inicializa a null, ya que se asigna posteriormente desde el gimnasio.

Clase Entrenador

Representa a una persona que puede tener varios clientes.

Atributos:

nombre

codigoEntrenador

edad

telefono

email

especialidad

experiencia

clientesAsignados

contadorClientes

Métodos:

Constructor

agregarCliente(Cliente cliente)

Getters y setters

El array de clientes y su contador forman parte del estado interno del entrenador.

Clase Gimnasio

Es el núcleo del sistema.

Atributos:

clientes

entrenadores

contadorClientes

contadorEntrenadores

Métodos:

agregarCliente

agregarEntrenador

asignarEntrenador

mostrarClientes

mostrarEntrenadores

Responsabilidad:

Contiene la lógica del sistema

No pide datos

No usa Scanner

No muestra menús

Clase Main

Responsabilidad:

Controlar el flujo del programa

Pedir datos

Llamar a los métodos del gimnasio

Estructura:

Scanner

bucle do/while

switch

métodos auxiliares estáticos (para evitar case biblia)

### Fase 7. Orden de implementación

Clase Cliente

Clase Entrenador

Clase Gimnasio

Clase Main

Regla seguida:

De lo simple a lo complejo
De lo que no depende de nadie a lo que depende de todos

### Conclusión

El ejercicio funciona correctamente y cumple el objetivo técnico.
Lo más importante no ha sido el resultado final, sino el proceso de diseño, especialmente:

Separación de responsabilidades

Uso correcto de objetos existentes

Paso de parámetros

Delegación de lógica al Gimnasio
