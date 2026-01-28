 
### Fase 1. Proyecto.

Este proyecto consiste en desarrollar una aplicación de consola que gestione alumnos y profesores en una escuela de música. 
El sistema debe trabajar en memoria y permitir, mediante un menú, las siguientes operaciones:

- Alta alumnos
- Alta profesores
- Asignación de profesores a los alumnos
- Consulta de alumnos y profesores asignados
- Consulta de profesores y sus alumnos asignados

La aplicación debe funcionar correctamente y cumplir con los principios de la POO.

### Fase 2. Identificación de entidades

Regla a utilizar:
Sustantivo => posible clase
Acción => posible método

Entidades detectadas en singular. No son colecciones.

- Escuela
- Alumno
- Profesor
- Menu conceptual

### Fase 3. Definición de responsabilidades
-Tip: evita clases caóticas y reparte las responsabilidades de forma clara.

#### Clase Escuela. Responsabilidades:
Almacenar alumnos
Almacenar profesores
Asigna profesores a alumnos
Consulta informacion de profesores y alumnos
-- no es responsable de pedir nada por teclado, no muestra menus, no gestiona entradas ni salidas de usuario.

#### Clase Alumno. Responsabilidades:
Almacenar su propia informacion(atributos)
Conocer el profesor que tiene asignado (si es que lo tiene)
-- no es responsable de pedir datos por teclado, mostrar menus, almacenar profesores,  buscar profesores, almacenar alumnos.

#### Clase Profesor. Responsabilidades:
Almacenar su propia informacion (sus atributos)
Conocer que alumno o alumnos tiene asignado en una lista.
-- no es responsable de crear alumnos, pedir datos por teclado o mostrar menus.

#### Main. Responsabilidades:
Mostrar menus, pedir datos al usuario, llamar a los métodos de la escuela.
No es responsable de almacenar datos, aplicar reglas de negocio, buscar o asignar objetos.

### Fase 4. Flujo general del programas

- Arranca
- Se crea una instancia de Escuela
- Se muestra el menu principal
- El usuario selecciona una opción
- Se ejecuta la accion correspondiente
- Se vuelve al menu principal
- El programa finaliza cuando el usuario selecciona "Salir"

# Acciones del menu principal

Acción registrar alumno:

- El usuario selecciona "Registrar alumno"
- El sistema comprueba si hay espacio para almacenarlo
- si no hay espacio imprime un mensaje por consola y vuelve al menu principal
- Se solicita la entrada de datos
- se crea el objeto Alumno
- se añade a Escuela

Acción registrar profesor:

- El usuario selecciona "Registrar profesor"
- El sistema comprueba si hay espacio para su almacenamiento
- Se solicita la entrada de datos
- Si no hay espacio salta mensaje y vuelve al menu pral
- se crea el objeto Profesor
- se añade a Escuela

Acción asignar profesor a alumno
- El usuario selecciona "Asignar profesor"
- Se comprueba que existan alumnos y profesores
- El usuario selecciona "asingar profesor a alumno"
- Se pide al usuario el nombre del alumno
- Se pide al usuario que le asigne un profesor a ese alumno
- El usuario introduce el dni del cliente
- El usuario introduce el codigo del profesor
- La Escuela realiza la asignacion
- Se muestra confirmacion

Accion mostrar alumnos

- El usuario selecciona "Mostrar alumnos"
- Se muestran todos los alumnos y sus profesores registrados

Accion mostrar profesores

- El usuario selecciona "Mostrar profesores"
- Se muestran todos los profesores y sus alumnos registrados

### Fase 5. Caso de uso detallado.
### Fase 6. Diseño técnico.
































