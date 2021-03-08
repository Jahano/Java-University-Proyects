
package Controlador;

import Modelo.DB_Musica_5B;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    
    private static Connection con;
    private static String driver = "org.postgresql.Driver"; 
    private static String usuario = "postgres";
    private static String password = "141291";
    private static String url="jdbc:postgresql://localhost:5432/Musica";    

    public Connect()
    {      
       
        con = null;
        try {
            Class.forName(driver);
            con =(Connection) DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion correcta");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
 /*   public Connection RealizarConexion()
    {
        con = null;
        try {
            Class.forName(driver);
            con =(Connection) DriverManager.getConnection(url,usuario,password);
            
        } catch (Exception e) {
            System.out.println("Error al establecer conexion");
        }
        return con;
        
        
    }*/
    
    public Connection getConecction()
    {
        return con;
    }
    public void desconectar()
    {
        con = null;
    }
    public static void main(String[] args) {
        Connect con = new Connect();
    }
        
}
