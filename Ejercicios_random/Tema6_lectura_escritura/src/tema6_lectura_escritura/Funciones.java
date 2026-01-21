
package tema6_lectura_escritura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Funciones {
    
    //funcion para el registro ----------------------------------------------
    
    public static void registrarEmpleado (Scanner sc)throws IOException{
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta+sep+"archivo");
        if(!archivo.exists()){
            System.out.println("Archivo inexistente.");
            System.out.println("Creando archivo...");
            archivo.mkdir();
            System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
        }
        File carpeta = new File(archivo,"registro.txt");
        if(!carpeta.exists()){
            System.out.println("Carpeta inexistente...");
            carpeta.createNewFile();
        }
        
        
        System.out.println("REGISTRO DE EMPLEADOS");
        System.out.println("---------------------");
        System.out.println("nombre: "); String nombre = sc.nextLine();
        System.out.println("apellido: "); String apellido = sc.nextLine();
        System.out.println("Edad: "); int edad = Integer.parseInt(sc.nextLine());
        System.out.println("puesto: "); String puesto = sc.nextLine();
        System.out.println("Departamento: "); String departamento = sc.nextLine();
        
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(carpeta, true))){
            bw.write(nombre+";"+apellido+";"+edad+";"+puesto+";"+departamento);
            bw.newLine();
            
        }
    }
    
    //funcion para la busqueda------------------------------------
    
    public static void buscar(Scanner sc)throws IOException{
        
        String ruta = System.getProperty("user.dir");
        String sep = File.separator;
        File archivo = new File(ruta+sep+"archivo");
        if(!archivo.exists()){
            System.out.println("Archivo inexistente.");
            System.out.println("Creando archivo...");
            archivo.mkdir();
            System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
        }
        File carpeta = new File(archivo,"registro.txt");
        if(!carpeta.exists()){
            System.out.println("Carpeta inexistente...");
            carpeta.createNewFile();
        }
        
        System.out.println("Introduce el nombre a buscar"); 
        String nombreBuscar = sc.nextLine();
        boolean valido = false;
        
        try(BufferedReader br = new BufferedReader(new FileReader(carpeta))){
            String linea;
            while((linea=br.readLine())!=null){
                if(linea.trim().isEmpty()){
                    continue;
                }
                
                String [] datos = linea.split(";");
                if(datos.length!=5){
                    System.out.println("Linea corrupta en " + linea);
                }
                String nombreEncontrado= datos[0].trim();
                if(nombreBuscar.equalsIgnoreCase(nombreEncontrado)){
                    System.out.println("-------------------------");
                    System.out.println("Nombre: " + datos[0].trim());
                    System.out.println("Apellido: " + datos[1].trim());
                    System.out.println("Edad: " + datos[2].trim());
                    System.out.println("Departamento: " + datos[3].trim());
                    System.out.println("Puesto: " + datos[4].trim());
                    System.out.println("-------------------------");
                    System.out.println("");
                    valido = true;
                }
                
            }
        }catch(Exception e){
            System.out.println("Error en la busqueda");
        }
            if(!valido){
            System.out.println("Encontrado correctamente.");
        }
    }
}
