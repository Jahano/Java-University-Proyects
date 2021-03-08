
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Coneccion {
    
    private static java.sql.Connection con;
    private static String driver = "org.postgresql.Driver"; 
    private static String usuario = "postgres";
    private static String password = "141291";
    private static String url="jdbc:postgresql://localhost:5433/seguros";    

    public Coneccion()
    {      
       
        con = null;
        try {
            
            Class.forName(driver);
            con =(java.sql.Connection) DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion correcta");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
       public java.sql.Connection getCon()
    {
        return con;
    }
}
