 
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

Salir

- El usuario selecciona "salir"
- El programa termina

### Fase 5. Caso de uso detallado.

#### caso de uso: Registrar cliente

Precondiciones:
- El programa está en ejecución
- Existe una instancia de escuela

Flujo pral:

- El usuario selecciona "asignar profesor a alumno"
- El sistema pide el dni del cliente. Lo guarda.
- El sistema pide el codigo del profesor. Lo guarda.
- El sistema comprueba si el profesor tiene espacio. Si no lo tuviera salta un mensaje. Y vuelve a darle la opcion de escoger profesor.
- El sistema empareja la referencia de las dos variables y queda reflejado en el profesor almacenado y en el alumno almacenado.
- Salta un mensaje de operación realizada correctamente 

### Fase 6. Diseño técnico.

### clases del sistema
- Escuela
- Alumno
- Profesor
- Main

### Alumno

- nombre
- apellido
- dni
- email
- suscripcionActiva
- profesor

Métodos:
- getters y setters

### Profesor

- nombre
- apellido
- codigoProfesor
- instrumento
- experiencia
- contadorAlumnos

Métodos:
- getters y setters
- agregarAlumno

Relación: Un profesor puede tener muchos alumnos

### Escuela (Cerebro del sistema)

- alumnos
- profesores
- contadorAlumnos
- contadorProfesores




Este constructor no necesita parámetros porque la clase puede garantizar por si misma un estado inicial válido. 
(Nota: el estado interno de un objeto son los datos que necesita para cumplir con su responsablidad sin despender del exterior).

Métodos:
- agregarAlumno
- agregarProfesor
- asignarProfesor
- mostrarAlumnos
- mostrarEntrenadores

Dentro de esta clase (Escuela) vive la lógica, se controla límites y se hacen asignaciones de los profesores a los alumnos.

### Main
- muestra el menu
- pide los datos al usuario
- llama a los métodos de Escuela
- metodo registrarAlumnos(sc, escuela)

No guarda los alumnos, no valida los aforos, no asigna profesores.

### PUNTO DE CONTROL
- verificar si cada clase tiene su responsabilidad clara
- trata de explicar cada clase en una frase.

### Fase 6. Diseño técnico detallado.

### Alumno

- String nombre
- String apellido
- String dni
- String email
- int suscripcionActiva
- Profesor profesor
Métodos:
- constructor con todos los atributos excepto profesor
- getters y setters

### profesor

- String nombre
- int codigoProfesor
- String especialidad
- Alumno [] alumnosAsignados
- int contadorAlumnos
Métodos:
- constructor con todos los atribuots
- constructor con el array alumnos definido y el contadorAlumnos inicializado
- agregarAlumno (Alumno alumno) // no los agrega, si no que los añade a su lista
- getters y setters

### Escuela
- Esta clase no tiene atributos, al ser el cerebro del sistema contiene los métodos que harán que Alumno y Profesor pongan a su disposición su información y como trabajarla.

### Main
Responsabilidad:
- mostrar menu
- pedir datos por teclado
- Crear objetos Alumno Profesor
- Llamar a los métodos de Escuela

Scanner, validaciones de entrada, bucle menu..

## control
La clase Main crea los alumnos
La clase Escuela los guarda
La clase Alumno sabe quien es su profesor
La clase profesor mantiene su lista de alumnos

### Fase 7- orden de implementación
El objetivo es programar sin bloqueos,probar cada paso y llegar al Main con todo sólido.
Como regla general: de lo simple a locomplejo. De lo que no depende de nadie a lo que depende de todos.

Orden de implementación:

### Alumno.
No depende de ninguna otra lógica. Es recomendable usar un toString()- 
El atributo profesor no se inicializa en el constructor de la clase alumno.
La asignacion del profesor se realiza posteriormente mediante un método especifico. Ya que el flujo del programa establece que primero se crea el cliente y mas adelante se le asigna un entrenador desde la clase Escuela.
Por este motivo, el constructor de Alumno inicializa el atributo Profesor en null.
### Entrenador
Esta clase es la otra pata del banco que no necesista cerebro. Sin alumnos no hay profesores que asignar. Hay que crear el profesor, declarar los atributos, crear el construcor, getters y setters. Recomendable hacer toString().
Cuidado con la sintaxis de Alumno[] getAlumnoAsignado(){
    return alumnoAsignado;
}
public void setAlumnoAsignado(Alumno[]alumnoAsignado){
    this.alumnoAsignado = alumnoAsignado;
}

El array de alumnos y su contador forman parte del estado interno del profesor. Por tanto, se inicializan dentro del constuctor y no se pasan como parámentros.

### Escuela
Actua como nucleo del sistema. Es la responsable de almacenar alumnos y profesores, y de coordinar las relaciones entre ellos.
Atributos:
- Alumno [] alumno
- Profesor [] profesor
- int contadorAlumnos
- int contadorProfesores

Constructor:
- Inicialza el array alumnos (50)
- inicializa el array profesores (2)
- inicializa los contadores a 0

Métodos:
- agregarAlumno (Alumno alumno)
- agregarProfesor (Profesor profesor)
- asignarProfesor (String dniAlumno, int codigoProfesor)
- mostrarAlumnos(Alumno alu)
- mostrarProfesores(Profesor p)

Responsabilidad de la clase:
- No pide datos
- No scanner, no souts
Recibe objetos o identificadores:
- Recibe Alumno
- Recibe Profesor
- Recibe dni, codigoProfesor..
Solo hace lógica:
- guarda
- busca
- asigna
- muestra info ya preparada

