
package ACT14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author cristiancantero
 */
public class GestionBDD {
    public static void main(String[] args) {
        
        try{
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "12345678";
        
        Connection con = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void crearBDD(Connection con){ //falta documentar!!
        try{
           String sql = "CREATE DATABASE IF NOT EXISTS escuela;";
           con.createStatement().executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
    
    
}
