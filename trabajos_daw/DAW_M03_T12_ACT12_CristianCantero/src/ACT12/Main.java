
package ACT12;
import java.io.*;
/**
 *
 * @author cristiancantero
 */


public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro("George Orwell", "1984", 1949, 19.99);

        // SERIALIZAR
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libros")); 
            oos.writeObject(libro);
            oos.close();
            System.out.println("Libro guardado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // DESERIALIZAR
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libros"));
            Libro libroLeido = (Libro) ois.readObject();
            ois.close();

            System.out.println("Libro recuperado:");
            System.out.println("Titulo: " + libroLeido.getTitulo());
            System.out.println("Autor: " + libroLeido.getAutor());
            System.out.println("Año: " + libroLeido.getAnyo());
            

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}