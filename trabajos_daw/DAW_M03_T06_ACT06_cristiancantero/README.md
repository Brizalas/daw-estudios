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

Errores:

Crea bien la carpeta y el archivo, pero cuando escribo dentro del archivo se genera otro archivo .txt fuera de la carpeta en la raiz del proyecto y es ahí donde se produce la escritura. No se si es un tema de rutas.

update: Estaba confundido, no estaba usando el objeto File sino la variable texto, por eso fallaba el programa. 
Correjido, primera funcion crearArchivo() está operativa.