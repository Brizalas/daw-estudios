### Ejercicio 06 lectura secuencial y escritura de la información.
Ejercicio01.java: 

muestra por consola un menú con las siguientes opciones (y programa cada opción en una función aparte) teniendo presente que si no existe una carpeta de nombre “archivos” ubicada en la carpeta del proyecto, se cree de manera que quedará en la misma carpeta que las carpetas src .
Las opciones del menú serán:

- Nuevo Archivo debe llamar a una función que pida un nombre de archivo al usuario y cree un archivo con el nombre indicado dentro de la carpeta de nombre “archivos” ubicada en la carpeta del proyecto, y que rellene el archivo con un texto introducido por el usuario.
- Listar Archivos debe llamar a una función que muestre los nombres de archivos (sin carpetas) dentro de la carpeta “archivos” numerados: ej: 1 - Archivo1.txt  2 - Archivo2.txt .. y retorne un array con las rutas de los archivos. 
- Muestra un Archivo debe de llamar a ListarArchivos para mostrar los archivos disponibles  y permitir al usuario elegir qué documento quiere ver según su número y mostrar el contenido del documento por consola.
- Borrar un Archivo debe llamar a una función que muestre los archivos dentro de la carpeta “archivos” numerados y permitir al usuario elegir qué documento quiere borrar según su número.
- Renombrar un Archivo: debe mostrar los archivos dentro de la carpeta “archivos” numerados y permitir al usuario elegir qué documento quiere renombrar según su número. A continuación, le pregunte el nuevo nombre y lo renombre si es válido, es decir, si no está repetido. Si es un nombre inválido se debe mostrar un mensaje por consola al usuario y volver a ejecutar el menú.
- Salir: debe terminar el programa. Si el usuario selecciona una opción no contemplada se tiene que volver a mostrar el menú.

## Funciones
3/3/2026
crearArchivo(Scanner sc)
He conseguido crear la función. Crea la carpeta y el nombre del archivo. También te devuelve la ruta absoluta del archivo. Cuando crea el archivo y el user introduce un texto la función cierra diciendo que es lo q has escrito.
Cosas q mejorar: 
El usuario tiene que poner la extensión .txt a mano
Creando la opción de escribir en el archivo de texto me doy cuenta de que es una función un poco larga con varias responsabilidades dentro de la misma, puede que convenga separarlas. 

Error de la función:

Crea bien la carpeta y el archivo, pero cuando escribo dentro del archivo se genera otro archivo .txt fuera de la carpeta en la raiz del proyecto y es ahí donde se produce la escritura. No se si es un tema de rutas.

update: No estaba usando el objeto File sino la variable texto, por eso el programa no se comportaba como se esperaba. 
Correjido, primera funcion crearArchivo() está operativa.✅

5/3/2026

listarArchivo()
Esta función tiene que entrar en la carpeta "archivos" buscar los .txt y devolver el número o el listado de nombres.

Como estamos trabajando con objetos File existen métodos que nos permiten solucionar cosas:

- listFiles() devuelve todos los objetos File

- isFile() devuelve true solo si representa un archivo normal. Si es una carpeta devuelve false.
a.txt -> true
c.jpg -> false
subcarpeta/ -> false

- getName() este es un método directo para obtener el nombre del archivo sin la ruta.
si tenemos File f = new File();
entonces:
f.getName();
esto devolverá un string como "archivo1.txt" No la ruta completa, solo el nombre.

El método getName() solo devuelve un nombre pero si quiero la extensión me interesa solo como termina el texto...
Necesito un método para saber como termina un texto

- endsWith() Pertenece a la clase String. Comprueba si un texto termina con algo concreto

14/3/26

mostrarArchivos (Scanner sc)
Esta función tiene que recorrer la carpeta archivo en busca del docu .txt que el usuario haya indicado.
Depende directamente de la función listarArchivos()
- Genera un array File para alamcenar la funcion listarARchivos() y asi poder usarla.
- Comprueba si la carpeta está vacía antes de nada
- Pide al usuario el nombre del archivo uqe quiere ver
- Recorre con un for each la carpeta re-utilizando la función listarArchivos()
- Se utiliza una bandera booleana para saber si se ha encontrado el archivo
- Si es true se muestra el archivo si es false se inidica que ese archivo no está ahí.