Escuela necesita comprobar si hay alumnos, si hay profesores y si estos tienen alumnos asignados. Usa los dos arrays, tanto el de alumnos como el de profesores.
Y toca los dos contadores porque le toca hacer las asignaciones

### Diseño de los métodos
- agregarAlumno(Alumno alumno) Este método recibe por parametros un objeto Alumno que de nombre se llama alumno. Primero comprueba el contqador para saber si el array esta lleno, de esta forma no lo recorre entero. Se fia del contador.
- agregarProfesor (String dniAlumno, int codigoProfesor) Buscará al alumno por su dni y al entrenador por su codigoEntrenador. Comprueba el espacio y realiza la asignación en ambos sentidos (No pregunta nada, eso lo hace el Main)
- mostrarAlumnos() Usara un bucle for para recorrer el array del objeto y muestra la información de los alumnos. Hay que implementar un if para la suscripción
- mostrarProfesores() Usara un bucle for para recorrer el array del objeto y muestra la información de los profesores

### Main
Bucle de entrada y salida y los métodos llamados usando switch/case. Escuela escuela = new Escuela(); 
Método scanner para pedir los datos
Booleano para tener una bandera.
do/while try/catch para controlar las decisiones del usuario.

### Métodos estaticos dentro del main para acabar de controlar la situación. 


### DOCUMENTACIÓN DE ERRORES CODIFICANDO Y ARREGLO POSTERIOR.
En cada error haremos lo siguiente:
- que quería hacer
- Que escribí
- que está pasando en responsablidad
- qué concepto he aprendido
- Corrección mínima

#### Error 1:
Estamos en la clase Escuela que es el cerebro del programa.

Método agregarAlumno:

public void agregarAlumno(Alumno alu) {
    if (contadorAlumnos <= 15) {
        System.out.println("Aforo completo");
    } else {
        alumnos[contadorAlumnos] = alu;
        contadorAlumnos++;
    }
}

ESTO ESTA MAL!!! 

La idea mental correcta es: Si el array esta lleno => no añadir. Si hay espacio => añadir alumno y aumentar el contador.
Lo que pasa en realidad es que el array new Alumno[15] da posiciones válidas del 0 al 14, la capacidad total es 15. Cuando el contadorAlumnos == 15 el array está lleno. Yo lo puse menor o igual... error de libro, de escribir automáticamente sin razonar. Detente, piensa...

CONCEPTO CLAVE A APRENDER. El contador indica la siguiente posición libre, no la última ocupada. Y ademas, nunca debo comparar con números fijos, siempre compararlo con el tamaño del array. Es un concepto que se repite en todos los lenguajes.

Correción mínima:

if (contadorAlumnos >= alumnos.length){
    sout("aforo completo")
}else{
    alumnos[contadorAlumnos]= alu;
    contadorAlumnos ++;
}
#### ERROR 2:
 
 Método asignarProfesor:
 
 public void asignarProfesor(String dniAlumno, int codigoProfesor) {
    Alumno alumnoEncontrado = null;
    Profesor profesorEncontrado = null;

    for (int i = 0; i < contadorAlumnos; i++) {
        if (alumnos[i].getDni().equalsIgnoreCase(dniAlumno)) {
            alumnos[i] = alumnoEncontrado;
            break;
        }
    }
}

ESTO ESTÁ MAL!!

Lo que quería hacer: Recorrer el array de alumnos, encontrar el alumno cuyo DNI coincide, guardar la referencia y usarla más tarde para asignarla a un profesor. Cuando encuentre esa referencia lo guardo en alumnoEncontrado. He escrito esta línea:

alumnos[i] = alumnoEncontrado; ===>> ESTO ESTÁ MAL

alumnoEncontrado vale null y no lo inicialicé así. Esta línea significa lo siguiente: en la posicion i del array mete null. 
Es decir, no guardo el alumno, lo estoy borrando del array y, ademas, sigo sin guardar nada. De esta manera después del bucle alumnoEncontrado sigue null, el array puede perder datos y el error es muy traicionero porque no se ve hasta más tarde. Todo apunta a un fallo de dirección mental por mi parte...

Concepto clave: Buscar no es asignar el array, es copiar una referencia del array a una variable. 
Yo quería leer el array pero codifiqué como si lo quisiera modificar. La dirección correcta del flujo es ARRAY => VARIABLE. No al revés.

Método corregido:

 public void asignarProfesor(String dniAlumno, int codigoProfesor) {
        Alumno alumnoEncontrado = null; ===>>>> ESTE ES EL ARRAY
        Profesor profesorEncontrado = null;
        //for para buscar al alumno
        for (int i = 0; i < contadorAlumnos; i++) {
            if (alumnos[i].getDni().equalsIgnoreCase(dniAlumno)) {
                alumnoEncontrado = alumnos[i]; //===>>> ESTO ESTÁ BIEN
                break;
            }
        }
        //for buscar profesores
        for (int i = 0; i < contadorProfesores; i++) {
            if (profesores[i].getCodigoProfesor() == (codigoProfesor)) {
                 profesorEncontrado= profesores[i];
                break;
            }
        }
        //comprobación de seguridad
        if (alumnoEncontrado == null) {
            System.out.println("No existe este alumno");
        }
        if (profesorEncontrado == null) {
            System.out.println("No existe este profesor");
        }

        //asignacion
        
        alumnoEncontrado.setProfesor(profesorEncontrado);
        profesorEncontrado.agregarAlumno(alumnoEncontrado);
    }






























