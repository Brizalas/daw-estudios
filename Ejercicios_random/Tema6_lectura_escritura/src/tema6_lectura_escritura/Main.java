package tema6_lectura_escritura;

import java.util.Scanner;

/*
Crea un programa en Java que funcione como un administrador de archivos y directorios. 
El programa debe utilizar Streams y Buffers para leer y escribir información, permitir la creación, 
eliminación y renombrado de archivos, la modificación del contenido de un archivo de texto, así como la 
creación de carpetas y la modificación de su contenido.

En esta actividad, crearás un programa en Java que simule el registro de empleados de una empresa. 
El programa permitirá realizar las siguientes acciones:

EJERCICIO 1: Crea los siguientes atributos de un empleado: 
Nombre: String
Apellido: String
Edad: int
Departamento: String
Puesto: String
Dni: String

EJERCICIO 2: Implementa una clase principal llamada "RegistroEmpleados" que contendrá el método main. 
Este método tendrá un menú de opciones que permitirá al usuario seleccionar las siguientes acciones:
Agregar un nuevo empleado al registro. 
Solicitar al usuario que ingrese los datos del empleado (nombre, apellido, edad, departamento y puesto) 
y guardad la información en el archivo "registro.txt".

Mostrar la lista de empleados registrados. 
Leer el contenido del archivo "registro.txt" y mostrad en pantalla los datos de cada empleado almacenado.

Eliminar un empleado del registro. 
Se mostrará el listado de empleados y se le pedirá al usuario que indique el DNI del empleado que se quiere eliminar.


Buscar un empleado por su nombre. 
Solicitar al usuario que ingrese el nombre del empleado a buscar. Leer el archivo "registro.txt" y muestrad 
en pantalla los datos del empleado que coincidan con el nombre ingresado.

Salir del programa. 
Cerrar el programa, asegurando el correcto cierre del archivo que se ha tratado.


* Se tienen que utilizar los conceptos de lectura y escritura de archivos en Java para implementar las 
funcionalidades requeridas. Además, se deben añadir validaciones adicionales, como la gestión de errores o 
la comprobación de duplicados en la lista de empleados.

 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean valido = false;

        do {
            valido = false;
            try {
                System.out.println("Registro de empleados");
                System.out.println("Escoge una opción:");
                System.out.println("1. registrar empleado");
                System.out.println("2. buscar empleado");
                System.out.println("3. borrar empleado");
                System.out.println("0. salir");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        Funciones.registrarEmpleado(sc);
                        break;
                    case 2:
                        Funciones.buscar(sc);
                        break;
                    case 3:
                        break;
                    case 0:

                        System.out.println("Adios");
                        return;
                    default:
                        System.out.println("Introduce una opción válida");
                }

            } catch (Exception e) {
                System.out.println("Error");
                valido = false;
            }
            
        }while(!valido);
        }
}

           
