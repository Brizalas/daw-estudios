
## Fase 1. Entender y reinterpretar el enunciado.

Este proyecto pretende desarrollar una aplicación que gestione los entrenadores y clientes de un gimnasio. Tiene que mantener clientes y entrenadores en memória. Permitiendo altas, bajas, asignaciones y consultas mediante un menú. 

## Fase 2. Identificar ENTIDADES(sustantivos)
Regla: 
- Sustantivo => posible clase
- Acción => Será método
# ENTIDADES(nombres en singular, una clase representa una cosa, no una colección)
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

### Fase 4. Flujo general del programa

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



