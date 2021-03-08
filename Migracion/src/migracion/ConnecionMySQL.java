
package migracion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnecionMySQL 
{
//        // Librería de MySQL
//    public String driver = "com.mysql.jdbc.Driver";
//
//    // Nombre de la base de datos
//    public String database = "seguros";
//
//    // Host
//    public String hostname = "localhost";
//
//    // Puerto
//    public String port = "3306";
//
//    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
//    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database ;
//
//    // Nombre de usuario
//    public String username = "Jahir";
//
//    // Clave de usuario
//    public String password = "14121991";
//
//    public ConnecionMySQL() {
//        Connection conn = null;
//
//        try {
//            Class.forName(driver);
//            conn = DriverManager.getConnection(url, username, password);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }        
//    }
//    public static void main(String[] args) {
//        ConnecionMySQL cone = new ConnecionMySQL();
//    }
//}

     Connection con;
     String driver = "com.mysql.jdbc.Driver";
     
     String usuario = "root";
     String password = "14121991";
     //String url="jdbc:mysql://localhost/seguros";
     String url ="jdbc:mysql://localhost:3306/seguros";
     String puerto = "3306";
    
     public ConnecionMySQL()
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
    public Connection getCon()
    {
        return con;
    }
    public static void main(String[] args) {
        ConnecionMySQL conect = new ConnecionMySQL();
        if (conect.getCon()== null)
        {
            System.out.println("COnexion fallia");
        }
    }

}