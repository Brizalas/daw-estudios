package ACT15;

import javax.persistence.*;
import java.util.Date;



public class Main {
    public static void main(String[] args) {
        //fabrica las conexiones
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/tienda.odb");
        //concexión real con la base de datos
        EntityManager em =emf.createEntityManager();
        
        //Crear objetos
        Producto p = new Producto("Camiseta",20.0,"Ropa");
        Factura f = new Factura(new Date(), 0.0);
        DetalleFacturaCOMPLETA d = new DetalleFacturaCOMPLETA (2,15.0,p,f);
        
        f.getDetalles().add(d);
        
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        
        em.close();
        emf.close(); 
        
        
    }
}
